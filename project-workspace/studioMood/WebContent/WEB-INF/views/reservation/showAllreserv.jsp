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
		width:80%;
		height:50vw;
		text-align:center;
		display: flex;
		justify-content: center;
		align-items: center;
		border: 1px solid black;
	}
	table{
		margin:0 auto;
		width: 100%;
		height: 100%;
		font-family: 'S-CoreDream-5Medium';
 		src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_six@1.2/S-CoreDream-5Medium.woff') format('woff');
		font-weight: normal;
 		font-style: normal;
	}
	#titleLine>th{
		width: calc(100%/11);
		height: 5vw;
	}
	#btn{
		border: none;
		height: 10vw;
	}
	#btn button{
		width: 80%;
		height:60%;
	}
</style>
<body>
<%@ include file="/WEB-INF/views/common/header.jsp"%>
<div id="table-content">
	<table border="1px">
		<tr id="titleLine">
			<th>체크</th><th>예약번호</th><th>이름</th><th>전화번호</th><th>예약날짜</th><th>시작시간</th><th>종료시간</th><th>컨셉</th><th>컷수</th><th>예약확인</th><th>예약비밀번호</th>
		</tr>
		<%for(int i=0; i<list.size();i++){ %>		
		<tr>
			<td><input type="radio" name="temp" class="change"></td>
			<td><%=list.get(i).getrNum() %></td>
			<td><%=list.get(i).getName() %></td>
			<td><%=list.get(i).getPhone() %></td>
			<td><%=list.get(i).getrDate() %></td>
			<td><%=list.get(i).getsTime() %></td>
			<td><%=list.get(i).geteTime() %></td>
			<td><%=list.get(i).getConcept() %></td>
			<td><%=list.get(i).getCutNum() %></td>
			<td><%=list.get(i).getrCheck() %></td>
			<td><%=list.get(i).getrPass() %></td>
		</tr>
		<%} %>		
		<tr>
			<td id="btn" colspan="5"><button type="button" id="btnChangeReserve">변경하기</button></td>
			<td id="btn"></td>
			<td id="btn" colspan="5"><button type="button" id="btnDeleteReserve">취소하기</button></td>
		</tr>
	</table>
	</div>
	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
<script type="text/javascript">
	$("#btnChangeReserve").click(function(){
		var check = $("[type=radio]:checked");
		//location.href="/reserveUpdate";
		console.log(check);
		var rnum = check.parent().next().html();
		console.log(rnum);
	});
	$("#btnDeleteReserve").click(function(){
		console.log("삭제처리");
	});
</script>
</html>