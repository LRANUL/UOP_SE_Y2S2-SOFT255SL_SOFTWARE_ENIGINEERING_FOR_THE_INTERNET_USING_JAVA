/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import MongoDatabase.login;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hp-Pc
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            /* TODO output your page here. You may use following sample code. */
              String uname= request.getParameter("username");
              String pass= request.getParameter("passw");
              String users_T= request.getParameter("users");       
        if(!uname.equals("") && !pass.equals("") && !users_T.equals(""))
        {
            boolean isUserFound = login.searchUserInDb(uname, pass, users_T);
            if(isUserFound==true) {               
            //creates a specefic session for the user so that all users can't access specific pages
            //HttpSession session= request.getSession();
            //session.setAttribute("username",uname);
            //reditects to this page if the user name and password is correct
            request.getRequestDispatcher("/About.jsp").forward(request, response);
         }else{
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        }
        }
        }
        catch(ArrayIndexOutOfBoundsException ex){
          System.out.print(ex);
        }      
        }
}
