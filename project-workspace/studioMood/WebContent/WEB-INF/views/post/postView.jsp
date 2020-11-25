<%@page import="member.model.vo.Member"%>
<%@page import="post.model.vo.PostComment"%>
<%@page import="java.util.ArrayList"%>
<%@page import="post.model.vo.Post"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Member m = (Member)request.getAttribute("m");
    Post p = (Post)request.getAttribute("p");
    ArrayList<PostComment> list = (ArrayList<PostComment>)request.getAttribute("list");
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <style>
        .postView {
            width: 80%;
            margin: 0 auto;

        }

        .btn-post {
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

        .postView>table {
            border-spacing: 0;
            margin-top: 50px;

        }

        .firstth {
            text-align: left;
        }

        .postView>table * {
            border: 1px solid lightgray;
        }

        .inputComment {
            height: 150px;
            width: 100%;
            background-color: rgb(250, 228, 227);
        }

        .inputComment>form>ul {

            padding: 0;
            overflow: hidden;
        }

        .inputComment>form>ul>li {
            text-decoration: none;
            list-style-type: none;
            float: left;
            text-align: center;
            margin-top: 20px;
        }

        .inputComment>form>ul>li:first-child {
            width: 85%;
        }

        .inputComment>form>ul>li:nth-child(2) {
            width: 15%;
            line-height: 100px;
        }

        .postCommenttext {
            outline: none;
            width: 95%;
        }

        .btn-postView {
            width: 100px;
            height: 60px;
            font-size: 20px;
            color: white;
            border: none;
            background-color: #FBB1B5;
        }

    </style>
</head>
<body>
    <section>
        <div class="postView">
            <table>
                <tr>
                    <th class="firstth" colspan="2" style="width: 1000px; height: 50px; font-size: 25px; font-weight: bold;border-top: 3px solid rgb(252, 157, 154);"><%=p.getPostTitle() %></th>
                </tr>
                <tr>
                    <td style="height: 30px;"><%=p.getPostWriter() %></td>
                    <td style="text-align: center"><%=p.getPDate() %></td>
                </tr>
                <tr>
                    <td style="width: 20%;">첨부파일</td>
					
                    <td>
                    <%if(p.getFilename() != null) {%>
					<img src="/img/file.png" width="16px">
					<a href="javascript:fileDownload('<%=p.getFilename() %>',<%=p.getFilepath() %>')"><%=p.getFilename() %></a>
						
					<%} %>
					</td>
                </tr>
                <tr>
                    <td colspan="2"><%=p.getPostContentBr() %></td>
                </tr>
                <tr>
                    <th colspan="2">
                        <%if(m!=null && m.getMemberId().equals(p.getPostWriter())) {%>
                        <a href="/postUpdateFrm?postNo="<%=p.getPostNo() %>" class="btn-post">수정하기</a>
                        <a href="/postDelete?postNo="<%=p.getPostNo() %>" class="btn-post">삭제하기</a>
                        <%} %>
                        <a href="javacript:history.go(-1)" class="btn-post">목록으로</a>
                    </th>
                    
                </tr>
            </table>
            <div class="commentList">
            
            
            
            
            </div>
            <%if(m!=null) {%>
            <div class="inputComment">
                <form action="/insertPostCommnet" method="post">
                    <ul>
                        <li>
                            <input type="hidden" name="postCommnetLevel" value="1">
                            <input type="hidden" name="postCommnetWriter" value=<%=m.getMemberId() %>>
                            <input type="hidden" nmae="postRef" value=<%=p.getPostNo() %>>
                            <textarea class="postCommenttext"style="height: 100px;resize: none;"name="postCommnetContent"></textarea>                           
                        </li>
                        <li style="text-align: center;">
                            <button type="submit" class="btn-postView" >등록</button>
                        </li>
                    </ul>
                    
                    
                </form>
                
            </div>    
            <%} %>
        </div>
        
    </section>
</body>
</html>