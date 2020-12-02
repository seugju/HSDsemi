<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.js"></script>
<title>회원가입</title>
<style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box
        }

        body {
            /* background-color: #f7f7f7;*/
            padding: 110px;
        }

        ul>li {
            list-style: none
        }

        a {
            text-decoration: none;
        }

        .clearfix::after {
            content: "";
            display: block;
            clear: both;
        }

        .clearfix>li {
            font-size: 10pt;
        }

        .wrap-agree {
            margin: 0 auto;
            width: 460px;
            background-color: white;
            z-index: 100;
        }

        ul.join_box {
            border: 1px solid #ddd;
            background-color: #fff;
        }

        .checkBox,
        .checkBox>ul {
            position: relative;
        }

        .checkBox>ul>li {
            float: left;
        }

        .checkBox>ul>li:first-child {
            width: 85%;
            padding: 15px;
            font-weight: 600;
            color: #888;
        }

        .checkBox>ul>li:nth-child(2) {
            position: absolute;
            top: 50%;
            right: 30px;
            margin-top: -12px;
        }

        .checkBox textarea {
            width: 96%;
            height: 90px;
            margin: 0 2%;
            background-color: #f7f7f7;
            color: #888;
            border: none;
        }

        .footBtwrap {
            margin-top: 15px;
            margin-left: 35px;
            margin-bottom: 15px;
        }


        .footBtwrap>li {
            float: left;
            width: 50%;
            height: 60px;
        }

        .footBtwrap>button {
            display: block;
            text-align: center;
            line-height: 60px;
            border-radius: 10px;
            border: 3px solid #FBB1B5;
            color: #FBB1B5;
            outline: none;
        }

        .fpmgBt {     
            font-size : 10pt;
            background-color: transparent;
        }

        .fpmgBt:hover {
            color:#FBB1B5;
        }


        .join-table-wrap {
            width: 80%;
            margin: 0 auto;
            text-align: center;
            z-index: 0;
        }

        .join-title {
            width: 200px;
            margin: 0 auto;
            padding: 15px;
            text-align: center;
            border-bottom: 3px solid #FBB1B5;
            z-index: 0;
        }

        input {
            width: 265px;
            height: 25px;
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
            border: 1px solid rgb(94, 94, 94);
            color: rgb(94, 94, 94);
        }

        input[name=gender]:checked+label {
            background-color: rgb(94, 94, 94);
            border: none;
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
            width: 400px;
            height: 30px;
        }

        .join-table th,
        .join-table td {
            border-top: 1px solid gray;
            height: 40px;
        }

        .gender-td {
            padding: 5px;
        }

        .most {
            color: orangered;
        }

        .submit {
            margin: 0 auto;
            width: 150px;
            height: 40px;
            font-size: 11pt;
            font-weight: bold;
            background-color: #FBB1B5;
            color: rgb(248, 246, 246);
            outline: none;
            border: none;
            z-index: 0;

        }
        .modal-footer{
        	font-size: 12pt;
        }
        .modal-footer>button{
        	width: 100px;
        }
        
        
    </style>
      <script>
        $(function() {
            var chk = document.getElementsByName("chk");
            $("#chkAll").click(function() {
                if (this.checked) {
                    for (var i = 0; i < chk.length; i++) {
                        chk[i].checked = true;
                    }
                } else {
                    for (var i = 0; i < chk.length; i++) {
                        chk[i].checked = false;
                    }
                }
            });
            $("#agr").click(function() {
                if (chk[0].checked == true && chk[1].checked == true) {
                    $(".wrap-agree").hide();
                    $("body").css('background-color', 'transparent');
                } else {
                    alert("필수항목 동의 체크가 필요합니다.")
                }
            });

        });

        /*--- ▲ 약관동의 스크립트 -----------------------------------------*/

        /*유효성 검사 스크립트*/
        $(function() {
            var check = [false, false, false, false, false];
            var pw = $("#memberPw");
            var pw_re = $("#memberPw-re");
            var msg = $("#pwMsg");
            var reg;


            $("#memberId").change(function() {
                reg = /^[a-z0-9]$/;
                $(this).next().html(" ");
                if (reg.test($(this).val())) {
                    check[0] = true;
                    console.log(check);
                } else {
                    $(this).next().html("영어또는 숫자를 입력하세요").css('color', '#DC413E');
                }
            });


            pw.change(function() {
                reg = /^[a-z0-9]$/;
            });
            pw_re.change(function() {
                if (pw.val() == pw_re.val()) {
                    $(this).next().html("비밀번호가 일치합니다.").css('color', '#3B77AF');
                    check[1] = true;
                } else {
                    $(this).next().html("비밀번호가 일치하지 않습니다.").css('color', '#DC413E');

                }
            });

            if ($("#name").val() != null) {
                check[2] = true;
            }
            $("#phone").change(function() {
                reg = /^[0-9]{9,11}$/;
                $(this).next().html(" ");

                if (reg.test($(this).val()) && $(this).val() != null) {
                    check[3] = true;
                } else {
                    $(this).next().html("전화번호 형식을 확인해주세요.").css('color', '#DC413E');
                }
            });
            $("#birth").change(function() {
                reg = /^[0-9]{8}$/;
                $(this).next().html(" ");
                if (reg.test($(this).val())) {
                    check[4] = true;
                } else {
                    $(this).next().html("예)19901010").css('color', '#DC413E');
                }
            });
            $("form").submit(function() {
                var count = 0;
                for (var i = 0; i < check.length; i++) {
                    if (check[i] == true) {
                        count++;
                    }
                }
                if (count < 5) {
                    return false;
                    alert("입력값을 확인해주세요.");
                }
                console.log(count);
            });

        });
    </script>
    
