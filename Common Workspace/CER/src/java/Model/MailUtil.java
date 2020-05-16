/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ranul
 */
public class MailUtil {

    public static void SendEmailAvailable(String receiveremail) throws MessagingException, Exception {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String AdminMail = "cers.developer@gmail.com";
        String AdminMailPass = "43dh!dw_23@c";
        Session session;
        session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(AdminMail, AdminMailPass);
            }
        });
        Message message = availableMessage(session, AdminMail, receiveremail);
        Transport.send(message);
        System.out.println("Sent!");
    }

    private static Message availableMessage(Session session, String AdminMail, String receiveremail) throws Exception, MessagingException {

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(AdminMail));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(receiveremail));
        message.setSubject("CERs - Order Request");
        message.setContent("<html><body>"+
                "<h1>Order Accepted</h1>"+
                "<p>This email is to let you know that your order is accepted fro processing.</p>"+
                "<br><b>CERs Team</b>", "text/html");
        return message;
    }
    
    public static void SendEmailUnAvailable(String receiveremail) throws MessagingException, Exception {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String AdminMail = "cers.developer@gmail.com";
        String AdminMailPass = "43dh!dw_23@c";
        Session session;
        session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(AdminMail, AdminMailPass);
            }
        });
        Message message = unavailableMessage(session, AdminMail, receiveremail);
        Transport.send(message);
        System.out.println("Sent!");
    }

    private static Message unavailableMessage(Session session, String AdminMail, String receiveremail) throws Exception, MessagingException {

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(AdminMail));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(receiveremail));
        message.setSubject("CERs - Order Request");
        message.setContent("<html><body>"+
                "<h1>Order has be Denied</h1>"+
                "<p>This email is to let you know that your order has been denied, due not documents not found, call us for further information.</p>"+
                "<br><b>CERs Team</b>", "text/html");
        return message;
    }

}
