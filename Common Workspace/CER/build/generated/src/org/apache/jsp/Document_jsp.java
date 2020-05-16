package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Document_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/RegisterModal.html");
  }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <title>CER - Home</title>\r\n");
      out.write("        <!-- Bootstrap core CSS -->\r\n");
      out.write("        <link href=\"assets/externalLibraries/bootstrap-v4.4.1/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Importing Fontawesome from Localhost -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/externalLibraries/fontawesome-v5.13.0/css/all.css\">\r\n");
      out.write("        <!-- Custom styles for this template -->\r\n");
      out.write("        <link href=\"assets/css/justified-nav.css\" rel=\"stylesheet\">\r\n");
      out.write("        <style>\r\n");
      out.write("            .nav-item.dropdown:hover .dropdown-menu {\r\n");
      out.write("                display: block;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <link rel=\"icon\" href=\"assets/images/favicon.png\" type=\"image/png\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"masthead\">\r\n");
      out.write("                <h3 class=\"text-muted\">Court Electronic Record system (CERs)</h3>\r\n");
      out.write("                <nav class=\"navbar navbar-expand-md navbar-light bg-light rounded mb-3\">\r\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\"\r\n");
      out.write("                            aria-controls=\"navbarCollapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("                        <ul class=\"navbar-nav text-md-center nav-justified w-100\">\r\n");
      out.write("                            <li class=\"nav-item active\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"Home.html\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"Case.html\">Find a Case</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"Document.html\">Request Case Documents</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"Services.html\">Services</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"About.html\">About</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- LOGIN BUTTON -->\r\n");
      out.write("                    <button class=\"btn\" id=\"loginButton\" type=\"button\" onclick=\"location.href='Login.html'\">\r\n");
      out.write("                        <p id=\"loginButtonText\">LOGIN</p>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <!-- REGISTER BUTTON -->\r\n");
      out.write("                    <button class=\"btn\" id=\"registerButton\" type=\"button\"\r\n");
      out.write("                    data-toggle=\"modal\" data-target=\"#registerModal\">\r\n");
      out.write("                        <p id=\"registerButtonText\">REGISTER</p>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"assets/images/doc_cover.jpg\" style=\"width:100%;height:200px\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Jumbotron -->\r\n");
      out.write("            <h1>Search Results</h1>\r\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Example row of columns -->\r\n");
      out.write("            <!-- Site footer -->\r\n");
      out.write("            <footer class=\"footer\">\r\n");
      out.write("                <p class=\"text-center\">&copy; CER</p>\r\n");
      out.write("            </footer>\r\n");
      out.write("            <!-- Adding register modal webpage -->\r\n");
      out.write("            ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("      <script>\r\n");
      out.write("        // Verifying the selected member registration type by showing conform box\r\n");
      out.write("        function verifyingSelectedMemberRegistrationType(){\r\n");
      out.write("          // Retrieving the user selected registration type\r\n");
      out.write("          var selectedType = document.getElementById(\"registerFormSelect\").value;\r\n");
      out.write("          // Showing confirm box to verify user selected member registration type\r\n");
      out.write("          var selectedTypeConfirm = confirm(\"You have selected, \"+ selectedType +\" Registration, are you sure you want to continue? \");\r\n");
      out.write("          if(selectedTypeConfirm == true){\r\n");
      out.write("            // If user clicks on 'OK' button in confirm box\r\n");
      out.write("            return true;\r\n");
      out.write("          }\r\n");
      out.write("          else if(selectedTypeConfirm == false){\r\n");
      out.write("            // If user clicks on 'Cancel' button in confirm box\r\n");
      out.write("            return false;\r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("      </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("      <style>\r\n");
      out.write("        .modal-backdrop {\r\n");
      out.write("          background: linear-gradient(to top, #13547a  0%, #80d0c7 100%);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .modal-content{\r\n");
      out.write("          border: none;\r\n");
      out.write("          border-radius: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .modal-body{\r\n");
      out.write("          background-color: rgb(241, 241, 241);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .modal-title{\r\n");
      out.write("          letter-spacing: 2px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #registerFormCard{\r\n");
      out.write("          width: 90%;\r\n");
      out.write("          height: 235px;\r\n");
      out.write("          background-color: #ffffff;\r\n");
      out.write("          position: relative;\r\n");
      out.write("          left: 50%;\r\n");
      out.write("          transform: translateX(-50%);\r\n");
      out.write("          border-radius: 10px;\r\n");
      out.write("          box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .modalBodyText{\r\n");
      out.write("          font-size: 20px;\r\n");
      out.write("          letter-spacing: 1px;\r\n");
      out.write("          position: relative;\r\n");
      out.write("          left: 80px;\r\n");
      out.write("          top: 30px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #registerFormSelect{\r\n");
      out.write("          height: 50px;\r\n");
      out.write("          width: 80%;\r\n");
      out.write("          padding: 10px;\r\n");
      out.write("          position: relative;\r\n");
      out.write("          left: 50%;\r\n");
      out.write("          top: 25px;\r\n");
      out.write("          transform: translateX(-50%);\r\n");
      out.write("          border-radius: 5px;\r\n");
      out.write("          font-size: 18px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #registerFormContinueButton{\r\n");
      out.write("          width: 80%;\r\n");
      out.write("          height: 45px;\r\n");
      out.write("          border-radius: 50px;\r\n");
      out.write("          position: relative;\r\n");
      out.write("          left: 50.3%;\r\n");
      out.write("          transform: translateX(-49.7%);\r\n");
      out.write("          top: 45px;\r\n");
      out.write("          background-color: #015f96;\r\n");
      out.write("          border-color: #015f96;\r\n");
      out.write("          color: #ffffff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #registerFormContinueButton:hover{\r\n");
      out.write("          background-color: #ffffff;\r\n");
      out.write("          color: #015f96;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #registerFormContinueButtonText{\r\n");
      out.write("          letter-spacing: 2px;\r\n");
      out.write("          margin-top: -1px;\r\n");
      out.write("          font-size: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .modal-footer{\r\n");
      out.write("          height: 60px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        select:required:invalid{\r\n");
      out.write("          color: gray;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        option[value=\"\"][disabled]{\r\n");
      out.write("          display: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        option{\r\n");
      out.write("          color: black;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("      </style>\r\n");
      out.write("\r\n");
      out.write("      <!-- BOOTSTRAP MODAL - REGISTER MODAL -->\r\n");
      out.write("      <div class=\"modal fade\" id=\"registerModal\" data-backdrop=\"static\" data-keyboard=\"false\">\r\n");
      out.write("        <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("          <div class=\"modal-content\">\r\n");
      out.write("\r\n");
      out.write("            <!-- REGISTER MODAL - HEADER -->\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("              <h4 class=\"modal-title\">Register to Court Electronic Record System</h4>\r\n");
      out.write("              <button type=\"button\" class=\"btn btn-outline-danger\" data-dismiss=\"modal\">\r\n");
      out.write("                <i class=\"fas fa-times\" style=\"font-size: 20px;\"></i>\r\n");
      out.write("              </button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- REGISTER MODAL - BODY -->\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("              <div id=\"registerFormCard\">\r\n");
      out.write("                <p class=\"modalBodyText\">Select Registration Type</p>\r\n");
      out.write("                <form method=\"POST\" action=\"RegistrationTypeServlet\" onSubmit=\"return verifyingSelectedMemberRegistrationType()\">\r\n");
      out.write("                  <i class=\"fa fa-group\"></i>\r\n");
      out.write("                  <select name=\"memberRegistrationTypeSelect\" id=\"registerFormSelect\" required>\r\n");
      out.write("                    <option value=\"\" selected>Registration Type</option>\r\n");
      out.write("                    <option value=\"Customer\">Customer</option>\r\n");
      out.write("                    <option value=\"Attorney\">Attorney</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <button type=\"submit\" name=\"signUp\" id=\"registerFormContinueButton\" class=\"btn btn-primary\">\r\n");
      out.write("                    <p id=\"registerFormContinueButtonText\">CONTINUE</p>\r\n");
      out.write("                  </button>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- REGISTER MODAL - FOOTER -->\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("              <p style=\"font-size: 18px;\">\r\n");
      out.write("                Already have an account? \r\n");
      out.write("                <a href=\"Login.html\">\r\n");
      out.write("                  Login<i class=\"fas fa-angle-double-right\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("              </p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write(" \r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /container -->\r\n");
      out.write("         <!-- Bootstrap core JavaScript\r\n");
      out.write("    ================================================== -->\r\n");
      out.write("        <!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("        <script src=\"assets/externalLibraries/bootstrap-v4.4.1/js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/externalLibraries/bootstrap-v4.4.1/js/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/externalLibraries/bootstrap-v4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.documents}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("case");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <h3>Case No: ");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" held at Court: ");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</h3>\r\n");
          out.write("                <h6>Party - ");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</h6><br>\r\n");
          out.write("                <h6>Co-Parties - ");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</h6>\r\n");
          out.write("                <h6>Documents Available - ");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</h6>\r\n");
          out.write("                <h6>Next Hearing - ");
          if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</h6>\r\n");
          out.write("                <h6>Description - ");
          if (_jspx_meth_c_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</h6>\r\n");
          out.write("                    <h5>Available as Print Cost LKR: 350.00</h5>\r\n");
          out.write("                    <p><i>LKR: 150.00 each additional copy.</i></p>\r\n");
          out.write("                    <p> Please Login to request documents </p> <a href=\"Login.html\">Login</a>\r\n");
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
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${case.CaseNo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${case.CourtLocation}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${case.Party}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${case.CoParty}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${case.DocumentNo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${case.Hearing}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${case.Description}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }
}