</head>
<body>
<%@ include file="/WEB-INF/views/common/header.jsp" %>

	
		<div class="container">

  <!-- The Modal -->
  <div class="modal fade" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
      <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">이용약관</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
    	 <div class="modal-body">
          	<div class="wrap-agree">
		        <ul class="join_box">
		            <li class="checkBox check01">
		                <ul class="clearfix">
		                    <li>전체동의</li>
		                    <li class="checkAllBtn">
		                        <input type="checkbox" name="chkAll" id="chkAll" class="chkAll">
		                    </li>
		                </ul>
		            </li>
		            <li class="checkBox check02">
		                <ul class="clearfix">
		                    <li>이용약관 동의(필수)</li>
		                    <li class="checkBtn">
		                        <input type="checkbox" name="chk" id="chk">
		                    </li>
		                </ul>
		                <textarea name="" id="">여러분을 환영합니다.
		네이버 서비스 및 제품(이하 ‘스튜디오무드’)을(를) 이용해 주셔서 감사합니다. 본 약관은 다양한 서비스의 이용과 관련하여 스튜디오무드(이하 ‘무드’)와 이를 이용하는 무드 서비스 회원(이하 ‘회원’) 또는 비회원과의 관계를 설명하며, 아울러 여러분의 무드 서비스 이용에 도움이 될 수 있는 유익한 정보를 포함하고 있습니다.
		       </textarea>
		            </li>
		            <li class="checkBox check03">
		                <ul class="clearfix">
		                    <li>개인정보 수집 및 이용에 대한 안내(필수)</li>
		                    <li class="checkBtn">
		                        <input type="checkbox" name="chk" id="chk">
		                    </li>
		                </ul>
		
		                <textarea name="" id="">여러분을 환영합니다.
		네이버 서비스 및 제품(이하 ‘스튜디오무드’)을(를) 이용해 주셔서 감사합니다. 본 약관은 다양한 서비스의 이용과 관련하여 스튜디오무드(이하 ‘무드’)와 이를 이용하는 무드 서비스 회원(이하 ‘회원’) 또는 비회원과의 관계를 설명하며, 아울러 여러분의 무드 서비스 이용에 도움이 될 수 있는 유익한 정보를 포함하고 있습니다.
		       </textarea>
		            </li>
		            <li class="checkBox check03">
		                <ul class="clearfix">
		                    <li>위치정보 이용약관 동의(선택)</li>
		                    <li class="checkBtn">
		                        <input type="checkbox" name="chk" id="chk">
		                    </li>
		                </ul>
		
		                <textarea name="" id="">여러분을 환영합니다.
		네이버 서비스 및 제품(이하 ‘스튜디오무드’)을(를) 이용해 주셔서 감사합니다. 본 약관은 다양한 서비스의 이용과 관련하여 스튜디오무드(이하 ‘무드’)와 이를 이용하는 무드 서비스 회원(이하 ‘회원’) 또는 비회원과의 관계를 설명하며, 아울러 여러분의 무드 서비스 이용에 도움이 될 수 있는 유익한 정보를 포함하고 있습니다.
		       </textarea>
		            </li>
		        </ul>
		        
		    </div>
        </div>
        <div class="modal-footer">     
	            <button class="fpmgBt close" data-dismiss="modal" id="notAgr">비동의</button>
	            <button class="fpmgBt close" data-dismiss="modal" id="agr">동의</button>
        </div>
       
      </div>
    </div>
  </div>
  
</div>
	


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
	                    <input type="text" name="memberId" id="memberId"> 
	                    <span id="idMsg"></span>
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
	                    <input type="password" name="memberPw-re" id="memberPw_re"> 
	                    <span id="pwMsg"> </span>
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
	                    <span id="phoneMsg"></span>
	                </td>
	            </tr>
	            <tr>
	                <th> 생년월일</th>
	                <td>
	                    <input type="text" name="birth" id="birth" placeholder="예)19900202">
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
	                <th>이메일</th>
	                <td>
	                    <input type="text" name="email" id="email">
	                </td>
	            </tr>
	            
	             <tr>
	                <th> 주소</th>
	                <td>
	                    <input type="text" name="address" id="address">
	                </td>
	            </tr>
	            
	            <tr>
	                <td colspan="2" style="text-align: center">
	                	<br>
	                    <input type="checkbox" name="agree" id="agree">
	                    <a href="#" class="agr" data-toggle="modal" data-target="#myModal">이용약관</a> <span>개인정보 사용 동의</span><br>
	                </td>
	            </tr>
	        </table>
	        <br>
	        <input class="submit" type="submit" value="회원가입">
	    </div>
	</form>
   <br><br><br><br><br>
	
	
<%@ include file="/WEB-INF/views/common/footer.jsp" %>
</body>
</html>