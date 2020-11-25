/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.59
 * Generated at: 2020-11-25 04:32:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.post;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;
import post.model.vo.PostComment;
import java.util.ArrayList;
import post.model.vo.Post;

public final class postView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("post.model.vo.PostComment");
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
      out.write("\r\n");
      out.write("    ");

    Member m = (Member)request.getAttribute("m");
    Post p = (Post)request.getAttribute("p");
    ArrayList<PostComment> list = (ArrayList<PostComment>)request.getAttribute("list");
    
    
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        .postView {\r\n");
      out.write("            width: 80%;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\t\t.postView>table>tbody>tr>th>a{\r\n");
      out.write("\t\t \ttext-decoration: none;\r\n");
      out.write("            color: black;\r\n");
      out.write("            display:inline-block;\r\n");
      out.write("            width:100px;\r\n");
      out.write("            height : 38px;\r\n");
      out.write("            border: 2px solid #FBB1B5;\r\n");
      out.write("            line-height : 38px;\r\n");
      out.write("\t\t}\r\n");
      out.write("        .btn-post {\r\n");
      out.write("            margin-top: 30px;\r\n");
      out.write("            margin-bottom: 30px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            font-size: 17px;\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .postView>table {\r\n");
      out.write("            border-spacing: 0;\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .firstth {\r\n");
      out.write("            text-align: left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\t\t.postView>table>tbody>tr>td{\r\n");
      out.write("\t\tborder-top: 1px solid #dfd3d3;\r\n");
      out.write("        }\r\n");
      out.write("        .postView>table>tbody>tr:nth-child(4)>td{\r\n");
      out.write("\t\tborder-bottom: 1px solid #dfd3d3;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .inputComment {\r\n");
      out.write("            height: 150px;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            background-color: rgb(250, 228, 227);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .inputComment>form>ul {\r\n");
      out.write("\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .inputComment>form>ul>li {\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            float: left;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .inputComment>form>ul>li:first-child {\r\n");
      out.write("            width: 85%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .inputComment>form>ul>li:nth-child(2) {\r\n");
      out.write("            width: 15%;\r\n");
      out.write("            line-height: 100px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .postCommenttext {\r\n");
      out.write("            outline: none;\r\n");
      out.write("            width: 95%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-postView {\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            height: 60px;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            color: white;\r\n");
      out.write("            border: none;\r\n");
      out.write("            background-color: #FBB1B5;\r\n");
      out.write("        }\r\n");
      out.write("        .commentList{\r\n");
      out.write("        border-top : 3px solid #b8b0b0;\r\n");
      out.write("        \r\n");
      out.write("        }\r\n");
      out.write("\t\t.commentList>ul{\r\n");
      out.write("\t\tpadding : 0;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.commentList>ul>li{\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("list-style-type: none;\r\n");
      out.write("overflow: hidden;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.commentList>ul>li>p{\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t\tmargin :0;\r\n");
      out.write("\t\theight :30px;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.commentList>ul>li:first-child>p{\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.commentList>ul>li>p:nth-child(2){\r\n");
      out.write("\t\ttext-align: right;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.commentList>ul>li:nth-child(2)>p{\r\n");
      out.write("\t\tborder-bottom:  2px solid #b8b0b0;\r\n");
      out.write("\t\t}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <section>\r\n");
      out.write("        <div class=\"postView\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th class=\"firstth\" colspan=\"2\" style=\"width: 1000px; height: 50px; font-size: 30px; font-weight: bold;border-top: 3px solid #FBB1B5;\">");
      out.print(p.getPostTitle() );
      out.write("</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td style=\"height: 30px;\">");
      out.print(p.getPostWriter() );
      out.write("</td>\r\n");
      out.write("                    <td>작성일 : ");
      out.print(p.getPDate() );
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td style=\"width: 20%;\">첨부파일</td>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                    <td>\r\n");
      out.write("                    ");
if(p.getFilename() != null) {
      out.write("\r\n");
      out.write("\t\t\t\t\t<img src=\"/img/file.png\" width=\"16px\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:fileDownload('");
      out.print(p.getFilename() );
      out.write('\'');
      out.write(',');
      out.print(p.getFilepath() );
      out.write("')\">");
      out.print(p.getFilename() );
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td colspan=\"2\">");
      out.print(p.getPostContentBr() );
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th colspan=\"2\">\r\n");
      out.write("                        ");
if(m!=null && m.getMemberId().equals(p.getPostWriter())) {
      out.write("\r\n");
      out.write("                        <a href=\"/postUpdateFrm?postNo=\"");
      out.print(p.getPostNo() );
      out.write("\" class=\"btn-post\">수정하기</a>\r\n");
      out.write("                        <a href=\"/postDelete?postNo=\"");
      out.print(p.getPostNo() );
      out.write("\" class=\"btn-post\">삭제하기</a>\r\n");
      out.write("                        ");
} 
      out.write("\r\n");
      out.write("                        <a href=\"javascript:history.go(-1)\" class=\"btn-post\">목록으로</a>\r\n");
      out.write("                    </th>\r\n");
      out.write("                    \r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <div class=\"commentList\">\r\n");
      out.write("            ");
