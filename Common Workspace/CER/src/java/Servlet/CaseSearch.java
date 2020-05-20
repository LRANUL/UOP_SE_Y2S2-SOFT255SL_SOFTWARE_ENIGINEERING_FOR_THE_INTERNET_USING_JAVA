/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author ranul
 */
@WebServlet(name = "CaseSearch", urlPatterns = {"/CaseSearch"})
public class CaseSearch extends HttpServlet {

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
            out.println("<title>Servlet CaseSearch</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CaseSearch at " + request.getContextPath() + "</h1>");
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
        String CourtLocation = request.getParameter("CourtLocation");
        String CaseNumber = request.getParameter("CaseNo");

        MongoClient mongoClient = MongoClients.create("mongodb://admin:p5Dy6BoofEB9JAeB@cers-shard-00-00-qwvj6.mongodb.net:27017,cers-shard-00-01-qwvj6.mongodb.net:27017,cers-shard-00-02-qwvj6.mongodb.net:27017/test?ssl=true&replicaSet=CERs-shard-0&authSource=admin&retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("CERdb");

        MongoCollection<Document> collection = database.getCollection("cases");

        if (CaseNumber!=null) {
            BasicDBObject query = new BasicDBObject();
            query.put("CaseNo", CaseNumber);
            FindIterable document = collection.find(query);
            ArrayList<Document> docs = new ArrayList<Document>();
            document.into(docs);
            request.setAttribute("cases", docs);
            RequestDispatcher rd = getServletContext().getRequestDispatcher(
                    "/CaseResults.jsp");
            rd.forward(request, response);
            for (Document doc : docs) {
                System.out.println(doc);
            }

        }

        if (CourtLocation!=null) {
            BasicDBObject query = new BasicDBObject();
            query.put("CourtLocation",  new BasicDBObject("$regex", ".*"+CourtLocation+".*").append("$options", "i"));
            FindIterable document = collection.find(query);
            ArrayList<Document> docs = new ArrayList<Document>();
            document.into(docs);
            request.setAttribute("cases", docs);

            RequestDispatcher rd = getServletContext().getRequestDispatcher(
                    "/CaseResults.jsp");
            rd.forward(request, response);
            for (Document doc : docs) {

                System.out.println(doc);
            }

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
