/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.MemberRegistrationModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucas.L.H.H
 */
@WebServlet(name = "AttorneyRegistrationServlet", urlPatterns = {"/AttorneyRegistrationServlet"})
public class AttorneyRegistrationServlet extends HttpServlet {

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
            out.println("<title>Servlet AttorneyRegistrationServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AttorneyRegistrationServlet at " + request.getContextPath() + "</h1>");
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
        String attorneyId = request.getParameter("attorneyId");
        String streetAddress = request.getParameter("streetAddress");
        String city = request.getParameter("city");
        String district = request.getParameter("district");
        String zipPostalCode = request.getParameter("zipPostalCode");
        String attorneyIdImage = request.getParameter("attorneyIdImage");
        String emailAddress = request.getParameter("emailAddress");
        String confirmPassword = request.getParameter("confirmPassword");

        // Creating new object of MemberRegistrationModel class
        MemberRegistrationModel newUser = new MemberRegistrationModel();
        
        // Passing the user entered values to the model 
        newUser.setPrefixName(prefixName);
        newUser.setFirstName(firstName);
        newUser.setMiddleName(middleName);
        newUser.setLastName(lastName);
        newUser.setNIC(nic);
        newUser.setAttorneyId(attorneyId);
        newUser.setStreetAddress(streetAddress);
        newUser.setCity(city);
        newUser.setDistrict(district);
        newUser.setZipPostalCode(zipPostalCode);
        newUser.setAttorneyIdImage(attorneyIdImage);
        newUser.setEmailAddress(emailAddress);
        newUser.setConfirmPassword(confirmPassword);
        
        // Calling function throught the newly created object
        newUser.newCustomerRegistration();

        /*
        PrintWriter out = response.getWriter();
        out.println("<h1 align='center:'>NIC: </h1>" + prefixName);   
        out.println("<h1 align='center:'>NIC: </h1>" + firstName); 
        out.println("<h1 align='center:'>NIC: </h1>" + middleName); 
        out.println("<h1 align='center:'>NIC: </h1>" + lastName); 
        out.println("<h1 align='center:'>NIC: </h1>" + nic); 
        out.println("<h1 align='center:'>NIC: </h1>" + dateOfBirth); 
        out.println("<h1 align='center:'>NIC: </h1>" + streetAddress); 
        out.println("<h1 align='center:'>NIC: </h1>" + city); 
        out.println("<h1 align='center:'>NIC: </h1>" + district); 
        out.println("<h1 align='center:'>NIC: </h1>" + zipPostalCode); 
        out.println("<h1 align='center:'>NIC: </h1>" + emailAddress); 
        out.println("<h1 align='center:'>NIC: </h1>" + confirmPassword); 
        out.println("<h1 align='center:'>IMAGE: </h1>" + nicPassportImage);        
        */

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
