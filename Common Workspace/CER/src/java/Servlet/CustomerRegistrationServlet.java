/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.MemberRegistrationModel;
import com.sun.faces.action.RequestMapping;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.file.Paths;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;

/**
 *
 * @author Lucas.L.H.H
 */

@MultipartConfig
@WebServlet(name = "CustomerRegistrationServlet", urlPatterns = {"/CustomerRegistrationServlet"})
public class CustomerRegistrationServlet extends HttpServlet {

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
            out.println("<title>Servlet CustomerRegistrationServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CustomerRegistrationServlet at " + request.getContextPath() + "</h1>");
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
        
        // processRequest(request, response);
       
        // Retrieving user enter values from frontend
        String prefixName = request.getParameter("prefixName");
        String firstName = request.getParameter("firstName");        
        String middleName = request.getParameter("middleName");     
        String lastName = request.getParameter("lastName");
        String nic = request.getParameter("nic");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String streetAddress = request.getParameter("streetAddress");
        String city = request.getParameter("city");
        String district = request.getParameter("district");
        String zipPostalCode = request.getParameter("zipPostalCode");
        Part nicPassportImage = request.getPart("nicPassportImage");        
        String emailAddress = request.getParameter("emailAddress");
        String confirmPassword = request.getParameter("confirmPassword");

        // Creating new object of MemberRegistrationModel class
        MemberRegistrationModel newCustomerUser = new MemberRegistrationModel();
        
        // Passing the user entered values to the model 
        newCustomerUser.setPrefixName(prefixName);
        newCustomerUser.setFirstName(firstName);
        newCustomerUser.setMiddleName(middleName);
        newCustomerUser.setLastName(lastName);
        newCustomerUser.setNIC(nic);
        newCustomerUser.setDateOfBirth(dateOfBirth);
        newCustomerUser.setStreetAddress(streetAddress);
        newCustomerUser.setCity(city);
        newCustomerUser.setDistrict(district);
        newCustomerUser.setZipPostalCode(zipPostalCode);
        newCustomerUser.setNICPassportImage(nicPassportImage);
        newCustomerUser.setEmailAddress(emailAddress);
        newCustomerUser.setConfirmPassword(confirmPassword);
        
        // Calling function to register new member and returning the registration status (TRUE or FALSE)
        Boolean registrationStatus = newCustomerUser.newCustomerRegistration();
        
        PrintWriter out = response.getWriter();
        
        if(registrationStatus == true){
            out.println("<script type=\"text/javascript\">");
            // Showing an alert box with a registration details sent to officer for review message
            out.println("alert('Registration Details Sent to Officer for Review');");
            // Redirecting to LOGIN webpage
            out.println("location='Login.jsp';");
            out.println("</script>");
        }
        else if(registrationStatus == false){
            // Redirecting to ERROR page
            response.sendRedirect("Register/MemberRegisterError.html");  
        }

        /*
        PrintWriter out = response.getWriter();
        out.println("<h1 align='center:'>prefixName: </h1>" + prefixName);   
        out.println("<h1 align='center:'>firstName: </h1>" + firstName); 
        out.println("<h1 align='center:'>middleName: </h1>" + middleName); 
        out.println("<h1 align='center:'>lastName: </h1>" + lastName); 
        out.println("<h1 align='center:'>nic: </h1>" + nic); 
        out.println("<h1 align='center:'>dateOfBirth: </h1>" + dateOfBirth); 
        out.println("<h1 align='center:'>streetAddress: </h1>" + streetAddress); 
        out.println("<h1 align='center:'>city: </h1>" + city); 
        out.println("<h1 align='center:'>district: </h1>" + district); 
        out.println("<h1 align='center:'>zipPostalCode: </h1>" + zipPostalCode); 
        out.println("<h1 align='center:'>emailAddress: </h1>" + emailAddress); 
        out.println("<h1 align='center:'>confirmPassword: </h1>" + confirmPassword); 
        out.println("<h1 align='center:'>nicPassportImage: </h1>" + nicPassportImage);           
*       */
        

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
