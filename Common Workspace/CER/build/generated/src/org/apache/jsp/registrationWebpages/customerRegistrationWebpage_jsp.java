package org.apache.jsp.registrationWebpages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customerRegistrationWebpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <title>CER - Customer Registration</title>\r\n");
      out.write("    <!-- Importing CSS for Webpage Layout from Localhost -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/css/registrationWebpages.css\">\r\n");
      out.write("    <!-- Importing Bootstrap from Localhost -->\r\n");
      out.write("    <link href=\"../assets/externalLibraries/bootstrap-v4.4.1/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Importing Fontawesome from Localhost -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/externalLibraries/fontawesome-v5.13.0/css/all.css\">\r\n");
      out.write("    <!-- Importing Google Fonts from the Internet -->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@600&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("      /* CUSTOMER REGISTRATION FORM USER DATA VALIDATION */\r\n");
      out.write("      function validateUserData(){\r\n");
      out.write("        \r\n");
      out.write("        // Checking if the user entered similar password in the password field and confirm password field\r\n");
      out.write("        if(document.customerRegistrationForm.password.value != document.customerRegistrationForm.confirmPassword.value){\r\n");
      out.write("          alert(\"ERROR: Entered Passwords Mismatch, Please Recheck\");\r\n");
      out.write("          return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // Checking if the user checked the terms and conditions checkbox\r\n");
      out.write("        if(document.getElementById('termsAndConditions').checked){\r\n");
      out.write("          // User has checked the checkbox\r\n");
      out.write("          return true;\r\n");
      out.write("        }\r\n");
      out.write("        else{ \r\n");
      out.write("          // User didn't check the checkbox\r\n");
      out.write("          alert(\"ERROR: Please tick Terms and Conditions checkbox\");\r\n");
      out.write("          return false;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <!-- HEADER SECTION - BEGIN -->\r\n");
      out.write("    <div id=\"headerSection\">\r\n");
      out.write("      <div id=\"headerTitleSection\">\r\n");
      out.write("        <p id=\"headerTitleText\">\r\n");
      out.write("          Court Electronic Record System (CERs) \r\n");
      out.write("        </p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"headerBanner\">\r\n");
      out.write("        <p id=\"headerBannerText\">\r\n");
      out.write("          MEMBER REGISTRATION\r\n");
      out.write("        </p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- HEADER SECTION - END -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- BODY SECTION - BEGIN -->\r\n");
      out.write("\r\n");
      out.write("    <!-- REGISTRATION FORM STYLES -->\r\n");
      out.write("    <style>\r\n");
      out.write("      .formTitle{\r\n");
      out.write("        font-size: 20px;\r\n");
      out.write("        position: relative;\r\n");
      out.write("        left: 50px;\r\n");
      out.write("        top: 20px;\r\n");
      out.write("        letter-spacing: 1px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .formItem{\r\n");
      out.write("        width: 90%;\r\n");
      out.write("        height: 45px;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        border-radius: 5px;\r\n");
      out.write("        border: #ccc solid 1px;\r\n");
      out.write("        margin-left: 25px;\r\n");
      out.write("        margin-top: 20px;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <!-- RETURN BUTTON -->\r\n");
      out.write("    <div id=\"bodyContentSection\">\r\n");
      out.write("      <button class=\"btn btn-info\" id=\"returnButton\">\r\n");
      out.write("        <i class=\"fas fa-angle-double-left\" id=\"returnButtonIcon\"></i>\r\n");
      out.write("        <p id=\"returnButtonText\">RETURN</p>\r\n");
      out.write("      </button>\r\n");
      out.write("  \r\n");
      out.write("      <!-- CUSTOMER REGISTRATION FORM CARD -->\r\n");
      out.write("      <div style=\"width: 60%;\r\n");
      out.write("                  height: auto;\r\n");
      out.write("                  background-color: #ffffff;\r\n");
      out.write("                  position: relative;\r\n");
      out.write("                  left: 50%;\r\n");
      out.write("                  top: 70px;\r\n");
      out.write("                  transform: translateX(-50%);\r\n");
      out.write("                  border-radius: 15px;\r\n");
      out.write("                  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\r\n");
      out.write("                  padding-bottom: 80px;\r\n");
      out.write("                  margin-bottom: 50px;\">\r\n");
      out.write("        <!-- CARD HEADING -->\r\n");
      out.write("        <p style=\"text-align: center;\r\n");
      out.write("                  font-size: 25px;\r\n");
      out.write("                  letter-spacing: 2px;\r\n");
      out.write("                  position: relative;\r\n");
      out.write("                  top: 15px;\r\n");
      out.write("                  font-weight: 600;\">Customer Registration</p>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <!-- CUSTOMER REGISTRATION FORM -->\r\n");
      out.write("        <div style=\"height: auto;\r\n");
      out.write("                    width: 70%;\r\n");
      out.write("                    position: relative;\r\n");
      out.write("                    left: 50%;\r\n");
      out.write("                    transform: translateX(-50%);\r\n");
      out.write("                    top: 20px;\">\r\n");
      out.write("          \r\n");
      out.write("          <form name=\"customerRegistrationForm\" action=\"../CustomerRegistrationServlet\" method=\"POST\" onSubmit=\"return validateUserData()\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label class=\"formTitle\">Full Name</label>\r\n");
      out.write("              <div class=\"form-row\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                  <select class=\"form-control formItem\" name=\"prefixName\" style=\"padding: 0px;\r\n");
      out.write("                                                                                height: 45px;\" >\r\n");
      out.write("                    <option value=\"\" selected>Select Prefix</option>\r\n");
      out.write("                    <option value=\"Mr.\">Mr.</option>\r\n");
      out.write("                    <option value=\"Sir.\">Sir.</option>\r\n");
      out.write("                    <option value=\"Dr.\">Dr.</option>\r\n");
      out.write("                    <option value=\"Mrs.\">Mrs.</option>\r\n");
      out.write("                    <option value=\"Miss.\">Miss.</option>\r\n");
      out.write("                    <option value=\"Ms.\">Ms.</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-row\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control formItem\" style=\"margin-top: 10px;\r\n");
      out.write("                                                                          width: 88%;\" placeholder=\"Enter First Name\" name=\"firstName\"  />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control formItem\" style=\"margin-top: 10px;\r\n");
      out.write("                                                                          margin-left: -5px;\r\n");
      out.write("                                                                          width: 88%;\" placeholder=\"Enter Middle Name\" name=\"middleName\" />\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-row\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control formItem\" style=\"margin-top: 10px;\" placeholder=\"Enter Last Name\" name=\"lastName\"  />\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("              \r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label class=\"formTitle\">National Identity Card</label>\r\n");
      out.write("              <div class=\"form-row\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control formItem\" placeholder=\"Enter NIC\" name=\"nic\"  />\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label class=\"formTitle\">Date Of Birth</label>\r\n");
      out.write("              <div class=\"form-row\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control formItem\" placeholder=\"DD/MM/YYYY\" name=\"dateOfBirth\"  />\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label class=\"formTitle\">Address</label>\r\n");
      out.write("              <div class=\"form-row\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control formItem\" placeholder=\"Enter Street Address\" style=\"width: 88%;\" name=\"streetAddress\"  />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control formItem\" placeholder=\"Enter City\" style=\"width: 88%;\r\n");
      out.write("                                                                                                  margin-left: -10px;\" name=\"city\"  />\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-row\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                  <select class=\"form-control formItem\" style=\"padding: 0px;\r\n");
      out.write("                                                              height: 45px;\r\n");
      out.write("                                                              width: 88%;\" name=\"district\"  >\r\n");
      out.write("                    <option value=\"\" selected>Select District</option>\r\n");
      out.write("                    <option value=\"Jaffna\">Jaffna</option>\r\n");
      out.write("                    <option value=\"Kilinochchi\">Kilinochchi</option>\r\n");
      out.write("                    <option value=\"Mannar\">Mannar</option>\r\n");
      out.write("                    <option value=\"Mullaitivu\">Mullaitivu</option>\r\n");
      out.write("                    <option value=\"Vavuniya\">Vavuniya</option>\r\n");
      out.write("                    <option value=\"Puttalam\">Puttalam</option>\r\n");
      out.write("                    <option value=\"Kurunegala\">Kurunegala</option>\r\n");
      out.write("                    <option value=\"Gampaha\">Gampaha</option>\r\n");
      out.write("                    <option value=\"Colombo\">Colombo</option>\r\n");
      out.write("                    <option value=\"Kalutara\">Kalutara</option>\r\n");
      out.write("                    <option value=\"Anuradhapura\">Anuradhapura</option>\r\n");
      out.write("                    <option value=\"Polonnaruwa\">Polonnaruwa</option>\r\n");
      out.write("                    <option value=\"Matale\">Matale</option>\r\n");
      out.write("                    <option value=\"Kandy\">Kandy</option>\r\n");
      out.write("                    <option value=\"Nuwara Eliya\">Nuwara Eliya</option>\r\n");
      out.write("                    <option value=\"Kegalle\">Kegalle</option>\r\n");
      out.write("                    <option value=\"Ratnapura\">Ratnapura</option>\r\n");
      out.write("                    <option value=\"Trincomalee\">Trincomalee</option>\r\n");
      out.write("                    <option value=\"Batticaloa\">Batticaloa</option>\r\n");
      out.write("                    <option value=\"Ampara\">Ampara</option>\r\n");
      out.write("                    <option value=\"Badulla\">Badulla</option>\r\n");
      out.write("                    <option value=\"Monaragala\">Monaragala</option>\r\n");
      out.write("                    <option value=\"Hambantota\">Hambantota</option>\r\n");
      out.write("                    <option value=\"Matara\">Matara</option>\r\n");
      out.write("                    <option value=\"Galle\">Galle</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control formItem\" placeholder=\"Enter Zip/Postal Code\" style=\"width: 88%;\r\n");
      out.write("                                                                                                              margin-left: -10px;\" name=\"zipPostalCode\"  />\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label class=\"formTitle\">Proof Of Citizenship</label>\r\n");
      out.write("              <div style=\"border: #ccc solid 1px;\r\n");
      out.write("                          border-radius: 5px;\r\n");
      out.write("                          height: 120px;\r\n");
      out.write("                          width: 89%;\r\n");
      out.write("                          position: relative;\r\n");
      out.write("                          top: 15px;\r\n");
      out.write("                          left: 25px;\">\r\n");
      out.write("                <div class=\"form-row\" style=\"margin-top: 20px;\r\n");
      out.write("                                          margin-left: 40px;\">\r\n");
      out.write("                  <div class=\"col\">\r\n");
      out.write("                    <label>Select Image of NIC/Passport</label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-row\">\r\n");
      out.write("                  <div class=\"col\">\r\n");
      out.write("                    <input type=\"file\" class=\"form-control-file\" style=\"position: relative;\r\n");
      out.write("                                                                              left: 45px;\r\n");
      out.write("                                                                              top: 10px;\" name=\"nicPassportImage\" >\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\" style=\"margin-top: 30px;\">\r\n");
      out.write("              <label class=\"formTitle\">Login Credentials</label>\r\n");
      out.write("              <div class=\"form-row\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                  <input type=\"email\" class=\"form-control formItem\" style=\"width: 90%;\" placeholder=\"Enter Email Address\" name=\"emailAddress\"  />\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-row\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                  <input type=\"password\" class=\"form-control formItem\" style=\"margin-top: 10px;\r\n");
      out.write("                                                                                  width: 88%;\" placeholder=\"Enter Password\" name=\"password\"  />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                  <input type=\"password\" class=\"form-control formItem\" style=\"margin-top: 10px;\r\n");
      out.write("                                                                                  margin-left: -5px;\r\n");
      out.write("                                                                                  width: 88%;\" placeholder=\"Enter Confirm Password\" name=\"confirmPassword\"  />\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label class=\"formTitle\">Terms & Conditions</label>\r\n");
      out.write("              <div class=\"form-row\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                  <p class=\"formItem\" style=\"border: none;\r\n");
      out.write("                                            letter-spacing: 2px;\r\n");
      out.write("                                            line-height: 30px;\">\r\n");
      out.write("                    Please read through the Terms and Conditions and agree to it by <br> ticking the below box to continue the registration\r\n");
      out.write("                  </p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-row\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                  <div class=\"form-check\" style=\"margin-left: 50px;\r\n");
      out.write("                                                margin-top: 40px;\">\r\n");
      out.write("                    <input class=\"form-check-input\" type=\"checkbox\" style=\"width: 20px;\r\n");
      out.write("                                                                                    height: 20px;\" id=\"termsAndConditions\" >\r\n");
      out.write("                    <label class=\"form-check-label\" style=\"margin-left: 20px;\">\r\n");
      out.write("                      I have read and I agree to the Terms and Conditions\r\n");
      out.write("                    </label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <button class=\"btn btn-primary btn-block\" style=\"height: 45px;\r\n");
      out.write("                                                            position: relative;\r\n");
      out.write("                                                            top: 20px;\" type=\"submit\">\r\n");
      out.write("              <i class=\"fas fa-user-plus\" style=\"position: absolute;\r\n");
      out.write("                                                left: 40%;\r\n");
      out.write("                                                margin-top: 7px;\"></i>\r\n");
      out.write("              <p style=\"letter-spacing: 2px;\r\n");
      out.write("                        font-size: 20px;\r\n");
      out.write("                        margin-left: 30px;\">REGISTER</p>\r\n");
      out.write("            </button>\r\n");
      out.write("          </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("  \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- BODY SECTION - END -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- FOOTER SECTION - BEGIN -->\r\n");
      out.write("    <div id=\"footerSection\">\r\n");
      out.write("      <p id=\"footerSectionText\">Â© CER</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- FOOTER SECTION - END -->\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
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
