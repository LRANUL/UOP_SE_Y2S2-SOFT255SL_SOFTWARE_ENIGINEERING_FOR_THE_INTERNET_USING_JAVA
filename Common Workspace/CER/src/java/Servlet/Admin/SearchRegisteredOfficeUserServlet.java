/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet.Admin;

import Model.SearchRegisteredOfficeUserModel;
import com.sun.codemodel.JArray;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.json.JsonWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static javax.swing.UIManager.getString;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;


/**
 *
 * @author Lucas.L.H.H
 */
@WebServlet(name = "SearchRegisteredOfficeUserServlet", urlPatterns = {"/Admin/SearchRegisteredOfficeUserServlet"})
public class SearchRegisteredOfficeUserServlet extends HttpServlet {

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
            out.println("<title>Servlet SearchRegisteredOfficeUserServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchRegisteredOfficeUserServlet at " + request.getContextPath() + "</h1>");
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
        
        // Retrieving user entered value from the fronend
        String officerCEREmailAddress = request.getParameter("officerCEREmailAddress");
        
        // Creating new object of SearchRegisteredOfficeUserModel class
        SearchRegisteredOfficeUserModel searchOfficeUser = new SearchRegisteredOfficeUserModel();
        
        // Passing the user enter cerEmailAddres to the model
        searchOfficeUser.setOfficerCEREmailAddress(officerCEREmailAddress);
        
        // Calling the SearchOfficeUser method and returning the JSON object
        JSONObject userDocumentObject = searchOfficeUser.SearchOfficeUser();

        // Checking if a JSON oject was retuend from the model
        if(userDocumentObject != null){
            // A JSON object was returned
            
            request.setAttribute("recordFound", "FOUND");   
            
            JSONObject nameObject = userDocumentObject.getJSONObject("name");
            request.setAttribute("prefix", nameObject.getString("prefix"));
            request.setAttribute("firstName", nameObject.getString("firstName"));
            request.setAttribute("middleName", nameObject.getString("middleName"));
            request.setAttribute("lastName", nameObject.getString("lastName"));
            
            request.setAttribute("accountStatus", userDocumentObject.getString("accountStatus"));
            request.setAttribute("cerId", userDocumentObject.getString("cerID"));
            request.setAttribute("emailAddress", userDocumentObject.getString("emailAddress"));
            request.setAttribute("nic", userDocumentObject.getString("nic"));

            try{
                // Retrieving the registeredDateTime from model and spliting the string to get the UNIX format value
                String registrationDateTimeModel = userDocumentObject.get("registrationDateTime").toString(); // Sample: {"$date":1589852947435}
                String[] DateTimeStringSplitOne = registrationDateTimeModel.split(":");
                String DateTimeStringSplitOnePartOne = DateTimeStringSplitOne[0]; // Sample: {"$date":
                String DateTimeStringSplitOnePartTwo = DateTimeStringSplitOne[1]; // Sample: 1589852947435}

                String[] DateTimeStringSplitTwo = DateTimeStringSplitOnePartTwo.split("}"); // Sample: 1589852947435}
                String registrationDateTimeUNIX = DateTimeStringSplitTwo[0]; // Sample: 1589852947435

                SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy | HH:mm a");
                Date dateTime = new java.util.Date(Long.parseLong(registrationDateTimeUNIX));
                String registrationDateTime = DateFormat.format(dateTime);

                request.setAttribute("registrationDateTime", registrationDateTime);
            }
            catch(Exception ex){
                System.out.println("Error: " + ex);
            }

        }
        else if(userDocumentObject == null){
            // No JSON object was returned
            // Setting recordNotFound to NOT FOUND, to show no record found message in the frontend
            request.setAttribute("recordNotFound", "NOT FOUND");   
        }
        
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/Admin/ManageOfficeUsers.jsp");
        rd.forward(request, response);
                
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
