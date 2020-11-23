<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section>
		<div>
			<form action="/insertNotice" method="post" enctype="multipart/form-data">
				<table class = "table table-bordered">
					<tr>
						<th colspan="2">공지사항 작성</th>
					</tr>
					<tr>
					<th>제목</th>
					<td><input type="text" class="form-control" name="noticeTitle"></td>
					</tr>
					<tr>
						<th>첨부파일</th>
						<td><input type="file" name="filename"></td>
					</tr>
					<tr>
						<th>작성자</th>
						<td><%=m.getMemberId() %>
						<input type="hidden" name="noticeWriter" value="<%=m.getMemberId() %>">
						</td>
					</tr>
					<tr>
						<th>내용</th>
						<td><textarea name="noticeContent" class="form-control" rows="3" col="40"></textarea></td>
					</tr>
					<tr style="text-align:center;">
						<th colspan = "2">
							<button type="submit" class="btn btn-primary">등록하기</button>
						</th>
					</tr>
				</table>
			</form>
		</div>
	</section>
</body>
</html>