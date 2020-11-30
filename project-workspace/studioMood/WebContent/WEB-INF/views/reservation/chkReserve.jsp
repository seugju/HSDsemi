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
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Sunflower:wght@500&display=swap" rel="stylesheet">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
	#table-content{
		
		width:80vw;
		height:250px;
	}
	#resv-one-search {
	
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#resv-one-search td{
  border: 1px solid #ddd;
  padding: 8px;
}

#resv-one-search tr{background-color: #f2f2f2;}

#resv-one-search tr:hover {background-color: #ddd;}

#resv-one-search th {
  border:1px solid rgb(241, 209, 209);
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: white;
  color: black;
}
#btn{
	border:0px;
}
.resv-btn{
	width:80vw;
	text-align:center;
	float:left;
}
#table-content h2{
	margin-top:40px;
	margin-bottom:40px;
	text-align:center;
	font-family: 'Sunflower', sans-serif;
}
</style>
<body>

<%@ include file="/WEB-INF/views/common/header.jsp"%>

	<div id="table-content">	
	<div><h2>예약조회</h2></div>
	
	<table id="resv-one-search">
	<tr>
		<th>예약번호</th>
		<th>이름</th>
		<th>전화번호</th>
		<th>예약날짜</th>
		<th>시작시간</th>
		<th>종료시간</th>
		<th>컨셉</th>
		<th>컷수</th>
		<th>예약확인</th>
		<th>예약비밀번호</th>
	</tr>
  
  <tr>
    <td><%=r.getrNum() %></td>
    <td><%=r.getName() %></td>
    <td><%=r.getPhone() %></td>
    <td><%=r.getrDate() %></td>
    <td><%=r.getsTime() %></td>
    <td><%=r.geteTime() %></td>
    <td><%=r.getConcept() %></td>
    <td><%=r.getCutNum() %></td>
    <td><%=r.getrCheck() %></td>
    <td><%=r.getrPass() %></td>
    
  </tr>
  </table>
  <div class="resv-btn">
	<button type="button" onclick="location.href='/수정페이지?phone=<%=r.getPhone() %>' ">예약수정하기</button>
	<button type="button" onclick="location.href='/reserveDelete?phone=<%=r.getPhone() %>' ">예약취소하기</button>
	<button type="button" onclick="location.href='/' ">결제하기</button>
	
</div>
  </div>
		
	<%@ include file="/WEB-INF/views/common/footer.jsp"%>

</body>
</html>