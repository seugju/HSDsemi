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
		width:80%;
		height:40vw;
		max-height:500px;
		text-align:center;
		display: flex;
		justify-content: center;
		align-items: center;
		border: 1px solid black;
	}
	#btn{
		border:none;
		width: calc(100%/3);
	}
	table{
		margin:0 auto;
		width: 80%;
		height: 80%;
		font-family: 'S-CoreDream-5Medium';
 		src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_six@1.2/S-CoreDream-5Medium.woff') format('woff');
		font-weight: normal;
 		font-style: normal;
	}
	#btns{
		width: 90%;
	}
</style>
<body>

<%@ include file="/WEB-INF/views/common/header.jsp"%>
</div>
	<div id="table-content">	
	<table border="2">
		
		<tr>
			<th>예약번호</th>			
			<td colspan="2"><%=r.getrNum() %></td>
		</tr>
		<tr>
			<th>이름</th>
			<td colspan="2"><%=r.getName() %></td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td colspan="2"><%=r.getPhone() %></td>
		</tr>
		<tr>
			<th>예약날짜</th>
			<td colspan="2"><%=r.getrDate() %></td>
		</tr>
		<tr>
			<th>시작시간</th>
			<td colspan="2"><%=r.getsTime() %></td>
		</tr>
		<tr>
			<th>종료시간</th>
			<td colspan="2"><%=r.geteTime() %></td>
		</tr>
		<tr>
			<th>컨셉</th>
			<td colspan="2"><%=r.getConcept() %></td>
		</tr>
		<tr>
			<th>컷수</th>	
			<td colspan="2"><%=r.getCutNum() %></td>
		</tr>
		<tr>
			<th>예약확인</th>
			<td colspan="2"><%=r.getrCheck() %></td>
		</tr>
		<tr>
			<th>예약비밀번호</th>
			<td colspan="2"><%=r.getrPass() %></td>
		</tr>	
		
		<tr id="btns">
			<!--  td id="btn"><button type="button" onclick="location.href='/reserveUpdate?phone=<%=r.getPhone() %>' ">예약수정하기</button></td-->
			<td id="btn"><button type="button" onclick="location.href='/수정페이지?phone=<%=r.getPhone() %>' ">예약수정하기</button></td>
			<td id="btn"><button type="button" onclick="location.href='/reserveDelete?phone=<%=r.getPhone() %>' ">예약취소하기</button></td>
			<td id="btn"><button type="button" onclick="location.href='/' ">결제하기</button></td>
		</tr>
	</table>
	</div>
	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</div>
</body>
</html>