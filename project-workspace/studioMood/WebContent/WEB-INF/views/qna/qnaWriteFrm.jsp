<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
            height: 38px;
            font-weight: bold;
            font-size: 17px;
            background-color: white;
            border: 2px solid #f1d1d1;
            border-radius: 5px;
        }
        .post-write>form>table>tbody>tr>td>input{
            border: none;
        }
        .post-write>form>table>tbody>tr>th:first-child{
            border-top: 1px solid #b8b0b0;
            border-left: 1px solid #b8b0b0;
            border-right: 1px solid #b8b0b0;
            resize: none;
            outline: none;
            height: 30px;
        }
        .post-write>form>table>tbody>tr>td:nth-child(2){
            border-top: 1px solid #b8b0b0;
            border-left: 1px solid #b8b0b0;
            border-right: 1px solid #b8b0b0;
        }
         .post-write>form>table>tbody>tr>td>textarea{
            border-top: 1px solid #b8b0b0;
            border-left: 1px solid #b8b0b0;
            border-right: 1px solid #b8b0b0;
             border-bottom: 1px solid #b8b0b0;
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
		<div class="qna-write">
			<form action="/insertQna" method="post">
				<table>
					<tr>
						<th width="20%">제목</th>
                        <td><input type="text" name="qTitle" style="width: 80%; outline: none; "></td>
					</tr>
				
					<tr>
						<th width="20%">작성자</th>
						<td width="80%"><%=m.getMemberId() %>
						<input type="hidden" name="qWriter" value="<%=m.getMemberId() %>">
						</td>
					</tr>
					<tr>
						<td colspan="2"><textarea name="qContent" style="width: 100%; height: 500px; box-sizing: border-box;"></textarea></td>
					</tr>
				<tr>
				<td colspan = "2">
				    <label><input type="radio" name="open" value="0" checked> 공개</label>
      				<label><input type="radio" name="open" value="1"> 비공개</label>
				</td>
				</tr>
					<tr style="text-align:center;">
						<td colspan = "2">
							<button type="submit" class="btn-post">등록</button>
							<button class="btn-post q-cancle">등록 취소</button>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</section>
	
	<script>
	$(".q-cancle").click(function(){
		confirm("작성하시던 글은 삭제됩니다. 등록 취소하시겠습니까?");
	});
	
	
	</script>
</body>
</html>