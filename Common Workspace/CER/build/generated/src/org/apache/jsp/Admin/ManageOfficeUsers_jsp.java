package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ManageOfficeUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("    <title>ADMIN - CER</title>\r\n");
      out.write("    <link href=\"../assets/externalLibraries/bootstrap-v4.4.1/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"../assets/css/dashboard.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"icon\" href=\"../assets/images/favicon.png\" type=\"image/png\">\r\n");
      out.write("    <!-- Importing Fontawesome from Localhost -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/externalLibraries/fontawesome-v5.13.0/css/all.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background-color:rgb(243, 243, 243);\">\r\n");
      out.write("    <nav class=\"navbar navbar-dark fixed-top bg-light flex-md-nowrap p-0 shadow\">\r\n");
      out.write("        <a class=\"navbar-brand col-sm-3 col-md-2 mr-0\" href=\"#\">ADMIN CER</a>\r\n");
      out.write("        <ul class=\"navbar-nav px-3\">\r\n");
      out.write("            <li class=\"nav-item text-nowrap\">\r\n");
      out.write("               <a class=\"nav-link\" style=\"color: black\" href=\"../Home.jsp\" >Sign out</a>\r\n");
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
      out.write("                            <a class=\"nav-link active\" href=\"ManageOfficeUsers.jsp\"> <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\"\r\n");
      out.write("                                    height=\"24\" viewbox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\"\r\n");
      out.write("                                    stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-users\">\r\n");
      out.write("                                    <path d=\"M17 21v-2a4 4 0 0 0-4-4H5a4 4 0 0 0-4 4v2\"></path>\r\n");
      out.write("                                    <circle cx=\"9\" cy=\"7\" r=\"4\"></circle>\r\n");
      out.write("                                    <path d=\"M23 21v-2a4 4 0 0 0-3-3.87\"></path>\r\n");
      out.write("                                    <path d=\"M16 3.13a4 4 0 0 1 0 7.75\"></path>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                Manage Office Users </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link \" href=\"Settings.jsp\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\"\r\n");
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
      out.write("                    <h1 class=\"h2\">Manage Users</h1>\r\n");
      out.write("                    <div class=\"btn-toolbar mb-2 mb-md-0\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </main>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        #searchButton{\r\n");
      out.write("            border-color: rgb(5, 132, 206);\r\n");
      out.write("            background-color: rgb(5, 132, 206);\r\n");
      out.write("            color: #ffffff;\r\n");
      out.write("        }\r\n");
      out.write("        #searchButton:hover{\r\n");
      out.write("            border-color: rgb(5, 132, 206);\r\n");
      out.write("            background-color: #ffffff;\r\n");
      out.write("            color: rgb(5, 132, 206);\r\n");
      out.write("        }\r\n");
      out.write("        #registerButton{\r\n");
      out.write("            border-color: rgb(9, 90, 138);\r\n");
      out.write("            background-color: rgb(9, 90, 138);\r\n");
      out.write("            color: #ffffff;\r\n");
      out.write("        }\r\n");
      out.write("        #registerButton:hover{\r\n");
      out.write("            border-color: rgb(9, 90, 138);\r\n");
      out.write("            background-color: #ffffff;\r\n");
      out.write("            color: rgb(9, 90, 138);\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <!-- MAIN CONTENT SECTION -->\r\n");
      out.write("    <div style=\"height: 600px;\r\n");
      out.write("                width: 80.65%;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                right: 1.3%;\r\n");
      out.write("                background-color: #f0f0f0;\">\r\n");
      out.write("        <!-- SEARCH REGISTERED OFFICE USER SECTION -->\r\n");
      out.write("        <div style=\"width: 48.5%;\r\n");
      out.write("                    height: 760px;\r\n");
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
      out.write("                SEARCH REGISTERED OFFICE USER\r\n");
      out.write("            </p>\r\n");
      out.write("\r\n");
      out.write("            <!-- HELP - MORE INFORMATION POPOVER -->\r\n");
      out.write("            <button class=\"btn btn-light\" style=\"border-radius: 25px;\r\n");
      out.write("                                                        height: 40px;\r\n");
      out.write("                                                        width: 40px;\r\n");
      out.write("                                                        position: absolute;\r\n");
      out.write("                                                        right: 2%;\r\n");
      out.write("                                                        top: 10px;\"\r\n");
      out.write("            data-toggle=\"popover\" data-trigger=\"hover\" data-placement=\"top\" title=\"HELP\" \r\n");
      out.write("            data-content=\"How to search registered office user?<br>\r\n");
      out.write("                        Enter Office User's CER Email Address and click on 'SEARCH' button\"\r\n");
      out.write("            data-html=\"true\">\r\n");
      out.write("                <i class=\"fas fa-question-circle\" style=\"position: relative;\r\n");
      out.write("                                                        left: 50%;\r\n");
      out.write("                                                        transform: translateX(-50%);\r\n");
      out.write("                                                        font-size: 22px;\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("            <!-- SEARCH REGISTERED OFFICE USER FORM -->\r\n");
      out.write("            <form name=\"searchRegisteredOfficerForm\" method=\"POST\" action=\"../Admin/SearchRegisteredOfficeUserServlet\">\r\n");
      out.write("                <input type=\"email\" placeholder=\"Enter Office User's CER Email Address\" style=\"width: 74%;\r\n");
      out.write("                                                                            height: 45px;\r\n");
      out.write("                                                                            position: relative;\r\n");
      out.write("                                                                            left: 4%;\r\n");
      out.write("                                                                            border-radius: 5px;\r\n");
      out.write("                                                                            border: #ccc solid 1px;\r\n");
      out.write("                                                                            padding-left: 18px;\r\n");
      out.write("                                                                            font-size: 18px;\"\r\n");
      out.write("                data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"MANDATORY, Enter CER Email Address\" required name=\"officerCEREmailAddress\" />\r\n");
      out.write("                <button style=\"width: 16%;\r\n");
      out.write("                                height: 45px;\r\n");
      out.write("                                position: absolute;\r\n");
      out.write("                                right: 4%;\" class=\"btn\" id=\"searchButton\">\r\n");
      out.write("                    <p style=\"letter-spacing: 1px;\r\n");
      out.write("                            margin-top: 1px;\r\n");
      out.write("                            font-size: 18px;\">SEARCH</p>\r\n");
      out.write("                </button>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div style=\"border-top: #ccc solid 1px;\r\n");
      out.write("                        width: 92%;\r\n");
      out.write("                        margin-top: 10px;\r\n");
      out.write("                        position: relative;\r\n");
      out.write("                        left: 50%;\r\n");
      out.write("                        transform: translateX(-50%);\"></div>\r\n");
      out.write("                        \r\n");
      out.write("            <!-- SEARCH REGISTERED OFFICE USER - SEARCH RESULT -->\r\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- REGISTER NEW OFFICE USERS SECTION -->\r\n");
      out.write("        <div style=\"width: 48.5%;\r\n");
      out.write("                    height: 760px;\r\n");
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
      out.write("                REGISTER NEW OFFICE USER\r\n");
      out.write("            </p>\r\n");
      out.write("\r\n");
      out.write("            <!-- HELP - MORE INFORMATION POPOVER -->\r\n");
      out.write("            <button class=\"btn btn-light\" style=\"border-radius: 25px;\r\n");
      out.write("                                                        height: 40px;\r\n");
      out.write("                                                        width: 40px;\r\n");
      out.write("                                                        position: absolute;\r\n");
      out.write("                                                        right: 2%;\r\n");
      out.write("                                                        top: 10px;\"\r\n");
      out.write("            data-toggle=\"popover\" data-trigger=\"hover\" data-placement=\"top\" title=\"HELP\" \r\n");
      out.write("            data-content=\"How to register?<br>\r\n");
      out.write("                        Enter accurate details to all the fields below and click on 'REGISTER' button.\"\r\n");
      out.write("            data-html=\"true\">\r\n");
      out.write("                <i class=\"fas fa-question-circle\" style=\"position: relative;\r\n");
      out.write("                                                        left: 50%;\r\n");
      out.write("                                                        transform: translateX(-50%);\r\n");
      out.write("                                                        font-size: 22px;\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("            <!-- REGISTER NEW OFFICE USER FORM -->\r\n");
      out.write("            <form name=\"officerRegistrationForm\" method=\"POST\" action=\"../OfficeUserRegistrationServlet\" onSubmit=\"return validateUserData()\" >\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-5\">\r\n");
      out.write("                        <p style=\"position: relative;\r\n");
      out.write("                                top: 10px;\r\n");
      out.write("                                left: 30%;\r\n");
      out.write("                                letter-spacing: 1px;\r\n");
      out.write("                                font-size: 18px;\">NAME</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-7\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-12\">\r\n");
      out.write("                                <select class=\"form-control\" name=\"prefixName\" style=\"padding: 0px;\r\n");
      out.write("                                                                                                width: 80%;\r\n");
      out.write("                                                                                                height: 45px;\r\n");
      out.write("                                                                                                padding-left: 8px;\" \r\n");
      out.write("                                data-toggle=\"tooltip\" data-placement=\"top\" title=\"MANDATORY, Select Prefix\" required>\r\n");
      out.write("                                    <option value=\"\" selected>Select Prefix</option>\r\n");
      out.write("                                    <option value=\"Mr.\">Mr.</option>\r\n");
      out.write("                                    <option value=\"Sir.\">Sir.</option>\r\n");
      out.write("                                    <option value=\"Dr.\">Dr.</option>\r\n");
      out.write("                                    <option value=\"Mrs.\">Mrs.</option>\r\n");
      out.write("                                    <option value=\"Miss.\">Miss.</option>\r\n");
      out.write("                                    <option value=\"Ms.\">Ms.</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-12\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Enter First Name\" name=\"firstName\" style=\"width: 80%;\r\n");
      out.write("                                                                                                        height: 45px;\r\n");
      out.write("                                                                                                        margin-top: 10px;\" class=\"form-control\"\r\n");
      out.write("                                data-toggle=\"tooltip\" data-placement=\"top\" title=\"MANDATORY, Enter First Name\" required> \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-12\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Enter Middle Name\" name=\"middleName\" style=\"width: 80%;\r\n");
      out.write("                                                                                                        height: 45px;\r\n");
      out.write("                                                                                                        margin-top: 10px;\" class=\"form-control\"\r\n");
      out.write("                                data-toggle=\"tooltip\" data-placement=\"top\" title=\"MANDATORY, Select Middle Name\" required> \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-12\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Enter Last Name\" name=\"lastName\" style=\"width: 80%;\r\n");
      out.write("                                                                                                        height: 45px;\r\n");
      out.write("                                                                                                        margin-top: 10px;\" class=\"form-control\"\r\n");
      out.write("                                data-toggle=\"tooltip\" data-placement=\"top\" title=\"MANDATORY, Select Last Name\" required> \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\" style=\"margin-top: 15px;\">\r\n");
      out.write("                    <div class=\"col-sm-5\">\r\n");
      out.write("                        <p style=\"position: relative;\r\n");
      out.write("                                top: 20px;\r\n");
      out.write("                                left: 30%;\r\n");
      out.write("                                letter-spacing: 1px;\r\n");
      out.write("                                font-size: 18px;\">NIC</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-7\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-12\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Enter NIC Number\" name=\"nicNumber\" style=\"width: 80%;\r\n");
      out.write("                                                                                                        height: 45px;\r\n");
      out.write("                                                                                                        margin-top: 10px;\" class=\"form-control\"\r\n");
      out.write("                                data-toggle=\"tooltip\" data-placement=\"top\" title=\"MANDATORY, Enter NIC Number\" required> \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\" style=\"margin-top: 15px;\">\r\n");
      out.write("                    <div class=\"col-sm-5\">\r\n");
      out.write("                        <p style=\"position: relative;\r\n");
      out.write("                                top: 20px;\r\n");
      out.write("                                left: 30%;\r\n");
      out.write("                                letter-spacing: 1px;\r\n");
      out.write("                                font-size: 18px;\">CER ID</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-7\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-12\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Enter CER ID\" name=\"cerId\" style=\"width: 80%;\r\n");
      out.write("                                                                                                        height: 45px;\r\n");
      out.write("                                                                                                        margin-top: 10px;\" class=\"form-control\"\r\n");
      out.write("                                data-toggle=\"tooltip\" data-placement=\"top\" title=\"MANDATORY, Enter CER ID\" required> \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\" style=\"margin-top: 15px;\">\r\n");
      out.write("                    <div class=\"col-sm-5\">\r\n");
      out.write("                        <p style=\"position: relative;\r\n");
      out.write("                                top: 20px;\r\n");
      out.write("                                left: 30%;\r\n");
      out.write("                                letter-spacing: 1px;\r\n");
      out.write("                                font-size: 18px;\">CER EMAIL ADDRESS</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-7\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-12\">\r\n");
      out.write("                                <input type=\"email\" placeholder=\"Enter CER Email Address\" name=\"cerEmailAddress\" style=\"width: 80%;\r\n");
      out.write("                                                                                                        height: 45px;\r\n");
      out.write("                                                                                                        margin-top: 10px;\" class=\"form-control\"\r\n");
      out.write("                                data-toggle=\"tooltip\" data-placement=\"top\" title=\"MANDATORY, Enter CER Email Address\" required> \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\" style=\"margin-top: 15px;\">\r\n");
      out.write("                    <div class=\"col-sm-5\">\r\n");
      out.write("                        <p style=\"position: relative;\r\n");
      out.write("                                top: 20px;\r\n");
      out.write("                                left: 30%;\r\n");
      out.write("                                letter-spacing: 1px;\r\n");
      out.write("                                font-size: 18px;\">PASSWORD</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-7\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-12\">\r\n");
      out.write("                                <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" style=\"width: 80%;\r\n");
      out.write("                                                                                                        height: 45px;\r\n");
      out.write("                                                                                                        margin-top: 10px;\" class=\"form-control\" \r\n");
      out.write("                                data-toggle=\"popover\" data-trigger=\"hover\" data-placement=\"top\" title=\"MANDATORY, Password Guidelines:\" data-html=\"true\"\r\n");
      out.write("                                data-content=\"Minimum 10 characters<br />\r\n");
      out.write("                                Maximum 25 characters<br />\r\n");
      out.write("                                At least ONE uppercase letter<br />\r\n");
      out.write("                                At least ONE numeric character<br />\r\n");
      out.write("                                At least ONE special character\" required/> \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-12\">\r\n");
      out.write("                                <input type=\"password\" placeholder=\"Re-Enter Password\" name=\"reenterPassword\" style=\"width: 80%;\r\n");
      out.write("                                                                                                        height: 45px;\r\n");
      out.write("                                                                                                        margin-top: 10px;\" class=\"form-control\"\r\n");
      out.write("                                data-toggle=\"popover\" data-trigger=\"hover\" data-placement=\"top\" title=\"MANDATORY, Password Guidelines:\" data-html=\"true\"\r\n");
      out.write("                                data-content=\"Minimum 10 characters<br />\r\n");
      out.write("                                Maximum 25 characters<br />\r\n");
      out.write("                                At least ONE uppercase letter<br />\r\n");
      out.write("                                At least ONE numeric character<br />\r\n");
      out.write("                                At least ONE special character\" required /> \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div style=\"width: 75%;\r\n");
      out.write("                            height: 40px;\r\n");
      out.write("                            border: #ccc solid 1px;\r\n");
      out.write("                            position: relative;\r\n");
      out.write("                            left: 50%;\r\n");
      out.write("                            top: 20px;\r\n");
      out.write("                            transform: translateX(-50%);\r\n");
      out.write("                            border-radius: 5px;\">\r\n");
      out.write("                    <p style=\"position: relative;\r\n");
      out.write("                            top: 8px;\r\n");
      out.write("                            left: 10px;\r\n");
      out.write("                            font-size: 14px;\">\r\n");
      out.write("                        By registering new office user, you would agreeing to the <a href=\"\"><span>Terms & Conditions</span></a>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"submit\" class=\"btn\" style=\"width: 80%;\r\n");
      out.write("                                                    height: 40px;\r\n");
      out.write("                                                    position: relative;\r\n");
      out.write("                                                    top: 45px;\r\n");
      out.write("                                                    left: 50%;\r\n");
      out.write("                                                    transform: translateX(-50%);\" id=\"registerButton\">\r\n");
      out.write("                    <p>REGISTER</p>\r\n");
      out.write("                </button>\r\n");
      out.write("            </form>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("    <script src=\"../assets/externalLibraries/bootstrap-v4.4.1/js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"../assets/externalLibraries/bootstrap-v4.4.1/js/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"../assets/externalLibraries/bootstrap-v4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        /* Executed upon page load */\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            // jQuery for BOOTSTRAP TOOLTIP\r\n");
      out.write("            $('[data-toggle=\"tooltip\"]').tooltip();\r\n");
      out.write("            // jQuery for BOOTSTRAP POPOVER\r\n");
      out.write("            $('[data-toggle=\"popover\"]').popover();\r\n");
      out.write("        });\r\n");
      out.write("        /* OFFICE USER REGISTRATION FORM USER DATA VALIDATION */\r\n");
      out.write("        function validateUserData() {\r\n");
      out.write("            \r\n");
      out.write("            // Checking if the user entered passwords characters length in greater than or equal to 10\r\n");
      out.write("            if (document.officerRegistrationForm.password.value.length < 10 || document.officerRegistrationForm.password.value.length < 10) {\r\n");
      out.write("                alert(\"ERROR: Rechecked Entered Password, Password length is below 10 characters\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            // Checking if the user entered passwords characters length in lower than or equal to 25\r\n");
      out.write("            if (document.officerRegistrationForm.reenterPassword.value.length > 25 || document.officerRegistrationForm.reenterPassword.value.length > 25) {\r\n");
      out.write("                alert(\"ERROR: Rechecked Entered Password, Password length is above 25 characters\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            // Checking if the user entered similar password in the password field and confirm password field\r\n");
      out.write("            if (document.officerRegistrationForm.password.value != document.officerRegistrationForm.reenterPassword.value) {\r\n");
      out.write("                alert(\"ERROR: Entered Passwords Mismatch, Please Recheck\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            // Showing the user the registration process will continue and verifying the entered values\r\n");
      out.write("            var confirmContinueRegisterNewUser = confirm(\"New officer user will be registered. Check if all the entered details correct. Do you want to continue?\");\r\n");
      out.write("            if(confirmContinueRegisterNewUser == true){\r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("            else if(confirmContinueRegisterNewUser == false){\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://unpkg.com/feather-icons/dist/feather.min.js\"></script>\r\n");
      out.write("    <script>feather.replace()</script>\r\n");
      out.write("   \r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.orders}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("order");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                 ");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
