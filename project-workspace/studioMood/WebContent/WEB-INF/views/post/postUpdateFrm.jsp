<%@page import="post.model.vo.Post"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Post p = (Post)request.getAttribute("p");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<style>
  .postUpdate{
            width: 80%;
             margin : 0 auto;
        }
        .btn-post{
        margin-top:10px;
        margin-bottom:10px;
            width: 100px;
            height: 50px;
            font-weight: bold;
            font-size: 18px;
            background-color: #dfd3d3;
            color:#4a4a4a;
            border:none;
            border-radius: 5px;
        }
        .updateTable{
        width:100%;
        }
        .updateTable>tbody>tr>td>input{
            border: none;
        }
        .updateTable>tbody>tr{
            border: 1px solid #b8b0b0;
            resize: none;
            outline: none;
            height: 40px;
            font-size:17px;
        }
        .updateTable>tbody>tr>td{
         border: 1px solid #b8b0b0;
        }
         .updateTable>tbody>tr>td>textarea{
           border:none;
            resize : none;
            outline: none;
        }
        
        .post-write>form>table{
             border-spacing: 0;
             margin-top:50px;
        }
       .btn-a{
       		display:inline-block;
       		line-height:50px;
 			width: 100px;
            height: 50px;
            font-weight: bold;
            font-size: 18px;
            background-color: #dfd3d3;
            color:#4a4a4a;
            border:none;
            outline:none;
            border-radius: 5px;
       }
</style>
</head>
<body>
<%@ include file="/WEB-INF/views/common/header.jsp"%>
	<section>
		<div class="postUpdate">
		<form action="/postUpdate" method="post" enctype="multipart/form-data" style="margin-top:50px;">
		<input type="hidden" name="postNo" value="<%=p.getPostNo() %>">
		<table class="updateTable">
		<tr>
			<th style="width: 20%;">제목</th>
            <td><input type="text" name="postTitle" style="width: 80%; outline: none;" value="<%=p.getPostTitle()%>"></td>	
		</tr>
		<tr>
						<th style="width: 20%;">작성자</th>
						<td style="width: 80%"><%=p.getPostWriter() %>
						</td>
					</tr>
						<tr>
						<!-- status를 통한 파일 삭제 여부 (delete와 stay로 서블릿에서 구분) -->
						<th style="width: 20%;">첨부파일</th>
						<td style="width: 80%"><input type="hidden" id="status" name="status" value="stay">
						<%if(p.getFilename() != null) {%>
						<img src="/img/file.png" width="16px" class="delFile">
						<input type="file" name="filename" id="file" style="display:none;">
						<span class="delFile"><%=p.getFilename() %></span>
						<button type="button" id="fileDelBtn" class="delFile">삭제</button>
						<input type="hidden" name="oldFilename" value="<%=p.getFilename() %>">
						<input type="hidden" name="oldFilepath" value="<%=p.getFilepath() %>">
						<%}else {%>
						<input type="file" name="filename">
						
						<%} %>
						</td>
					</tr>
					<tr>
						<td colspan="2"><textarea name="postContent" style="width:100%; height:500px; vertical-align:top;"><%=p.getPostContent() %></textarea></td>
					</tr>
					<tr style="text-align:center; border:none;">
						<td colspan = "2" style="border:none;">
							<button type="submit" class="btn-post" style="outline:none;">수정</button>
							<a href="javascript:history.go(-1)" class="btn-post btn-a">취소</a>
						</td>
					</tr>
		</table>
		</form>
	</section>
	<%@ include file="/WEB-INF/views/common/footer.jsp" %>
	<script>
	$("#fileDelBtn").click(function(){
		if(confirm("첨부파일을 삭제하시겠습니까?")){
			$(".delFile").hide();
			$("#file").show();
			$("#status").val('delete');
		}
		
	});
	</script>
</body>
</html>