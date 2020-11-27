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

		.postView>table>tbody>tr>th>a{
		 	text-decoration: none;
            color: black;
            display:inline-block;
            width:100px;
            height : 38px;
            border: 2px solid #FBB1B5;
            line-height : 38px;
		}
        .btn-post {
            margin-top: 30px;
            margin-bottom: 30px;
            font-weight: bold;
            font-size: 17px;
            background-color: white;
            border-radius: 5px;
        }

        .postView>table {
            border-spacing: 0;
            margin-top: 50px;

        }

        .firstth {
            text-align: left;
        }

		.postView>table>tbody>tr>td{
		border-top: 1px solid #dfd3d3;
        }
        .postView>table>tbody>tr:nth-child(4)>td{
		border-bottom: 1px solid #dfd3d3;
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
        .commentList{
        border-top : 3px solid #b8b0b0;
        
        }
		.commentList>ul{
		padding : 0;
		
		}
		.commentList>ul>li{
		text-decoration: none;
list-style-type: none;
overflow: hidden;

		}
		.commentList>ul>li>p{
		float: left;
		margin :0;
		height :30px;
		
		}
		.commentList>ul>li:first-child>p{
		
		}
		.commentList>ul>li>p:nth-child(2){
		text-align: right;
		}
		.commentList>ul>li:nth-child(2)>p{
		border-bottom:  2px solid #b8b0b0;
		}
    </style>
</head>
<body>
    <section>
        <div class="postView">
            <table>
                <tr>
                    <th class="firstth" colspan="2" style="width: 1000px; height: 50px; font-size: 30px; font-weight: bold;border-top: 3px solid #FBB1B5;"><%=p.getPostTitle() %></th>
                </tr>
                <tr>
                    <td style="height: 30px;"><%=p.getPostWriter() %></td>
                    <td>작성일 : <%=p.getPDate() %></td>
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
                        <a href="javascript:history.go(-1)" class="btn-post">목록으로</a>
                    </th>
                    
                </tr>
            </table>
            <div class="commentList">
            <%for(PostComment pc : list) {%>
            	<ul>
            		<li>
            			<p style="width : 20%;"><%=pc.getPostCommentWriter() %></p>
            			<p style="width : 80%; text-align: right;"><%=pc.getPostCommentDate() %></p>
            		</li>
            		<li>
            		<p style="width : 100%;"><%=pc.getPostCommentContentBr() %></p>
            		<textarea name = "postCommentContent" class="changeComment" style="display:none;"><%=pc.getPostCommentContent() %></textarea>
            		<%if(m != null) {%>
            		<p class="linkBox">
            		<%if(m.getMemberId().equals(pc.getPostCommentWriter())) {%>
            		<a href="javascript:void(0)" onclick="modifyComment(this,'<%=pc.getPostCommentNo() %>','<%=p.getPostNo() %>')">수정</a>
            		<a href="javascript:void(0)" onclick="deleteCommnet(this,'<%=pc.getPostCommentNo() %>','<%=p.getPostNo() %>')">삭제</a>
            		<%} %>
            		</p>
            		</li>
            	</ul>
            	
            <%} %>
            <%} %>
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
    <script>
    function fileDownload(filename,filepath){
    	var url = "/postFileDowmload";
    	var encFilename = encodeURIComponent(filename);
    	var encFilepath = encodeURIComponent(filepath);
    	location.href=url+"?filename="+encFilename+"&filepath="+encFilepath;
    }
    function modifyComment(obj, commnetNo, postNo){
    	$(obj).parent().prev().show();
    	$(obj).parent().prev().prev().hide();
    	$(obj).html('수정완료')
    	$(obj).attr('onclick','modifyComplete(this,)"'+commentNo+'","'+postNo+'")');
    	$(obj).next().html('취소');
    	$(obj).next().attr('onclick','modifycancel(this,"'+commentNo+'","'+postNo+'")');
    	$(obj).next().next().hide();
    }
    function modifycancel(obj, commentNo, postNo){
    	$(obj).parent().prev().hide();
    	$(obj).parent().prev().prev().show();
    	$(obj).prev().html('수정');
    	$(obj).prev().attr('onclick','modifyComment(this,"'+commentNo+'","'+postNo+'")');
    	$(obj).html('삭제');
    	$(obj).attr('onclick','modifyComment(this,"'+commentNo+'","'+postNo+'")')
    	$(obj).next().show();
    }
    function modifyComplete(obj, commentNo, postNo){
    	var form = $("<form action='/postCommentUpdate' method='post'></form>");
    	form.append($("<input type='text' name='postCommentNo' value='"+commentNo+"'>"));
    	form.append($("<input type='text' name='postNo' value='"+postNo+"'>"));
    	form.appent($(obj).parent().prev());
    	$("body").append(form);
    	form.submit();
    }
    function deleteComment(obj, commentNo, postNo){
    	if(confirm("댓글을 삭제하시겠습니까?")){
    		location.href="/postCommentDelete?postCommentNo="+commentNo+"&postNo="+postNo;	
    	}
    }
    </script>
</body>
</html>