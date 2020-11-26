<%@page import="reservation.model.vo.Reservation"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	ArrayList<Reservation> list = (ArrayList<Reservation>)request.getAttribute("reservationList");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
	}
	table{
		margin:0 auto;		
	}
</style>
<body>
<div id="table-content">
	<table border="1px">
		<tr>
			<th>예약번호</th><th>이름</th><th>전화번호</th><th>예약날짜</th><th>시작시간</th><th>종료시간</th><th>컨셉</th><th>컷수</th><th>예약확인</th><th>예약비밀번호</th>
		</tr>
		<%if(list.size()!=0){ %>
		<%for(int i=0;i<list.size();i++) {%>
		<tr>
			<td><%= list.get(i).getrNum()%></td>
			<td><%= list.get(i).getName()%></td>
			<td><%= list.get(i).getPhone()%></td>
			<td><%= list.get(i).getrDate()%></td>
			<td><%= list.get(i).getsTime()%></td>
			<td><%= list.get(i).geteTime()%></td>
			<td><%= list.get(i).getConcept()%></td>
			<td><%= list.get(i).getCutNum()%></td>
			<td><%= list.get(i).getrCheck()%></td>
			<td><%= list.get(i).getrPass()%></td>
		</tr>
		<%} %>
		<%} else{ %>
		<tr>
			<th colspan="10">데이터가 없습니다.</th>
		</tr>
		<%} %>
	</table>
	</div>
</body>
</html>