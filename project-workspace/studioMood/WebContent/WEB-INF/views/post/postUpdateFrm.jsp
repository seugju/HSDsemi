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
  .post-write{
            width: 80%;
            margin: 0 auto;
            
        }
      .btn-post{
          margin-top: 30px;
          margin-bottom: 30px;
            width: 100px;
            height: 38px;
            font-weight: bold;
            font-size: 17px;
            background-color: white;
            border: 2px solid #FBB1B5;
            border-radius: 5px;
        }
        .post-write>form>table>tbody>tr>td>input{
            border: none;
        }
        .post-write>form>table>tbody>tr>th:first-child{
            border-top: 1px solid lightgray;
            border-left: 1px solid lightgray;
            border-right: 1px solid lightgray;
            resize: none;
            outline: none;
            height: 30px;
        }
        .post-write>form>table>tbody>tr>td:nth-child(2){
            border-top: 1px solid lightgray;
            border-left: 1px solid lightgray;
            border-right: 1px solid lightgray;
        }
         .post-write>form>table>tbody>tr>td>textarea{
            border-top: 1px solid lightgray;
            border-left: 1px solid lightgray;
            border-right: 1px solid lightgray;
             border-bottom: 1px solid lightgray;
            resize : none;
            outline: none;
        }
        
        .post-write>form>table{
             border-spacing: 0;
             margin-top:50px;
        }
       

</style>
</head>
<body>
	<section>
		<div class="postUpdate" style="width:80%;margin:0 auto">
		<form action="/postUpdate" method="post" enctype="multipart/form-data">
		<input type="hidden" name="postNo" value="<%=p.getPostNo() %>">
		<table class="updateTable">
		<tr>
			<th width="150px">제목</th>
            <td><input type="text" class="form-control" name="postTitle" style="width: 500px; outline: none;" value="<%=p.getPostTitle()%>"></td>	
		</tr>
		<tr>
						<th width="150px">작성자</th>
						<td width="500px"><%=p.getPostWriter() %>
						</td>
					</tr>
						<tr>
						<!-- status를 통한 파일 삭제 여부 (delete와 stay로 서블릿에서 구분) -->
						<th width="150px">첨부파일</th>
						<td width="500px"><input type="hidden" id="status" name="status" value="stay">
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
						<td colspan="2"><textarea name="postContent" style="width: 655px; height: 500px;"><%=p.getPostContent() %></textarea></td>
					</tr>
					<tr style="text-align:center;">
						<td colspan = "2">
							<button type="submit" class="btn-post">수정완료</button>
							<a href="/postList?reqPage=1" class="btn-post">목록으로</a>
						</td>
					</tr>
		</table>
		</form>
	</section>
	
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