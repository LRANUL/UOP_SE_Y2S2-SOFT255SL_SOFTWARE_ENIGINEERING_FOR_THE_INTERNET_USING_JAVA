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

/**
 *
 * @author Lucas.L.H.H
 */
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
        
        String prefixName = request.getParameter("prefixName");
        String firstName = request.getParameter("firstName");        
        String middleName = request.getParameter("middleName");     
        String lastName = request.getParameter("lastName");
        String nic = request.getParameter("nic");
        String dateOfBirth = request.getParameter("dataOfBirth");
        String streetAddress = request.getParameter("streetAddress");
        String city = request.getParameter("city");
        String district = request.getParameter("district");
        String zipPostalCode = request.getParameter("zipPostalCode");
        String nicPassportImage = request.getParameter("nicPassportImage");
        String emailAddress = request.getParameter("emailAddress");
        String confirmPassword = request.getParameter("confirmPassword");

        MemberRegistrationModel newUser = new MemberRegistrationModel();
        
        newUser.newCustomerRegistration();
        
        PrintWriter out = response.getWriter();
        
        out.println("<h1 align='center:'>NIC: </h1>" + nic);
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
