/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet.Office;

import static Encryption.PasswordHashing.SALT;
import static Encryption.PasswordHashing.generateHashValue;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.bson.Document;

/**
 *
 * @author ranul
 */
public class Account extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Account</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Account at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Start");

        String Request = request.getParameter("Request");
        String Email = request.getParameter("Email");

        String Password = request.getParameter("Password");
        String streetAddress = request.getParameter("streetAddress");
        String city = request.getParameter("city");
        String zipPostalCode = request.getParameter("zipPostalCode");
        String district = request.getParameter("district");

        if ("OfficerPassword".equals(Request)) {
            System.out.println("OfficerPass");
            MongoClient mongoClient = MongoClients.create("mongodb://admin:p5Dy6BoofEB9JAeB@cers-shard-00-00-qwvj6.mongodb.net:27017,cers-shard-00-01-qwvj6.mongodb.net:27017,cers-shard-00-02-qwvj6.mongodb.net:27017/test?ssl=true&replicaSet=CERs-shard-0&authSource=admin&retryWrites=true&w=majority");
            MongoDatabase database = mongoClient.getDatabase("CERdb");

            MongoCollection collection = database.getCollection("users");
            BasicDBObject query = new BasicDBObject().append("cerEmailAddress", Email);
            BasicDBObject newDocument = new BasicDBObject();
            String saltedPasswordValue = SALT + Password;
            String hashedPasswordValue = generateHashValue(saltedPasswordValue);
            newDocument.append("$set", new BasicDBObject().append("passwordHash", hashedPasswordValue));
            collection.updateOne(query, newDocument);
            RequestDispatcher rd = getServletContext().getRequestDispatcher(
                    "/Office/Settings.jsp");
            rd.forward(request, response);
        }
        if ("CustomerAddress".equals(Request)) {
            System.out.println("CustomerAddress");
            MongoClient mongoClient = MongoClients.create("mongodb://admin:p5Dy6BoofEB9JAeB@cers-shard-00-00-qwvj6.mongodb.net:27017,cers-shard-00-01-qwvj6.mongodb.net:27017,cers-shard-00-02-qwvj6.mongodb.net:27017/test?ssl=true&replicaSet=CERs-shard-0&authSource=admin&retryWrites=true&w=majority");
            MongoDatabase database = mongoClient.getDatabase("CERdb");

            MongoCollection collection = database.getCollection("users");
            BasicDBObject query = new BasicDBObject().append("emailAddress", Email);
            BasicDBObject newDocument = new BasicDBObject();
            newDocument.append("$set", new BasicDBObject().append("address",
                            new Document("streetAddress", streetAddress)
                                    .append("city", city)
                                    .append("zipPostalCode", zipPostalCode)
                                    .append("district", district)));
            collection.updateOne(query, newDocument);
            RequestDispatcher rd = getServletContext().getRequestDispatcher(
                    "/Account/Settings.jsp");
            rd.forward(request, response);
        }
        if ("CustomerPassword".equals(Request)) {
            System.out.println("CustomerPass");
            MongoClient mongoClient = MongoClients.create("mongodb://admin:p5Dy6BoofEB9JAeB@cers-shard-00-00-qwvj6.mongodb.net:27017,cers-shard-00-01-qwvj6.mongodb.net:27017,cers-shard-00-02-qwvj6.mongodb.net:27017/test?ssl=true&replicaSet=CERs-shard-0&authSource=admin&retryWrites=true&w=majority");
            MongoDatabase database = mongoClient.getDatabase("CERdb");

            MongoCollection collection = database.getCollection("users");
            BasicDBObject query = new BasicDBObject().append("emailAddress", Email);
            BasicDBObject newDocument = new BasicDBObject();
            String saltedPasswordValue = SALT + Password;
            String hashedPasswordValue = generateHashValue(saltedPasswordValue);
            newDocument.append("$set", new BasicDBObject().append("passwordHash", hashedPasswordValue));
            collection.updateOne(query, newDocument);
            RequestDispatcher rd = getServletContext().getRequestDispatcher(
                    "/Account/Settings.jsp");
            rd.forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
