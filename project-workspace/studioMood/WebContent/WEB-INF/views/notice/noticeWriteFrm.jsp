<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	.content-writer *{
		margin: 0 auto;
	}
	
        .header-text {
            margin-top: 50px;
            width: 150px;
            text-align: center;
            font-weight: bold;
            font-size: 30px;
            border-bottom: 4px solid #FBB1B5;
        }
	     .content-table{
             margin-top:50px;
             width:80%;
             border: 1px solid lightgray;
             border-collapse: collapse;
        }
        .content-table tr,th,td{
           
             border: 1px solid lightgray;
             border-collapse: collapse;
             
        }
/*          .content-table input{
           outline:1px solid white;
        } */
		input{
			width:95%;
			border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px;
		}
		input:focus {outline:none;}
		textarea{
			width:95%;
			height:500px;
			border:none;
			resize: none;
		}
		textarea:focus{
			outline:none;
		}
		         .content-btn {
         margin:0 auto;
         display:block;
            width: 80px;
            height: 40px;
            font-weight: bold;
            font-size: 15px;
            text-align: center;
            background-color: #dfd3d3;
            border: 2px solid #dfd3d3;
            border-radius: 5px;
            list-style: none;
            color: #4a4a4a;
             text-decoration: none;
             line-height:40px;
        }
        .button{
        	width:100%;
        	height:50px;
        	text-align:center;
        }
        .button>*{
        	display:inline-block;
        }
        	a{
		 text-decoration: none;
		color: #4a4a4a;
	}
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/common/header.jsp"%>
	<section>
		<div class="content-writer" style="text-align: center; margin: 0 auto; "width="80%">
			<div class="header-text">공지사항</div>
            <br>
            <br>
			<form action="/insertNotice" method="post">
			<table class="content-table">
				<tr height="30px">
					<th width="20%">제목</th>
					<td width="80%"><input type="text" class="form-control" name="noticeTitle" >
					</td>
				</tr>

				<tr height="30px">
					<th width="20%">작성자</th>
					<td width="80%">
						<%-- <%=m.getMemberId() %> --%>
						<input type="hidden" name="noticeWriter" value="admin">
					</td>
				</tr>
				<tr>
					<td colspan="2"><textarea name="noticeContent" class="form-control" rows="3" col="40"></textarea>
				</tr>
	
			</table>
			<br><br>
			<div class="button">
				<button type="submit" class="content-btn">등록</button>
				<button type="button" class="content-btn"><a href="javascript:history.go(-1)">취소</a></button>
			
			</div>
			
			</form>
		</div>
	</section>
		<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>