package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoClient;
import org.bson.Document;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;

public final class Case_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>CER - Home</title>\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"assets/externalLibraries/bootstrap-v4.4.1/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"assets/css/justified-nav.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            .nav-item.dropdown:hover .dropdown-menu {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"icon\" href=\"assets/images/favicon.png\" type=\"image/png\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"masthead\">\n");
      out.write("                <h3 class=\"text-muted\">Court Electronic Record system (CERs)</h3>\n");
      out.write("                <nav class=\"navbar navbar-expand-md navbar-light bg-light rounded mb-3\">\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\"\n");
      out.write("                            aria-controls=\"navbarCollapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("                        <ul class=\"navbar-nav text-md-center nav-justified w-100\">\n");
      out.write("                            <li class=\"nav-item active\">\n");
      out.write("                                <a class=\"nav-link\" href=\"Home.html\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"Case.html\">Find a Case</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"Document.html\">Request Case Documents</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"Services.html\">Services</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"About.html\">About</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" id=\"dropdown01\" data-toggle=\"dropdown\"\n");
      out.write("                                   aria-haspopup=\"true\" aria-expanded=\"false\">Account</a>\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"Login.html\">Login</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"Register.html\">Register</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <!-- Jumbotron -->\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-auto\">\n");
      out.write("                        <h2>Find a Case</h2>\n");
      out.write("                        <p class=\"text-left\">Insert Your Case Number</p>\n");
      out.write("                        <p></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <form name=\"CaseNoSearch\" method=\"post\" action=\"Case.jsp\">\n");
      out.write("                        <input type=\"text\" name=\"CaseNo\" class=\"form-control bg-white\" placeholder=\"Case Number\" >\n");
      out.write("                        <button type=\"submit\" class=\"btn-sm btn-outline-secondary\">Search</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <h4>Or by Court Location</h4>\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <form name=\"CaseLocationSearch\" method=\"post\" action=\"Case.jsp\">\n");
      out.write("                        <input type=\"text\" name=\"CourtLocation\" class=\"form-control bg-white\" placeholder=\"Court Location\">\n");
      out.write("                        <button type=\"submit\" class=\"btn-sm btn-outline-secondary\">Search</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <h2>Search Results</h2>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");


                    String CourtLocation = request.getParameter("CourtLocation");
                    String CaseNumber = request.getParameter("CaseNumber");
                    MongoClient mongoClient = MongoClients.create("mongodb://admin:p5Dy6BoofEB9JAeB@cers-shard-00-00-qwvj6.mongodb.net:27017,cers-shard-00-01-qwvj6.mongodb.net:27017,cers-shard-00-02-qwvj6.mongodb.net:27017/test?ssl=true&replicaSet=CERs-shard-0&authSource=admin&retryWrites=true&w=majority");
                    MongoDatabase database = mongoClient.getDatabase("CERdb");

                    MongoCollection<Document> collection = database.getCollection("cases");
//                    if (CaseNumber != null) {
                        BasicDBObject query = new BasicDBObject();
                        query.put("CaseNo", "'" + CaseNumber + "'");
                        FindIterable document = collection.find(query);
                        ArrayList<Document> docs = new ArrayList<Document>();
                        document.into(docs);
                        PrintWriter writer = response.getWriter();

                        for (Document doc : docs) {
                            System.out.println(doc);
                            String htmlRespone = "<html>";
                            htmlRespone += "<h2>Search Results : " + doc + "</h2>";
                            htmlRespone += "</html>";
                            writer.println(htmlRespone);

                        }

                    }
//                    if (CourtLocation != null) {
//                        BasicDBObject query = new BasicDBObject();
//                        query.put("CourtLocation", "'" + CourtLocation + "'");
//                        FindIterable document = collection.find(query);
//                        ArrayList<Document> docs = new ArrayList<Document>();
//                        document.into(docs);
//                        PrintWriter writer = response.getWriter();
//
//                        for (Document doc : docs) {
//                            System.out.println(doc);
//                            String htmlRespone = "<html>";
//                            htmlRespone += "<h2>Search Results : " + doc + "</h2>";
//                            htmlRespone += "</html>";
//                            writer.println(htmlRespone);
//
//                        }
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- Example row of columns -->\n");
      out.write("            <!-- Site footer -->\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("                <p class=\"text-center\">&copy; CER</p>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("        <!-- /container -->\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/popper.js\"></script>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
