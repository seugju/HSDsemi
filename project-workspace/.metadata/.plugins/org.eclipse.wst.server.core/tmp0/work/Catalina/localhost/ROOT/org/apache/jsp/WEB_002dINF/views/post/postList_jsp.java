/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.59
 * Generated at: 2020-11-23 08:43:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.post;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;
import java.util.ArrayList;
import post.model.vo.Post;

public final class postList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("post.model.vo.Post");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");

    ArrayList<Post> list = (ArrayList<Post>)request.getAttribute("list");
    String pageNavi = (String)request.getAttribute("pageNavi");
    Member m = (Member)session.getAttribute("member");
    
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("   <style>\r\n");
      out.write("        .content{\r\n");
      out.write("            width: 80%;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        .content *{\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("        }\r\n");
      out.write("        .pink{\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("            width: 90px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            font-size: 30px;   \r\n");
      out.write("            border-bottom: 4px solid rgb(252, 157, 154);\r\n");
      out.write("        }\r\n");
      out.write("        .post-table{\r\n");
      out.write("            width: 80%;\r\n");
      out.write("            border-top: 4px solid rgb(252, 157, 154);\r\n");
      out.write("            border-left: 1px solid lightgray;\r\n");
      out.write("            border-bottom: 4px solid rgb(252, 157, 154);\r\n");
      out.write("            border-right: 1px solid lightgray;\r\n");
      out.write("        }\r\n");
      out.write("       .write>a{\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: black;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            width: 80px;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            line-height: 28px;\r\n");
      out.write("            font-size: 17px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            border: 2px solid rgb(252, 157, 154);\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        .write{\r\n");
      out.write("            width: 80%;\r\n");
      out.write("            text-align: right;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("        }\r\n");
      out.write("        .post{\r\n");
      out.write("            width: 80%;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        .search-text{\r\n");
      out.write("            width: 250px;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("        }\r\n");
      out.write("        .btn-post{\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            height: 38px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            font-size: 17px;\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            border: 2px solid rgb(252, 157, 154);\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        #pageNavi{\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin: 50px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("   <section>\r\n");
      out.write("       <div class=\"pink\">후기</div>\r\n");
      out.write("       <br>\r\n");
      out.write("       <br>\r\n");
      out.write("       <br>\r\n");
      out.write("       \r\n");
      out.write("       ");
//if(m!=null && m.getMemberLevel()==1) {
      out.write("\r\n");
      out.write("       <div class=\"write\">\r\n");
      out.write("       <a href=\"/postWriterFrm\" class=\"write-btn\">글쓰기</a>\r\n");
      out.write("       </div>\r\n");
      out.write("       ");
//} 
      out.write("\r\n");
      out.write("       <table class=\"post-table\">\r\n");
      out.write("           <tr>\r\n");
      out.write("               <th width=\"10%\">No.</th>\r\n");
      out.write("               <th width=\"50%\">제목</th>\r\n");
      out.write("               <th width=\"15%;\">이름</th>\r\n");
      out.write("               <th width=\"15%;\">날짜</th>\r\n");
      out.write("               <th width=\"10%;\">조회수</th>\r\n");
      out.write("           </tr>\r\n");
      out.write("           ");
for(Post p : list) {
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("               <th>");
      out.print(p.getpNum() );
      out.write("</th>\r\n");
      out.write("               <th><a href=\"/postView?postNo=");
      out.print(p.getPostNo());
      out.write('"');
      out.write('>');
      out.print(p.getPostTitle() );
      out.write("</a></th>\r\n");
      out.write("               <th>");
      out.print(p.getPostWriter() );
      out.write("</th>\r\n");
      out.write("               <th>");
      out.print(p.getPostWriter() );
      out.write("</th>\r\n");
      out.write("               <th></th>\r\n");
      out.write("           </tr>\r\n");
      out.write("           ");
} 
      out.write("\r\n");
      out.write("       </table>\r\n");
      out.write("       <div id=\"pageNavi\">");
      out.print(pageNavi );
      out.write("</div>\r\n");
      out.write("       <div class=\"post\">\r\n");
      out.write("       <form action=\"\" method=\"get\" id=\"search\">\r\n");
      out.write("       <input type=\"text\" placeholder=\"검색어를 입력해주세요.\" class=\"search-text\">\r\n");
      out.write("       <input type=\"submit\" value=\"검색\" class=\"btn-post\">\r\n");
      out.write("       </form>\r\n");
      out.write("       </div>\r\n");
      out.write("   </section>\r\n");
      out.write("    </div>\r\n");
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