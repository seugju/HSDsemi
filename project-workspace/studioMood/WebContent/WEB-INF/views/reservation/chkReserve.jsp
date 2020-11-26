<%@page import="reservation.model.vo.Reservation"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	Reservation r = (Reservation)request.getAttribute("chkReserve");
    	request.setAttribute("chkReserve",r);
    	String msg = (String)request.getAttribute("alertMsg");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
	#table-content{
		margin:0 auto;
		width:80vw;
		height:60vw;
		text-align:center;
		display: flex;
		justify-content: center;
		align-items: center;
		border: 1px solid black;
	}
	#btn{
		border:none;
	}
	table{
		margin:0 auto;
	}
</style>
<body>
<div id="header"><h4>헤더</h4>
</div>
	<div id="table-content">	
	<table border="2">
		<tr>
			<th>예약번호</th><th>이름</th><th>전화번호</th><th>예약날짜</th><th>시작시간</th><th>종료시간</th><th>컨셉</th><th>컷수</th><th>예약확인</th><th>예약비밀번호</th>
		</tr>		
		<tr>
		<%if(r.getrNum()==0){ %>		
			<td colspan="10">조회결과없음(<%=msg %>)</td>
		<%} else{%>
			<td><%= r.getrNum()%></td>
			<td><%= r.getName()%></td>
			<td><%= r.getPhone()%></td>
			<td><%= r.getrDate()%></td>
			<td><%= r.getsTime()%></td>
			<td><%= r.geteTime()%></td>
			<td><%= r.getConcept()%></td>
			<td><%= r.getCutNum()%></td>
			<td><%= r.getrCheck()%></td>
			<td><%= r.getrPass()%></td>
		</tr>
		<tr>
		<td id="btn" colspan="5"><button type="button" onclick="location.href='/reserveUpdate?phone=<%=r.getPhone()%>' ">예약수정하기</button></td>
		<td id="btn" colspan="5"><button type="button" onclick="location.href='/reserveDelete?phone=<%=r.getPhone()%>' ">예약취소하기</button></td>
		<%} %>
		</tr>
	</table>
	</div>
	<div id="footer"><h4>푸터</h4>
</div>
</body>
</html>