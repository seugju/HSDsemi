<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<body>
	<h1>서버 테스트</h1>
	<h3><a href="/postList?reqPage=1">후기</a></h3>
	<a href="/noticeList?reqPage=1">공지사항</a>
	<h3><a href="/searchReserve">예약조회</a></h3>
	<h3><a href="/reservationAllSearch">예약조회(관리자)</a></h3>
	<h3><button id="finalLogic">finalLogic</button></h3>
	<h3><button id="test">2020-11-27</button></h3>
</body>
<script type="text/javascript">
	$("#test").click(function(){
		var test = $("#test");
		console.log(test.html());
		location.href='/test?rDate='+test.html();
	});
	$("#finalLogic").click(function(){
		location.href="/test";
	});
</script>
</html>