<%@page import="member.model.vo.Member"%>
<%@page import="java.util.ArrayList"%>
<%@page import="post.model.vo.Post"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    ArrayList<Post> list = (ArrayList<Post>)request.getAttribute("list");
    String pageNavi = (String)request.getAttribute("pageNavi");
    Member m = (Member)session.getAttribute("member");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
   <style>
        .content{
            width: 80%;
            
        }
        .content *{
            margin: 0 auto;
        }
        .pink{
            margin-top: 50px;
            width: 90px;
            text-align: center;
            font-weight: bold;
            font-size: 30px;   
            border-bottom: 4px solid rgb(252, 157, 154);
        }
        .post-table{
            width: 80%;
            border-top: 4px solid rgb(252, 157, 154);
            border-left: 1px solid lightgray;
            border-bottom: 4px solid rgb(252, 157, 154);
            border-right: 1px solid lightgray;
        }
       .write>a{
            text-decoration: none;
            color: black;
            display: inline-block;
            width: 80px;
            height: 30px;
            line-height: 28px;
            font-size: 17px;
            text-align: center;
            background-color: white;
            border: 2px solid rgb(252, 157, 154);
            border-radius: 5px;
            
            
        }
        .write{
            width: 80%;
            text-align: right;
            margin-bottom: 10px;
        }
        .post{
            width: 80%;
            text-align: center;
        }
        .search-text{
            width: 250px;
            height: 30px;
        }
        .btn-post{
            margin-top: 20px;
            width: 100px;
            height: 38px;
            font-weight: bold;
            font-size: 17px;
            background-color: white;
            border: 2px solid rgb(252, 157, 154);
            border-radius: 5px;
        }
        #pageNavi{
            text-align: center;
            margin: 50px;
        }
    </style>
</head>
<body>
  <div class="content">
   <section>
       <div class="pink">후기</div>
       <br>
       <br>
       <br>
       
       <%//if(m!=null && m.getMemberLevel()==1) {%>
       <div class="write">
       <a href="/postWriteFrm" class="write-btn">글쓰기</a>
       </div>
       <%//} %>
       <table class="post-table">
           <tr>
               <th width="10%">No.</th>
               <th width="50%">제목</th>
               <th width="15%;">이름</th>
               <th width="15%;">날짜</th>
               <th width="10%;">조회수</th>
           </tr>
           <%for(Post p : list) {%>
          <tr>
               <th><%=p.getpNum() %></th>
               <th><a href="/postView?postNo=<%=p.getPostNo()%>"><%=p.getPostTitle() %></a></th>
               <th><%=p.getPostWriter() %></th>
               <th><%=p.getPostWriter() %></th>
               <th></th>
           </tr>
           <%} %>
       </table>
       <div id="pageNavi"><%=pageNavi %></div>
       <div class="post">
       <form action="" method="get" id="search">
       <input type="text" placeholder="검색어를 입력해주세요." class="search-text">
       <input type="submit" value="검색" class="btn-post">
       </form>
       </div>
   </section>
    </div>
</body>
</html>