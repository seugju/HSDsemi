/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.59
 * Generated at: 2020-12-02 06:22:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;

public final class noticeWriteFrm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1606890108033L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1606808284865L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
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
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/nse_files/js/HuskyEZCreator.js\"\r\n");
      out.write("\tcharset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t.content-writer *{\r\n");
      out.write("\t\tmargin: 0 auto;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("        .header-text {\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("            width: 150px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            font-size: 30px;\r\n");
      out.write("            border-bottom: 4px solid #FBB1B5;\r\n");
      out.write("        }\r\n");
      out.write("\t     .content-table{\r\n");
      out.write("             margin-top:50px;\r\n");
      out.write("             width:80%;\r\n");
      out.write("             border: 1px solid lightgray;\r\n");
      out.write("             border-collapse: collapse;\r\n");
      out.write("        }\r\n");
      out.write("        .content-table tr,th,td{\r\n");
      out.write("           \r\n");
      out.write("             border: 1px solid lightgray;\r\n");
      out.write("             border-collapse: collapse;\r\n");
      out.write("             \r\n");
      out.write("        }\r\n");
      out.write("/*          .content-table input{\r\n");
      out.write("           outline:1px solid white;\r\n");
      out.write("        } */\r\n");
      out.write("\t\tinput{\r\n");
      out.write("\t\t\twidth:95%;\r\n");
      out.write("\t\t\tborder:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px;\r\n");
      out.write("\t\t\toutline:none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tinput:focus {outline:none;}\r\n");
      out.write("\t\ttextarea{\r\n");
      out.write("\t\t\twidth:99.5%;\r\n");
      out.write("\t\t\theight:400px;\r\n");
      out.write("\t\t\tborder:none;\r\n");
      out.write("\t\t\tresize: none;\r\n");
      out.write("\t\t\ttext-align:center;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\ttextarea:focus{\r\n");
      out.write("\t\t\toutline:none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.content-btn {\r\n");
      out.write("         margin:5px;\r\n");
      out.write("         display:inline-block;\r\n");
      out.write("            width: 80px;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            background-color: #dfd3d3;\r\n");
      out.write("            border: 2px solid #dfd3d3;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            list-style: none;\r\n");
      out.write("            color: #4a4a4a;\r\n");
      out.write("             text-decoration: none;\r\n");
      out.write("             line-height:40px;\r\n");
      out.write("             vertical-align:middle;\r\n");
      out.write("             padding:0;\r\n");
      out.write("        }\r\n");
      out.write("        .button{\r\n");
      out.write("        \twidth:100%;\r\n");
      out.write("        \theight:50px;\r\n");
      out.write("        \ttext-align:center;\r\n");
      out.write("        }\r\n");
      out.write("        button:focus {\r\n");
      out.write("\toutline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("        \ta{\r\n");
      out.write("\t\t text-decoration: none;\r\n");
      out.write("\t\tcolor: #4a4a4a;\r\n");
      out.write("\t}\r\n");
      out.write("\ttd{\r\n");
      out.write("\t\ttext-align:left;\r\n");
      out.write("\t\tpadding-left:5px;\r\n");
      out.write("\t}\r\n");
      out.write("\tth{\r\n");
      out.write("\t\tbackground-color:#F0F0F0;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");

    	Member m = (Member)session.getAttribute("loginMember");
    
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.3.1.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("     <style>\r\n");
      out.write("    \t @font-face {\r\n");
      out.write("            font-family: 'S-CoreDream-4Regular';\r\n");
      out.write("            src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_six@1.2/S-CoreDream-4Regular.woff') format('woff');\r\n");
      out.write("            font-weight: normal;\r\n");
      out.write("            font-style: normal;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\t\t@font-face {\r\n");
      out.write("\t\t    font-family: 'Cafe24Danjunghae';\r\n");
      out.write("\t\t    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_twelve@1.1/Cafe24Danjunghae.woff') format('woff');\r\n");
      out.write("\t\t    font-weight: normal;\r\n");
      out.write("\t\t    font-style: normal;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t@font-face {\r\n");
      out.write("\t\t    font-family: 'KCC-eunyoung';\r\n");
      out.write("\t\t    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_one@1.0/KCC-eunyoung-Regular.woff') format('woff');\r\n");
      out.write("\t\t    font-weight: normal;\r\n");
      out.write("\t\t    font-style: normal;\r\n");
      out.write("\t\t}\r\n");
      out.write("        header{\r\n");
      out.write("            width: 100vw;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar {\r\n");
      out.write("            display: block;\r\n");
      out.write("            background-color: #faf2f2;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .logo {\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            width: 500px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        .logo >h2{\r\n");
      out.write("         \tfont-family: 'Cafe24Danjunghae';\r\n");
      out.write("         }\r\n");
      out.write("        \r\n");
      out.write("        .logo>p{\r\n");
      out.write("        \t font-family: 'KCC-eunyoung';\r\n");
      out.write("        \t font-size: 14pt;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navi-menu,\r\n");
      out.write("        .navi-menu-top {\r\n");
      out.write("            /* menu ul */\r\n");
      out.write("            list-style: none;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navi-menu-top {\r\n");
      out.write("            float: right;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navi-menu {\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            width: 680px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navi-menu>li {\r\n");
      out.write("            width: 125px;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navi-menu li>a {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            display: block;\r\n");
      out.write("            float: left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .nav-link {\r\n");
      out.write("            color: #373a40;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navi-menu-top {\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .nav-top {\r\n");
      out.write("     \t   \tfont-family: 'S-CoreDream-4Regular';\r\n");
      out.write("            width: 1200px;\r\n");
      out.write("            float: right;\r\n");
      out.write("            padding-right: 30px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navi-menu-top li {\r\n");
      out.write("            width: 80px;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            float: left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navi-menu-top li>a {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            font-size: 9pt;\r\n");
      out.write("            line-height: 30px;\r\n");
      out.write("            color: #373a40;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .subMenu{\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            transition-duration: 2s;\r\n");
      out.write("        }\r\n");
      out.write("        .subMenu li>a{\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            width: 125px;\r\n");
      out.write("            float: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("    \r\n");
      out.write("        <script>\r\n");
      out.write("        $(function(){\r\n");
      out.write("            var subMenu = $(\".subMenu\");\r\n");
      out.write("            subMenu.hide();\r\n");
      out.write("            \r\n");
      out.write("            $(\".navi-menu>li>a\").hover(function(){\r\n");
      out.write("               $(this).css('color','gray');\r\n");
      out.write("            },function(){\r\n");
      out.write("                $(this).css('color','#373a40');\r\n");
      out.write("           });\r\n");
      out.write("            \r\n");
      out.write("            $(\".navi-menu>li>a\").click(function(){                \r\n");
      out.write("                subMenu.each(function(idx,item){\r\n");
      out.write("                    $(this).hide();\r\n");
      out.write("                })\r\n");
      out.write("                $(this).next().slideToggle();\r\n");
      out.write("             });\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("     <div class=\"nav-top\">\r\n");
      out.write("     ");
if(m != null) { //로그인 된 상태
      out.write(" \r\n");
      out.write("     \t<ul class=\"navbar-nav navi-menu-top\" id=\"login-nav\">\r\n");
      out.write("            <li>\r\n");
      out.write("                <a class=\"nav-top-link\" href=\"/logout\">로그아웃</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("            ");
if(m.getMemberLevel() == 0) {
      out.write("\r\n");
      out.write("                <a class=\"nav-top-link\" href=\"/adminPage\">관리자페이지</a>\r\n");
      out.write("            ");
}else{ 
      out.write("\r\n");
      out.write("                <a class=\"nav-top-link\" href=\"/myPage?memberId=");
      out.print(m.getMemberId());
      out.write("\">마이페이지</a>\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("     ");
}else { 
      out.write("\r\n");
      out.write("     \t<ul class=\"navbar-nav navi-menu-top\" id=\"logout-nav\">\r\n");
      out.write("            <li>\r\n");
      out.write("                <a class=\"nav-top-link\" href=\"/views/member/login.jsp\">로그인</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a class=\"nav-top-link\" href=\"/views/member/join.jsp\">회원가입</a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("     ");
} 
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <img src=\"/img/logo.png\" width=\"100px;\" onclick=\"location.href = '/'\">\r\n");
      out.write("            <h2>STUDIO Mood:</h2>\r\n");
      out.write("            <p>감성을 담는 사진관 </p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("   <nav class=\"navbar navbar-expand-sm sticky-top\">\r\n");
      out.write("        <ul class=\"navbar-nav navi-menu\">\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"#\">about</a>\r\n");
      out.write("                <ul class=\"subMenu\">\r\n");
      out.write("                    <li><a class=\"nav-link sub-nav-item\" href=\"#\">studio 'mood'</a></li>\r\n");
      out.write("                    <li><a class=\"nav-link sub-nav-item\" href=\"#\">오시는 길</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"#\">product</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"#\">gallery</a>\r\n");
      out.write("                <ul class=\"subMenu\">\r\n");
      out.write("                    <li><a class=\"nav-link sub-nav-item\" href=\"#\">개인프로필</a></li>\r\n");
      out.write("                    <li><a class=\"nav-link sub-nav-item\" href=\"#\">바디프로필</a></li>\r\n");
      out.write("                    <li><a class=\"nav-link sub-nav-item\" href=\"#\">단체프로필</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"#\">reservation</a>\r\n");
      out.write("                <ul class=\"subMenu\">\r\n");
      out.write("                    <li><a class=\"nav-link sub-nav-item\" href=\"/test\">예약</a></li>\r\n");
      out.write("                    <li><a class=\"nav-link sub-nav-item\" href=\"/searchReserve\">예약확인</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"#\">board</a>\r\n");
      out.write("                <ul class=\"subMenu\">\r\n");
      out.write("                    <li><a class=\"nav-link sub-nav-item\" href=\"/noticeList?reqPage=1\">공지사항</a></li>\r\n");
      out.write("                    <li><a class=\"nav-link sub-nav-item\" href=\"#\">QnA</a></li>\r\n");
      out.write("                    <li><a class=\"nav-link sub-nav-item\" href=\"#\">review</a></li>\r\n");
      out.write("                    <li><a class=\"nav-link sub-nav-item\" href=\"/faqList?reqPage=1\">FAQ</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<section>\r\n");
      out.write("\t\t<div class=\"content-writer\" style=\"text-align: center; margin: 0 auto; \"width=\"80%\">\r\n");
      out.write("\t\t\t<div class=\"header-text\">공지사항</div>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("\t\t\t<form action=\"/insertNotice\" method=\"post\">\r\n");
      out.write("\t\t\t<table class=\"content-table\">\r\n");
      out.write("\t\t\t\t<tr height=\"30px\">\r\n");
      out.write("\t\t\t\t\t<th width=\"10%\">제목</th>\r\n");
      out.write("\t\t\t\t\t<td width=\"80%\"><input type=\"text\" name=\"noticeTitle\" >\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr height=\"30px\">\r\n");
      out.write("\t\t\t\t\t<th width=\"10%\">작성자</th>\r\n");
      out.write("\t\t\t\t\t<td width=\"80%\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(m.getMemberId() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"noticeWriter\" value=\"admin\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th width=\"10%\">내용</th>\r\n");
      out.write("\t\t\t\t\t<td width=\"80%\"><textarea name=\"noticeContent\" rows=\"3\" col=\"40\" id=\"noticeContent\"></textarea>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t\t<div class=\"button\">\r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"content-btn\" onclick=\"submitContents(this)\">등록</button>\r\n");
      out.write("\t\t\t\t<a href=\"javascript:history.go(-1)\" class=\"content-btn\">취소</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<br><br><br>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\t\t @font-face {\r\n");
      out.write("            font-family: 'S-CoreDream-4Regular';\r\n");
      out.write("            src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_six@1.2/S-CoreDream-4Regular.woff') format('woff');\r\n");
      out.write("            font-weight: normal;\r\n");
      out.write("            font-style: normal;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        @font-face {\r\n");
      out.write("            font-family: 'S-CoreDream-5Medium';\r\n");
      out.write("            src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_six@1.2/S-CoreDream-5Medium.woff') format('woff');\r\n");
      out.write("            font-weight: normal;\r\n");
      out.write("            font-style: normal;\r\n");
      out.write("        }\r\n");
      out.write("        .footer{\r\n");
      out.write("            background-color: rgb(124, 117, 117);\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            width: 100vw;\r\n");
      out.write("            height: 250px;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("        .footerBox{\r\n");
      out.write("            margin: 20px;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            display: inline-block\r\n");
      out.write("        }\r\n");
      out.write("        .footerBox >h2{\r\n");
      out.write("       \t\tfont-family: 'S-CoreDream-5Medium';\r\n");
      out.write("            color: rgb(241, 209, 209);\r\n");
      out.write("            font-size: 18pt;\r\n");
      out.write("        }\r\n");
      out.write("        .footerBox>p{\r\n");
      out.write("        \tfont-family: 'S-CoreDream-4Regular';\r\n");
      out.write("        \tfont-size: 9pt;\r\n");
      out.write("            color: rgb(241, 238, 238);\r\n");
      out.write("        }\r\n");
      out.write("        .footer-top,\r\n");
      out.write("        .footer-bottom{\r\n");
      out.write("        \tmargin : 0 auto;\r\n");
      out.write("            width: 1198px;\r\n");
      out.write("        }\r\n");
      out.write("        .footer-bottom{\r\n");
      out.write("          color: rgba(241, 238, 238, 0.8);\r\n");
      out.write("          font-size: 10pt;\r\n");
      out.write("        }\r\n");
      out.write("        .icon{\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        .icon>img{\r\n");
      out.write("            \r\n");
      out.write("            width: 50px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <footer>\r\n");
      out.write("       <div class=\"footer\">\r\n");
      out.write("           <div class=\"footer-top\">\r\n");
      out.write("                <div class=\"footerBox company-info\" width:310px;>\r\n");
      out.write("                <h2>COMPANY INFO</h2>\r\n");
      out.write("                <p>\r\n");
      out.write("                    Company : 스튜디오무드 <br>\r\n");
      out.write("                    Business-License : 888-999-33333<br>\r\n");
      out.write("                    Tel: 02-3333-5555<br>\r\n");
      out.write("                    Email : mood_studio@gmail.com<br>\r\n");
      out.write("                    Addr : 서울특별시 강남구 사진관로 34번길<br>\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footerBox bank-info\" width:180px;>\r\n");
      out.write("                <h2>BANK INFO</h2>\r\n");
      out.write("                <p>\r\n");
      out.write("                    농협 : 333-8888-5555-44 <br>\r\n");
      out.write("                    국민 : 888999-01-33333<br><br>\r\n");
      out.write("                    예금주: 스튜디오 분위기<br><br>\r\n");
      out.write("                    \r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footerBox cs\" width:230px;>\r\n");
      out.write("                <h2>CS CENTER</h2>\r\n");
      out.write("                <p>\r\n");
      out.write("                    tel : 010-2222-5555 <br>\r\n");
      out.write("                    mail : mood_studio@gmail.com<br><br><br><br>\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("           <div class=\"footerBox icon\" width:130px;>    \r\n");
      out.write("               <img src=\"/img/Facebook_1.png\">\r\n");
      out.write("               <img src=\"/img/Twitter_1.png\">\r\n");
      out.write("               <img src=\"/img/Instagram_1.png\">\r\n");
      out.write("               <p><br><br><br><br></p>\r\n");
      out.write("           </div>\r\n");
      out.write("           </div>\r\n");
      out.write("           \r\n");
      out.write("            <div class=\"footer-bottom\">\r\n");
      out.write("                <p>Copyright &copy; 2020 by Studiomood All Right Reserved</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("       </div>\r\n");
      out.write("       \r\n");
      out.write("   </footer>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tvar oEditors = [];\r\n");
      out.write("\t\t\tnhn.husky.EZCreator.createInIFrame({\r\n");
      out.write("\t\t\t\toAppRef : oEditors,\r\n");
      out.write("\t\t\t\telPlaceHolder : \"noticeContent\",\r\n");
      out.write("\t\t\t\tsSkinURI : \"/nse_files/SmartEditor2Skin2.html\",\r\n");
      out.write("\t\t\t\tfCreator : \"createSEditor2\"\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tfunction submitContents(elClickedObj) {\r\n");
      out.write("\t\t\t\toEditors.getById[\"noticeContent\"].exec(\"UPDATE_CONTENTS_FIELD\", []); // 에디터의 내용이 textarea에 적용됩니다. \r\n");
      out.write("\t\t\t\t// 에디터의 내용에 대한 값 검증은 이곳에서 document.getElementById(\"ir1\").value를 이용해서 처리하면 됩니다.\r\n");
      out.write("\r\n");
      out.write("\t\t\t\ttry {\r\n");
      out.write("\t\t\t\t\telClickedObj.form.submit();\r\n");
      out.write("\t\t\t\t} catch (e) {\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
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
