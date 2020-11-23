<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    <style>
        .content{
            width: 100%;
            
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
        table{
            width: 80%;
            border-top: 4px solid rgb(252, 157, 154);
            border-left: 1px solid lightgray;
            border-bottom: 4px solid rgb(252, 157, 154);
            border-right: 1px solid lightgray;
        }
        .write-btn{
            width: 80px;
            height: 40px;
            font-size: 17px;
            text-align: center;
            background-color: white;
            border: 2px solid rgb(252, 157, 154);
            border-radius: 5px;
            margin-bottom: 10px;
            
        }
        .write{
            width: 80%;
            text-align: right;
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
            margin-top: 50px;
            width: 100px;
            height: 38px;
            font-weight: bold;
            font-size: 17px;
            background-color: white;
            border: 2px solid rgb(252, 157, 154);
            border-radius: 5px;
        }
        
    </style>
</head>
<body>
 <div class="content">
   <section>
       <div class="pink">공지사항</div>
       <br>
       <br>
       <br>
<%--        	<%
			if (m != null && m.getMemberLevel() == 1) {
		%>
		<div class="write">
			<a href="/noticeWriteFrm" class="write-btn">글쓰기</a>
		</div>
		<%
			}
		%> --%>
       <table>
           <tr>
               <th width="10%">No.</th>
               <th width="50%">제목</th>
               <th width="15%;">이름</th>
               <th width="15%;">날짜</th>
               <th width="10%;">조회수</th>
           </tr>
          <tr>
               <td></td>
               <td><td>
               <td></td>
               <td></td>
               <td></td>
           </tr>
       </table>
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