for(PostComment pc : list) {
      out.write("\r\n");
      out.write("            \t<ul>\r\n");
      out.write("            \t\t<li>\r\n");
      out.write("            \t\t\t<p style=\"width : 20%;\">");
      out.print(pc.getPostCommentWriter() );
      out.write("</p>\r\n");
      out.write("            \t\t\t<p style=\"width : 80%; text-align: right;\">");
      out.print(pc.getPostCommentDate() );
      out.write("</p>\r\n");
      out.write("            \t\t</li>\r\n");
      out.write("            \t\t<li>\r\n");
      out.write("            \t\t<p style=\"width : 100%;\">");
      out.print(pc.getPostCommentContentBr() );
      out.write("</p>\r\n");
      out.write("            \t\t<textarea name = \"postCommentContent\" class=\"changeComment\" style=\"display:none;\">");
      out.print(pc.getPostCommentContent() );
      out.write("</textarea>\r\n");
      out.write("            \t\t");
if(m != null) {
      out.write("\r\n");
      out.write("            \t\t<p class=\"linkBox\">\r\n");
      out.write("            \t\t");
if(m.getMemberId().equals(pc.getPostCommentWriter())) {
      out.write("\r\n");
      out.write("            \t\t<a href=\"javascript:void(0)\" onclick=\"modifyComment(this,'");
      out.print(pc.getPostCommentNo() );
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(p.getPostNo() );
      out.write("')\">수정</a>\r\n");
      out.write("            \t\t<a href=\"javascript:void(0)\" onclick=\"deleteCommnet(this,'");
      out.print(pc.getPostCommentNo() );
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(p.getPostNo() );
      out.write("')\">삭제</a>\r\n");
      out.write("            \t\t");
} 
      out.write("\r\n");
      out.write("            \t\t</p>\r\n");
      out.write("            \t\t</li>\r\n");
      out.write("            \t</ul>\r\n");
      out.write("            \t\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
if(m!=null) {
      out.write("\r\n");
      out.write("            <div class=\"inputComment\">\r\n");
      out.write("                <form action=\"/insertPostCommnet\" method=\"post\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <input type=\"hidden\" name=\"postCommnetLevel\" value=\"1\">\r\n");
      out.write("                            <input type=\"hidden\" name=\"postCommnetWriter\" value=");
      out.print(m.getMemberId() );
      out.write(">\r\n");
      out.write("                            <input type=\"hidden\" nmae=\"postRef\" value=");
      out.print(p.getPostNo() );
      out.write(">\r\n");
      out.write("                            <textarea class=\"postCommenttext\"style=\"height: 100px;resize: none;\"name=\"postCommnetContent\"></textarea>                           \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li style=\"text-align: center;\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn-postView\" >등록</button>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </form>\r\n");
      out.write("                \r\n");
      out.write("            </div>    \r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    </section>\r\n");
      out.write("    <script>\r\n");
      out.write("    function fileDownload(filename,filepath){\r\n");
      out.write("    \tvar url = \"/postFileDowmload\";\r\n");
      out.write("    \tvar encFilename = encodeURIComponent(filename);\r\n");
      out.write("    \tvar encFilepath = encodeURIComponent(filepath);\r\n");
      out.write("    \tlocation.href=url+\"?filename=\"+encFilename+\"&filepath=\"+encFilepath;\r\n");
      out.write("    }\r\n");
      out.write("    function modifyComment(obj, commnetNo, postNo){\r\n");
      out.write("    \t$(obj).parent().prev().show();\r\n");
      out.write("    \t$(obj).parent().prev().prev().hide();\r\n");
      out.write("    \t$(obj).html('수정완료')\r\n");
      out.write("    \t$(obj).attr('onclick','modifyComplete(this,)\"'+commentNo+'\",\"'+postNo+'\")');\r\n");
      out.write("    \t$(obj).next().html('취소');\r\n");
      out.write("    \t$(obj).next().attr('onclick','modifycancel(this,\"'+commentNo+'\",\"'+postNo+'\")');\r\n");
      out.write("    \t$(obj).next().next().hide();\r\n");
      out.write("    }\r\n");
      out.write("    function modifycancel(obj, commentNo, postNo){\r\n");
      out.write("    \t$(obj).parent().prev().hide();\r\n");
      out.write("    \t$(obj).parent().prev().prev().show();\r\n");
      out.write("    \t$(obj).prev().html('수정');\r\n");
      out.write("    \t$(obj).prev().attr('onclick','modifyComment(this,\"'+commentNo+'\",\"'+postNo+'\")');\r\n");
      out.write("    \t$(obj).html('삭제');\r\n");
      out.write("    \t$(obj).attr('onclick','modifyComment(this,\"'+commentNo+'\",\"'+postNo+'\")')\r\n");
      out.write("    \t$(obj).next().show();\r\n");
      out.write("    }\r\n");
      out.write("    function modifyComplete(obj, commentNo, postNo){\r\n");
      out.write("    \tvar form = $(\"<form action='/postCommentUpdate' method='post'></form>\");\r\n");
      out.write("    \tform.append($(\"<input type='text' name='postCommentNo' value='\"+commentNo+\"'>\"));\r\n");
      out.write("    \tform.append($(\"<input type='text' name='postNo' value='\"+postNo+\"'>\"));\r\n");
      out.write("    \tform.appent($(obj).parent().prev());\r\n");
      out.write("    \t$(\"body\").append(form);\r\n");
      out.write("    \tform.submit();\r\n");
      out.write("    }\r\n");
      out.write("    function deleteComment(obj, commentNo, postNo){\r\n");
      out.write("    \tif(confirm(\"댓글을 삭제하시겠습니까?\")){\r\n");
      out.write("    \t\tlocation.href=\"/postCommentDelete?postCommentNo=\"+commentNo+\"&postNo=\"+postNo;\t\r\n");
      out.write("    \t}\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
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
