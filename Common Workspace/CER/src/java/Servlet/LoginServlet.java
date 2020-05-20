/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.LoginModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lucas.L.H.H
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
            out.println("<title>Servlet LoginServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
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
        // Getting Session
        HttpSession session = request.getSession();
        // Retrieving the user entered values from the frontend
        String emailAddress = request.getParameter("emailAddress");
        String password = request.getParameter("password");

        // Creating new object of LoginModel class;
        LoginModel loginProcess = new LoginModel();

        // Passing user entered values to the model
        loginProcess.setEmailAddress(emailAddress);
        loginProcess.setPassword(password);

        // Calling the verifyLoginCredentials method and returning the verification status
        String verificationStatus = loginProcess.verifyLoginCredentials();

        // Resetting login credential error messages to initial state, null
        request.setAttribute("loginPasswordIncorrect", null);
        request.setAttribute("loginNoRecordFound", null);

        // Checking the type of verification status returned
        if (verificationStatus == "Document Found - Correct Password - Customer - Attorney") {
            // Login credentials are valid and customer user type or attorney user type
            // Assigning session values
            session.setAttribute("Email", emailAddress);
            // Redirecting to the account dashboard
            response.sendRedirect("Account/Account.jsp");
        } else if (verificationStatus == "Document Found - Correct Password - Officer") {
            // Login credentials are valid and officer user type

            // Sample: sample@cer.com
            String[] emailAddressSplit = emailAddress.split("@");
            String emailAddressSplitPart1 = emailAddressSplit[0]; // Sample: sample            
            String emailAddressSplitPart2 = emailAddressSplit[1]; // Sample: cer.com

            if (emailAddressSplitPart2 == "cer.com") {
                // Assigning session values
                session.setAttribute("Email", emailAddress);
                // Redirecting to the officer dashboard
                response.sendRedirect("Office/Dashboard.jsp");
            }
        } else if (verificationStatus == "Document Found - Correct Password - Admin") {
            // Login credentials are valid and admin user type
            // Assigning session values
            session.setAttribute("Email", emailAddress);
            // Redirecting to the admin dashboard
            response.sendRedirect("Admin/Dashboard.jsp");
        } else if (verificationStatus == "Document Found - Wrong Password") {
            // User document is available but user entered passed in invalid

            request.setAttribute("loginPasswordIncorrect", "TRUE");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.jsp");
            rd.forward(request, response);
        } else if (verificationStatus == "Document Not Found") {
            // User document is not available

            request.setAttribute("loginNoRecordFound", "TRUE");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.jsp");
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
