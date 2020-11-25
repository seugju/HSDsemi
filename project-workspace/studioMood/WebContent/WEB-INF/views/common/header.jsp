<%@page import="member.model.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	Member m = (Member)session.getAttribute("member");
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

        header{
            width: 100vw;
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

        .logo>img {
            margin: 0 auto;
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
        }

        .navi-menu>li {
            width: 125px;
            height: 40px;
            margin: 0 auto;
        }

        .navi-menu li>a {
            width: 100%;
            height: 100%;
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
            width: 1200px;
            float: right;
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

    </style>
    
        <script>
        $(function(){
            var subMenu = $(".subMenu");
            subMenu.hide();
            
            $(".navi-menu>li>a").hover(function(){
               $(this).css('color','gray');
            },function(){
                $(this).css('color','#373a40');
           });
            
            $(".navi-menu>li>a").click(function(){                
                subMenu.each(function(idx,item){
                    $(this).hide();
                })
                $(this).next().slideToggle();
             });
            
        });
        

    </script>
</head>
<body>
<header>
     <div class="nav-top">
     <%if(m != null) { //로그인 된 상태%> 
     	<ul class="navbar-nav navi-menu-top" id="login-nav">
            <li>
                <a class="nav-top-link" href="/logout">로그아웃</a>
            </li>
            <li>
                <a class="nav-top-link" href="/myPage?memberId=<%=m.getMemberId()%>">마이페이지</a>
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
            <h3>STUDIO MOOD</h3>
            <p>감성을 담는 사진관 </p>
        </div>


    </div>

    <nav class="navbar navbar-expand-sm sticky-top">
        <ul class="navbar-nav navi-menu">
            <li class="nav-item">
                <a class="nav-link" href="#">about</a>
                <ul class="subMenu">
                    <li><a class="nav-link sub-nav-item" href="#"></a>studio 'mood'</li>
                    <li><a class="nav-link sub-nav-item" href="#"></a>오시는 길</li>
                </ul>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">product</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">gallery</a>
                <ul class="subMenu">
                    <li><a class="nav-link sub-nav-item" href="#"></a>개인프로필</li>
                    <li><a class="nav-link sub-nav-item" href="#"></a>바디프로필</li>
                    <li><a class="nav-link sub-nav-item" href="#"></a>단체프로필</li>
                </ul>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">reservation</a>
                <ul class="subMenu">
                    <li><a class="nav-link sub-nav-item" href="#"></a>예약</li>
                    <li><a class="nav-link sub-nav-item" href="#"></a>예약확인</li>
                </ul>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">board</a>
                <ul class="subMenu">
                    <li><a class="nav-link sub-nav-item" href="#"></a>공지사항</li>
                    <li><a class="nav-link sub-nav-item" href="#"></a>QnA</li>
                    <li><a class="nav-link sub-nav-item" href="#"></a>review</li>
                </ul>
            </li>

        </ul>
    </nav>
    

</header>

</body>
</html>