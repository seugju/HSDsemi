<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
        .join-table-wrap {
            width: 80%;
            margin: 0 auto;
            text-align: center;
        }

        .join-title {
            width: 200px;
            margin: 0 auto;
            text-align: center;
            border-bottom: 3px solid rgba(252, 157, 154, 0.87);
        }

        input {
            width: 265px;
            height: 25px;
            outline: none;
        }

        input[type=radio] {
            display: none;
        }

        input[name=gender]+label {
            display: inline-block;
            height: 37px;
            line-height: 37px;
            width: 130px;
            text-align: center;
            border: 1px solid #1f4787;
            color: #1f4787;
        }

        input[name=gender]:checked+label {
            background-color: rgb(94, 94, 94);
            color: #fff;

        }

        input[type=checkbox] {
            width: 30px;
            height: 20px;
        }

        .join-table {
            margin: 0 auto;
            text-align: left;
        }

        .join-table th {
            width: 150px;
            
        }

        .join-table td {
            width: 500px;
            height: 30px;
        }

        .join-table th,
        .join-table td {
            border-top: 1px solid gray;
            height: 40px;
        }
        .gender-td{
            padding:5px; 
        }
        #idMsg,
        #pwMsg{
        	font-size: 9pt;
        }

        .most {
            color: orangered;
        }

        .submit {
            margin: 0 auto;
            width: 150px;
            height: 35px;
            background-color: rgb(94, 94, 94);
            color: rgb(248, 246, 246);
            
        }
    </style>
</head>
<body>
<%@ include file="/WEB-INF/views/common/header.jsp" %>

  <div class="join-title">
        <h3>회원가입</h3>
    </div>
    <br><br>
	<form action="/join" method="post" id="memberJoin">
		<div class="join-table-wrap">
	        <table class="join-table">
	            <tr>
	                <th><span class="most">*</span> 아이디</th>
	                <td>
	                    <input type="text" name="memberId" id="memberId"><span id="idMsg"></span>
	                </td>
	
	            </tr>
	            <tr>
	                <th><span class="most">*</span> 비밀번호</th>
	                <td>
	                    <input type="password" name="memberPw" id="memberPw">
	                </td>
	            </tr>
	            <tr>
	                <th><span class="most">*</span> 비밀번호 확인</th>
	                <td>
	                    <input type="password" name="memberPw-re" id="memberPw_re"><span id="pwMsg"></span>
	                </td>
	            </tr>
	            <tr>
	                <th><span class="most">*</span> 이름</th>
	                <td>
	                    <input type="text" name="memberName" id="name">
	                </td>
	            </tr>
	            <tr>
	                <th><span class="most">*</span> 전화번호</th>
	                <td>
	                    <input type="text" name="phone" id="phone">
	                </td>
	            </tr>
	            <tr>
	                <th> 주소</th>
	                <td>
	                    <input type="text" name="email" id="email">
	                </td>
	            </tr>
	            <tr>
	                <th> 성별</th>
	                <td class="gender-td">
	                    <input type="radio" name="gender" value="남" id="m"><label for="m">남자</label>
	                    <input type="radio" name="gender" value="여" id="f"><label for="f">여자</label>
	                </td>
	            </tr>
	            <tr>
	                <th> 생년월일</th>
	                <td>
	                    <input type="text" name="birth" id="birth">
	                </td>
	            </tr>
	            <tr>
	                <td colspan="2" style="text-align: center">
	                    <input type="checkbox" name="agree" id="agree">
	                    <a href="#">이용약관</a>개인정보 사용 동의
	                </td>
	            </tr>
	        </table>
	        
	        <input class="submit" type="submit" value="회원가입">
	    </div>
	</form>
   
	<script>
		$("#memberId").keyup(function(){
			var memberId = $(this).val();
			
			$.ajax({
				url : "/ajaxCheckedId",
				type : "get",
				data : {memberId:memberId},
				success : function(data){
					var msg = $("#idMsg");
					if(data == 1){
						msg.html("  사용 가능한 아이디 입니다.");
						msg.css('color','blue');
					}else{
						msg.html("  이미 사용중인 아이디 입니다.");
						msg.css('color','orangered');
					}
				}
			})
		})
	
	</script>

</body>
</html>