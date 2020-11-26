<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="/WEB-INF/views/common/header.jsp" %>
	<h1>서버 테스트</h1>
	<h3><a href="/postList?reqPage=1">후기</a></h3>
	<h3><a href="/qnaList?reqPage=1">qna</a></h3>
<%@ include file="/WEB-INF/views/common/footer.jsp" %>
</body>
</html>