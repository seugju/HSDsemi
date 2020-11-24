<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>studio_Mood:_Login</title>


    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.js"></script>

    <style>
        .modal {
            position: fixed;
            width: 100%;
            height: 100%;
            top: 0;
            left: 0;
            background-color: rgba(0, 0, 0, 0.3);
        }

        .modalBox {
            position: fixed;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            background-color: white;
            border-radius: 10px;
            height: 400px;
            max-width: 60%;
            min-height: 30%;
        }

        .imgBox {
            width: 400px;
            height: 100%;
            display: inline-block;
            float: left;
        }

        img {
            height: 100%;
            border-top-left-radius: 10px;
            border-bottom-left-radius: 10px;
        }

        .loginBox {
            text-align: center;
            width: 300px;
            height: 400px;
            display: inline-block;
            margin-top : 20px;
        }

        .login {
            text-align: center;
            margin-top: 20px;
        }

        .login input {
            margin: 5px;
            width: 200px;
            height: 25px;
            border: 1.5px solid #373a40;
            border-radius: 5px;
            outline: none;
        }

        #loginBtn {
            width: 100px;
            height: 35px;
            color: white;
            border: none;
            background-color: #000;
            margin: 20px;
        }


        .close {
            display: block;
            width: 20px;
            height: 20px;
            border-radius: 50%;
            border: 3px solid #000;
            text-align: center;
            line-height: 20px;
            text-decoration: none;
            color: #000;
            font-size: 15px;
            font-weight: bold;
            margin: 0 auto;
        }

    </style>

</head>
<body>

	<form action="/login" method="post" id="login">
	
		<div class="modal" id="modal">
		    <div class="modalBox modal-con">
		        <div class="imgBox">
		            <img src="/img/loginImg.jpg">
		        </div>
		        <div class="loginBox">
		            <div class="login-title">
		                <h1>STUDIO Mood:</h1>
		            </div>
		            <div class="login">
		                <h2>Login</h2>
		                <input type="text" id="id" name="id" placeholder="ID"><br>
		                <input type="password" id="pw" name="pw" placeholder="password"><br>
		                <button type="submit" id="loginBtn" value="로그인">로그인</button><br>
		                <a href="javascript:;" class="close">X</a>
		            </div>
		        </div>
		
		    </div>
		
		</div>
	</form>

</body>
</html>