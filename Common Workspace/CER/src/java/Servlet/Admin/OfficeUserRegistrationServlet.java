/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet.Admin;

import Model.MemberRegistrationModel;
import Model.OfficeUserRegistrationModel;
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
@WebServlet(name = "OfficeUserRegistrationServlet", urlPatterns = {"/OfficeUserRegistrationServlet"})
public class OfficeUserRegistrationServlet extends HttpServlet {

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
            out.println("<title>Servlet OfficeUserRegistrationServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet OfficeUserRegistrationServlet at " + request.getContextPath() + "</h1>");
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
        
        // Retrieving user entered valus from the frontend
        String prefixName = request.getParameter("prefixName");
        String firstName = request.getParameter("firstName");
        String middleName = request.getParameter("middleName");
        String lastName = request.getParameter("lastName");
        String nicNumber = request.getParameter("nicNumber");
        String cerId = request.getParameter("cerId");
        String cerEmailAddress = request.getParameter("cerEmailAddress");
        String reenterPassword = request.getParameter("reenterPassword");
        
        // Creating new object of OfficeUserRegistrationModel class
        OfficeUserRegistrationModel newOfficeUser = new OfficeUserRegistrationModel();
        
        // Passing the user entered values to the model 
        newOfficeUser.setPrefixName(prefixName);
        newOfficeUser.setFirstName(firstName);
        newOfficeUser.setMiddleName(middleName);
        newOfficeUser.setLastName(lastName);
        newOfficeUser.setNICNumber(nicNumber);        
        newOfficeUser.setCERId(cerId);        
        newOfficeUser.setCEREmailAddress(cerEmailAddress);        
        newOfficeUser.setReenterPassword(reenterPassword);
        
        // Calling function to register new office user and returning the registration status (TRUE or FALSE)
        Boolean registrationStatus = newOfficeUser.newOfficeUserRegistration();
        
        PrintWriter out = response.getWriter();
        
        if(registrationStatus == true){
            // Redirecting to LOGIN webpage
         //   response.sendRedirect("Login.jsp");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('New Office Registration was Successful');");
            out.println("location='Admin/ManageOfficeUsers.jsp';");
            out.println("</script>");
         }
        else if(registrationStatus == false){
            // Redirecting to ERROR page
           // response.sendRedirect("Register/MemberRegisterError.html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('New Office Registration was Unsuccessful');");
            out.println("location='Admin/ManageOfficeUsers.jsp';");
            out.println("</script>");
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
