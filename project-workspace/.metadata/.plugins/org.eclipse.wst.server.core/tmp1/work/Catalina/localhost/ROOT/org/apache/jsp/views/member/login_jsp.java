/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.59
 * Generated at: 2020-11-26 02:37:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>studio_Mood:_Login</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.3.1.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("    \r\n");
      out.write("     \t@font-face {\r\n");
      out.write("            font-family: 'S-CoreDream-4Regular';\r\n");
      out.write("            src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_six@1.2/S-CoreDream-4Regular.woff') format('woff');\r\n");
      out.write("            font-weight: normal;\r\n");
      out.write("            font-style: normal;\r\n");
      out.write("        }\r\n");
      out.write("        @font-face {\r\n");
      out.write("\t\t    font-family: 'Cafe24Danjunghae';\r\n");
      out.write("\t\t    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_twelve@1.1/Cafe24Danjunghae.woff') format('woff');\r\n");
      out.write("\t\t    font-weight: normal;\r\n");
      out.write("\t\t    font-style: normal;\r\n");
      out.write("\t\t}\r\n");
      out.write("        \r\n");
      out.write("        .modal {\r\n");
      out.write("            position: fixed;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            background-color: rgba(0, 0, 0, 0.3);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .modalBox {\r\n");
      out.write("            position: fixed;\r\n");
      out.write("            top: 50%;\r\n");
      out.write("            left: 50%;\r\n");
      out.write("            transform: translate(-50%, -50%);\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            height: 400px;\r\n");
      out.write("            width: 700px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .imgBox {\r\n");
      out.write("            width: 400px;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            float: left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        img {\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            border-top-left-radius: 10px;\r\n");
      out.write("            border-bottom-left-radius: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .loginBox {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            width: 300px;\r\n");
      out.write("            height: 400px;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            margin-top : 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            font-family: 'S-CoreDream-4Regular';\r\n");
      out.write("        }\r\n");
      out.write("        .login-title {\r\n");
      out.write("        \tfont-family: 'Cafe24Danjunghae';\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login input {\r\n");
      out.write("            margin: 5px;\r\n");
      out.write("            width: 200px;\r\n");
      out.write("            height: 25px;\r\n");
      out.write("            border: 1.5px solid #373a40;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            outline: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #loginBtn {\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            height: 35px;\r\n");
      out.write("            color: white;\r\n");
      out.write("            border: none;\r\n");
      out.write("            background-color: #000;\r\n");
      out.write("            margin: 20px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .close {\r\n");
      out.write("            display: block;\r\n");
      out.write("            width: 20px;\r\n");
      out.write("            height: 20px;\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("            border: 3px solid #000;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            line-height: 20px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: #000;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"/login\" method=\"post\" id=\"login\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"modal\" id=\"modal\">\r\n");
      out.write("\t\t    <div class=\"modalBox modal-con\">\r\n");
      out.write("\t\t        <div class=\"imgBox\">\r\n");
      out.write("\t\t            <img src=\"/img/loginImg.jpg\">\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t        <div class=\"loginBox\">\r\n");
      out.write("\t\t            <div class=\"login-title\">\r\n");
      out.write("\t\t                <h1>STUDIO Mood:</h1>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t            <div class=\"login\">\r\n");
      out.write("\t\t                <h2>Login</h2>\r\n");
      out.write("\t\t                <input type=\"text\" id=\"id\" name=\"id\" placeholder=\"ID\"><br>\r\n");
      out.write("\t\t                <input type=\"password\" id=\"pw\" name=\"pw\" placeholder=\"password\"><br>\r\n");
      out.write("\t\t                <button type=\"submit\" id=\"loginBtn\" value=\"로그인\">로그인</button><br>\r\n");
      out.write("\t\t                <a href=\"javascript:;\" class=\"close\">X</a>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
