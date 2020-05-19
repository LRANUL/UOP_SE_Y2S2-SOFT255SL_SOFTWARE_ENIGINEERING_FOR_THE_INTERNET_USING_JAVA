package org.apache.jsp.Office;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CaseUpload_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <title>Dashboard - Case</title>\r\n");
      out.write("    <link href=\"../assets/externalLibraries/bootstrap-v4.4.1/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"../assets/css/dashboard.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"icon\" href=\"../assets/images/favicon.png\" type=\"image/png\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background-color: #f0f0f0;\">\r\n");
      out.write("    <nav class=\"navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow\">\r\n");
      out.write("        <a class=\"navbar-brand col-sm-3 col-md-2 mr-0\" href=\"#\">CERs- Officer</a>\r\n");
      out.write("        <ul class=\"navbar-nav px-3\" style=\"background-color: #000000;\">\r\n");
      out.write("            <li class=\"nav-item text-nowrap\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"../Home.jsp\">Sign out</a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <!-- NAV BAR-->\r\n");
      out.write("            <nav class=\"col-md-2 d-none d-md-block bg-light sidebar\">\r\n");
      out.write("                <div class=\"sidebar-sticky\">\r\n");
      out.write("                    <ul class=\"nav flex-column\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link \" href=\"Dashboard.jsp\"> <svg xmlns=\"http://www.w3.org/2000/svg\"\r\n");
      out.write("                                    width=\"24\" height=\"24\" viewbox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\"\r\n");
      out.write("                                    stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\"\r\n");
      out.write("                                    class=\"feather feather-home\">\r\n");
      out.write("                                    <path d=\"M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z\"></path>\r\n");
      out.write("                                    <polyline points=\"9 22 9 12 15 12 15 22\"></polyline>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                Dashboard <span class=\"sr-only\">(current)</span> </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link active\" href=\"CaseUpload.jsp\"><svg xmlns=\"http://www.w3.org/2000/svg\"\r\n");
      out.write("                                    width=\"24\" height=\"24\" viewbox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\"\r\n");
      out.write("                                    stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\"\r\n");
      out.write("                                    class=\"feather feather-file\">\r\n");
      out.write("                                    <path d=\"M13 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V9z\"></path>\r\n");
      out.write("                                    <polyline points=\"13 2 13 9 20 9\"></polyline>\r\n");
      out.write("                                </svg>&nbsp;Cases/Documents</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"Orders.jsp\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\"\r\n");
      out.write("                                    height=\"24\" viewbox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\"\r\n");
      out.write("                                    stroke-linecap=\"round\" stroke-linejoin=\"round\"\r\n");
      out.write("                                    class=\"feather feather-shopping-cart\">\r\n");
      out.write("                                    <circle cx=\"9\" cy=\"21\" r=\"1\"></circle>\r\n");
      out.write("                                    <circle cx=\"20\" cy=\"21\" r=\"1\"></circle>\r\n");
      out.write("                                    <path d=\"M1 1h4l2.68 13.39a2 2 0 0 0 2 1.61h9.72a2 2 0 0 0 2-1.61L23 6H6\"></path>\r\n");
      out.write("                                </svg>&nbsp;Print Orders</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"Customer.jsp\"> <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\"\r\n");
      out.write("                                    height=\"24\" viewbox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\"\r\n");
      out.write("                                    stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-users\">\r\n");
      out.write("                                    <path d=\"M17 21v-2a4 4 0 0 0-4-4H5a4 4 0 0 0-4 4v2\"></path>\r\n");
      out.write("                                    <circle cx=\"9\" cy=\"7\" r=\"4\"></circle>\r\n");
      out.write("                                    <path d=\"M23 21v-2a4 4 0 0 0-3-3.87\"></path>\r\n");
      out.write("                                    <path d=\"M16 3.13a4 4 0 0 1 0 7.75\"></path>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                Customers </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"Search.jsp\"> <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\"\r\n");
      out.write("                                    height=\"24\" viewbox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\"\r\n");
      out.write("                                    stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-bar-chart-2\">\r\n");
      out.write("                                    <line x1=\"18\" y1=\"20\" x2=\"18\" y2=\"10\"></line>\r\n");
      out.write("                                    <line x1=\"12\" y1=\"20\" x2=\"12\" y2=\"4\"></line>\r\n");
      out.write("                                    <line x1=\"6\" y1=\"20\" x2=\"6\" y2=\"14\"></line>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                Search Reports </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"Feedback.jsp\">\r\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"\r\n");
      out.write("                                    fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\r\n");
      out.write("                                    stroke-linejoin=\"round\" class=\"feather feather-message-circle\">\r\n");
      out.write("                                    <path\r\n");
      out.write("                                        d=\"M21 11.5a8.38 8.38 0 0 1-.9 3.8 8.5 8.5 0 0 1-7.6 4.7 8.38 8.38 0 0 1-3.8-.9L3 21l1.9-5.7a8.38 8.38 0 0 1-.9-3.8 8.5 8.5 0 0 1 4.7-7.6 8.38 8.38 0 0 1 3.8-.9h.5a8.48 8.48 0 0 1 8 8v.5z\">\r\n");
      out.write("                                    </path>\r\n");
      out.write("                                </svg>&nbsp;Feedback</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"Settings.jsp\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\"\r\n");
      out.write("                                    height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\"\r\n");
      out.write("                                    stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-settings\">\r\n");
      out.write("                                    <circle cx=\"12\" cy=\"12\" r=\"3\"></circle>\r\n");
      out.write("                                    <path\r\n");
      out.write("                                        d=\"M19.4 15a1.65 1.65 0 0 0 .33 1.82l.06.06a2 2 0 0 1 0 2.83 2 2 0 0 1-2.83 0l-.06-.06a1.65 1.65 0 0 0-1.82-.33 1.65 1.65 0 0 0-1 1.51V21a2 2 0 0 1-2 2 2 2 0 0 1-2-2v-.09A1.65 1.65 0 0 0 9 19.4a1.65 1.65 0 0 0-1.82.33l-.06.06a2 2 0 0 1-2.83 0 2 2 0 0 1 0-2.83l.06-.06a1.65 1.65 0 0 0 .33-1.82 1.65 1.65 0 0 0-1.51-1H3a2 2 0 0 1-2-2 2 2 0 0 1 2-2h.09A1.65 1.65 0 0 0 4.6 9a1.65 1.65 0 0 0-.33-1.82l-.06-.06a2 2 0 0 1 0-2.83 2 2 0 0 1 2.83 0l.06.06a1.65 1.65 0 0 0 1.82.33H9a1.65 1.65 0 0 0 1-1.51V3a2 2 0 0 1 2-2 2 2 0 0 1 2 2v.09a1.65 1.65 0 0 0 1 1.51 1.65 1.65 0 0 0 1.82-.33l.06-.06a2 2 0 0 1 2.83 0 2 2 0 0 1 0 2.83l-.06.06a1.65 1.65 0 0 0-.33 1.82V9a1.65 1.65 0 0 0 1.51 1H21a2 2 0 0 1 2 2 2 2 0 0 1-2 2h-.09a1.65 1.65 0 0 0-1.51 1z\">\r\n");
      out.write("                                    </path>\r\n");
      out.write("                                </svg>&nbsp;Settings</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"nav flex-column mb-2\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <!-- NAV BAR-->\r\n");
      out.write("            <main role=\"main\" class=\"col-md-9 ml-sm-auto col-lg-10 px-4\">\r\n");
      out.write("                <div\r\n");
      out.write("                    class=\"d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom\">\r\n");
      out.write("                    <h1 class=\"h2\">Add Cases and Documents</h1>\r\n");
      out.write("                    <div class=\"btn-toolbar mb-2 mb-md-0\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </main>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- MAIN CONTENT SECTION -->\r\n");
      out.write("    <div style=\"height: 600px;\r\n");
      out.write("                width: 80.65%;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                right: 1.3%;\r\n");
      out.write("                background-color: #f0f0f0;\">\r\n");
      out.write("        <!-- ADD CASE SECTION -->\r\n");
      out.write("        <div style=\"width: 48.5%;\r\n");
      out.write("                    height: 400px;\r\n");
      out.write("                    background-color: #ffffff;\r\n");
      out.write("                    position: relative;\r\n");
      out.write("                    left: 1%;\r\n");
      out.write("                    float: left;\r\n");
      out.write("                    border-radius: 10px;\">\r\n");
      out.write("            <p style=\"font-size: 22px;\r\n");
      out.write("                    letter-spacing: 1px;\r\n");
      out.write("                    font-weight: 500;\r\n");
      out.write("                    margin-top: 15px;\r\n");
      out.write("                    position: relative;\r\n");
      out.write("                    left: 25px;\">\r\n");
      out.write("                ADD NEW CASE\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ADD DOCUMENT SECTION -->\r\n");
      out.write("        <div style=\"width: 48.5%;\r\n");
      out.write("                    height: 400px;\r\n");
      out.write("                    background-color: #ffffff;\r\n");
      out.write("                    position: absolute;\r\n");
      out.write("                    right: 1%;\r\n");
      out.write("                    float: left;\r\n");
      out.write("                    border-radius: 10px;\">\r\n");
      out.write("            <p style=\"font-size: 22px;\r\n");
      out.write("                    letter-spacing: 1px;\r\n");
      out.write("                    font-weight: 500;\r\n");
      out.write("                    margin-top: 15px;\r\n");
      out.write("                    position: relative;\r\n");
      out.write("                    left: 25px;\">\r\n");
      out.write("                ADD DOCUMENT TO CASE\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/popper.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://unpkg.com/feather-icons/dist/feather.min.js\"></script>\r\n");
      out.write("    <script>feather.replace()</script>\r\n");
      out.write("   \r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        var ctx = document.getElementById(\"myChart\");\r\n");
      out.write("        var myChart = new Chart(ctx, {\r\n");
      out.write("            type: 'line',\r\n");
      out.write("            data: {\r\n");
      out.write("                labels: [\"Sunday\", \"Monday\", \"Tuesday\", \"Wednesday\", \"Thursday\", \"Friday\", \"Saturday\"],\r\n");
      out.write("                datasets: [{\r\n");
      out.write("                    data: [15339, 21345, 18483, 24003, 23489, 24092, 12034],\r\n");
      out.write("                    lineTension: 0,\r\n");
      out.write("                    backgroundColor: 'transparent',\r\n");
      out.write("                    borderColor: '#007bff',\r\n");
      out.write("                    borderWidth: 4,\r\n");
      out.write("                    pointBackgroundColor: '#007bff'\r\n");
      out.write("                }]\r\n");
      out.write("            },\r\n");
      out.write("            options: {\r\n");
      out.write("                scales: {\r\n");
      out.write("                    yAxes: [{\r\n");
      out.write("                        ticks: {\r\n");
      out.write("                            beginAtZero: false\r\n");
      out.write("                        }\r\n");
      out.write("                    }]\r\n");
      out.write("                },\r\n");
      out.write("                legend: {\r\n");
      out.write("                    display: false,\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
