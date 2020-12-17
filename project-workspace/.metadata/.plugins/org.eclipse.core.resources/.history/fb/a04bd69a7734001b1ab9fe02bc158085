<%@page import="member.model.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
         .post-write>form>table{
        width:100%;
        }
      .btn-post{
          margin-top: 30px;
          margin-bottom: 30px;
            width: 100px;
            height: 50px;
            font-weight: bold;
            font-size: 18px;
           background-color: #dfd3d3;
            color:#4a4a4a;
            border: none;
            border-radius: 5px;
        }
        .post-write>form>table>tbody>tr>td>input{
            border: none;
        }
        .post-write>form>table>tbody>tr{
            border: 1px solid #b8b0b0;
            resize: none;
            outline: none;
            height: 40px;
            font-size:17px;
        }
        .post-write>form>table>tbody>tr>td{
         border: 1px solid #b8b0b0;
        }
         .post-write>form>table>tbody>tr>td>textarea{
           border:none;
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
<%@ include file="/WEB-INF/views/common/header.jsp"%>
    	<section>
		<div class="post-write">
			<form action="/insertPost" method="post" enctype="multipart/form-data">
				<table>
					<tr>
						<th width="20%">제목</th>
                        <td><input type="text" class="form-control" name="postTitle" style="width: 80%; outline: none; "></td>
					</tr>
				
					<tr>
						<th width="20%">작성자</th>
						<td width="80%"><%=m.getMemberId() %>
						<input type="hidden" name="postWriter" value="<%=m.getMemberId() %>">
						</td>
					</tr>
						<tr>
						<th width="20%">첨부파일</th>
						<td width="80%"><input type="file" name="filename"></td>
					</tr>
					<tr>
						<td colspan="2"><textarea name="postContent" class="form-control" style="width: 100%; height: 500px; box-sizing: border-box;"></textarea></td>
					</tr>
					<tr style="text-align:center; border:none;" >
						<td colspan = "2" style="border:none;">
							<button type="submit" class="btn-post" style="outline:none;">등록</button>
							<button class="btn-post" style="outline:none;">취소</button>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</section>
	<%@ include file="/WEB-INF/views/common/footer.jsp" %>
	
	<script>
	$(".post-cancle").click(function(){
		confirm("작성하시던 글은 삭제됩니다. 등록 취소하시겠습니까?");
	});
	
	
	</script>
</body>
</html>