<%@page import="member.model.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	Member m = (Member)session.getAttribute("loginMember");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
     <style>
    	 @font-face {
            font-family: 'S-CoreDream-4Regular';
            src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_six@1.2/S-CoreDream-4Regular.woff') format('woff');
            font-weight: normal;
            font-style: normal;
        }

		@font-face {
		    font-family: 'Cafe24Danjunghae';
		    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_twelve@1.1/Cafe24Danjunghae.woff') format('woff');
		    font-weight: normal;
		    font-style: normal;
		}
		
		@font-face {
		    font-family: 'KCC-eunyoung';
		    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_one@1.0/KCC-eunyoung-Regular.woff') format('woff');
		    font-weight: normal;
		    font-style: normal;
		}
        header{
            width: 100vw;
            z-index: 0;
        }

        .navbar {
            display: block;
            background-color: #faf2f2;
            margin: 0 auto;
        }

        .logo {
            margin: 0 auto;
            width: 500px;
            text-align: center;
        }
        .logo >h2{
         	font-family: 'Cafe24Danjunghae';
         }
        
        .logo>p{
        	 font-family: 'KCC-eunyoung';
        	 font-size: 20pt;
        }

        .navi-menu,
        .navi-menu-top {
            /* menu ul */
            list-style: none;
            text-align: center;
            
        }

        .navi-menu-top {
            float: right;
        }

        .navi-menu {
            margin: 0 auto;
            width: 680px;
            height: 40px;
        }

        .navi-menu>li {
            width: 125px;
            margin: 0 auto;
        }

        .navi-menu li>a {
            width: 100%;
            height: 30px;
            box-sizing: border-box;
            text-align: center;
            display: block;
            float: left;
        }

        .nav-link {
            color: #373a40;
            font-weight: bold;
        }

        .navi-menu-top {
            display: inline-block;
        }

        .nav-top {
     	   	font-family: 'S-CoreDream-4Regular';
            width: 1200px;
            float: right;
            padding-right: 30px;
        }

        .navi-menu-top li {
            width: 80px;
            height: 30px;
            float: left;
        }

        .navi-menu-top li>a {
            width: 100%;
            height: 100%;
            display: inline-block;
            font-size: 9pt;
            line-height: 30px;
            color: #373a40;
        }
        .subMenu {
            margin-top: 10px;
            padding: 0;
            list-style-type: none;
        }


        .subMenu li>a {
            margin: 0;
            padding: 0;
            font-size: 10pt;
            display: inline-block;
            width: 125px;
            float: none;
            color : snow;
            
            /*transition-duration: 1s;*/
        }

        .subMenu>li:first-child>a {
            margin-top: 30px;
        }
           a{
		      text-decoration: none;
		      color:black;
		   }
		   a:hover{
		      text-decoration: none;
		      color:#e6d1d8;
		   }

        .subMenu{
            margin: 0;
            padding: 0;
            list-style-type: none;
            transition-duration: 2s;
        }
        .subMenu li>a{
            margin: 0;
            padding: 0;
            display: inline-block;
            width: 125px;
            float: none;
        }
        .subMenu>li:first-child>a {
            margin-top: 30px;
        }
        .subMenu li>a:hover {
            color: #e6d1d8;
        }

    </style>
    
        <script>
        $(document).ready(function() {
            var subMenu = $(".subMenu");
            subMenu.hide();
            var navMenu = $(".navi-menu>li>a");
            var idx = navMenu.index();

            $(".navi-menu>li>a").hover(function() {
                $(this).css('color', '#e6d1d8');
                $(this).next().stop().slideDown(300);
            }, function() {
            	
            	$(this).next().stop().slideUp(300);
                $(this).css('color', '#391e22');
                
            });

        });
        

    </script>
</head>
<body>

     <div class="nav-top">
     <%if(m != null) { //로그인 된 상태%> 
     	<ul class="navbar-nav navi-menu-top" id="login-nav">
            <li>
                <a class="nav-top-link" href="/logout">로그아웃</a>
            </li>
            <li>
            <%if(m.getMemberLevel() == 0) {%>
                <a class="nav-top-link" href="/adminPage">관리자페이지</a>
            <%}else{ %>
                <a class="nav-top-link" href="/myPage?memberId=<%=m.getMemberId()%>">마이페이지</a>
            <%} %>
            </li>
        </ul>
     <%}else { %>
     	<ul class="navbar-nav navi-menu-top" id="logout-nav">
            <li>
                <a class="nav-top-link" href="/views/member/login.jsp">로그인</a>
            </li>
            <li>
                <a class="nav-top-link" href="/views/member/join.jsp">회원가입</a>
            </li>
        </ul>
     <%} %>
    </div>

    <div class="container-fluid">
        <br>
        <div class="logo">
            <img src="/img/logo.png" width="100px;" onclick="location.href = '/'">
            <h2>STUDIO Mood:</h2>
            <p>감성을 담는 사진관 </p>
        </div>
    </div>

   <nav class="navbar navbar-expand-sm sticky-top">
        <ul class="navbar-nav navi-menu">
            <li class="nav-item">
                <a class="nav-link" href="#">about</a>
                <ul class="subMenu">
                    <li><a class="nav-link sub-nav-item" href="#">studio 'mood'</a></li>
                    <li><a class="nav-link sub-nav-item" href="#">오시는 길</a></li>
                </ul>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">product</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">gallery</a>
                <ul class="subMenu">
                    <li><a class="nav-link sub-nav-item" href="#">개인프로필</a></li>
                    <li><a class="nav-link sub-nav-item" href="#">바디프로필</a></li>
                    <li><a class="nav-link sub-nav-item" href="#">단체프로필</a></li>
                </ul>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">reservation</a>
                <ul class="subMenu">
                    <li><a class="nav-link sub-nav-item" href="#">예약</a></li>
                    <li><a class="nav-link sub-nav-item" href="#">예약확인</a></li>
                </ul>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">board</a>
                <ul class="subMenu">
                    <li><a class="nav-link sub-nav-item" href="/noticeList?reqPage=1">공지사항</a></li>
                    <li><a class="nav-link sub-nav-item" href="#">QnA</a></li>
                    <li><a class="nav-link sub-nav-item" href="#">review</a></li>
                    <li><a class="nav-link sub-nav-item" href="#">FAQ</a></li>
                </ul>
            </li>
        </ul>
    </nav>
    

</body>
</html>