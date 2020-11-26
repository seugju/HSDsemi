<%@page import="qna.model.vo.Qna"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%
    ArrayList<Qna> list = (ArrayList<Qna>)request.getAttribute("list");
        System.out.println(list.size());
    String pageNavi = (String)request.getAttribute("pageNavi");
    String keyword = (String)request.getAttribute("keyword");
    if(keyword == null){
    	keyword="";
    }
    String type = (String)request.getAttribute("type");
    if(type == null){
    	type = "qnaWriter";
    }
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <style>
        .content{
            width: 80%;
            margin : 0 auto;
            
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
            border-bottom: 4px solid #f1d1d1;
        }
         .post-table>tbody>tr>td{
            border-top: 1px solid #b8b0b0;
            height : 30px;
        }
        .post-table{
            width: 100%;
            border-top: 4px solid #f1d1d1;
            border-bottom: 4px solid #f1d1d1;
        }
        .post-table>tbody>tr>td{
         text-align: center;
        }
       .post-table>tbody>tr>td>a{
       text-decoration: none;
            color: black;
       
       }
        .post-table>tbody>tr>th{
        height : 35px;
        text-align: center;
        border-bottom: 2px solid #f1d1d1;
        }
       .write>a{
            text-decoration: none;
            color: black;
            display: inline-block;
            width: 80px;
            height: 38px;
            line-height: 34px;
            font-size: 17px;
            text-align: center;
            background-color: white;
            border: 2px solid #f1d1d1;
            border-radius: 5px;
        }
        .write{
        margin-top:-20px;
            width: 100%;
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
            width: 100px;
            height: 32px;
            font-weight: bold;
            font-size: 17px;
            background-color: white;
            border: 2px solid #f1d1d1;
            border-radius: 5px;
        }
        #pageNavi{
            text-align: center;
            margin: 50px;
        }
        .qna>form>select{
        width : 100px;
        height : 30px;
        }
    </style>
</head>
<body>
<%@ include file="/WEB-INF/views/common/header.jsp"%>
  <div class="content">
   <section>
       <div class="pink">QnA</div>
       <br>
       <br>
       
       <%if(m!=null && m.getMemberLevel()==1) {%>
       <div class="write">
       <a href="/qnaWriterFrm" class="write-btn">글쓰기</a>
       </div>
       <%} %>
       <table class="post-table">
       
           <tr>
               <th width="10%">No.</th>
               <th width="50%">제목</th>
               <th width="20%;">이름</th>
               <th width="20%;">날짜</th>
           </tr>
           <%for(Qna q : list) {%>
           
           <%
           System.out.println("11111");
           if(q.getOpenChk().equals("0")){ 
        	   System.out.println("111112");
           %>
	          <tr>
	               <td><%=q.getqNum() %></td>
	               <td><a href="/qnaView?qnaNo=<%=q.getQnaNo()%>"><%=q.getqTitle() %></a></td>
	               <td><%=q.getqWriter() %></td>
	               <td><%=q.getqDate() %></td>
	           </tr>
           <%} %>
           <%} %>
       </table>
       <div id="pageNavi"><%=pageNavi %></div>
       <div class="qna">
       <form action="/searchKeyword">
       <input type="hidden" name="reqPage" value="1">
       <select name="type">
       <%if(type.equals("qWriter")) {%>
       <option value="qWriter" selected>작성자</option>
       <option value="qTitle">제목</option>
       <%}else if(type.equals("qTitle")) {%>
       <option value="qWriter">작성자</option>
       <option value="qTitle" selected>제목</option>
       <%} %>
       </select>
       <input type="text" placeholder="검색어를 입력해주세요." name ="keyword" class="search-text" value = <%=keyword %> >
       <input type="submit" value="검색" class="btn-post">
       </form>
       </div>
   </section>
    </div>
    <br><br><br>
<%@ include file="/WEB-INF/views/common/footer.jsp" %>
</body>
</html>