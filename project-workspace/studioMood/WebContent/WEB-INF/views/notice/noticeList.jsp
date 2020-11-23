<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Document</title>
    <style>
        .content {
            width: 100%;

        }

        .content * {
            margin: 0 auto;
        }

        .pink {
            margin-top: 50px;
            width: 150px;
            text-align: center;
            font-weight: bold;
            font-size: 30px;
            border-bottom: 4px solid #f1d1d1;
        }

        table {
            width: 80%;
            border: none;
            border-top: 4px solid #b8b0b0;
            
            border-bottom: 4px solid #b8b0b0;
        }

        .write-btn {
            width: 80px;
            height: 40px;
            font-weight: bold;
            font-size: 15px;
            text-align: center;
            background-color: #dfd3d3;
            border: 2px solid #dfd3d3;
            border-radius: 5px;
            margin-bottom: 10px;
            list-style: none;
            color: #4a4a4a;
            
        }

        .write {
            width: 80%;
            text-align: right;
        }

        .post {
            width: 80%;
            text-align: center;
            padding: 10px;
        }

        .search-text {
            width: 250px;
            height: 34px;
            border-radius: 5px;
            border: 2px solid #b8b0b0;
        }

        .btn-post {
            width: 100px;
            height: 40px;
            font-weight: bold;
            font-size: 17px;
            background-color: #dfd3d3;
            border: 2px solid #dfd3d3;
            border-radius: 5px;
            color: #4a4a4a;
        }

    </style>
</head>

<body>
    <div class="content">
        <section>
            <div class="pink">공지사항</div>
            <br>
            <br>
            <br>
 <div class="write">
       <input type="submit" value="글쓰기" class="write-btn"></div>
            <table>
                <tr>
                    <th width="10%">No.</th>
                    <th width="50%">제목</th>
                    <th width="15%;">이름</th>
                    <th width="15%;">날짜</th>
                    <th width="10%;">조회수</th>
                </tr>
                <tr>
                    <td></td>
                    <td>
                    <td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </table>
            <div class="post">
                <form action="" method="get" id="search">
                    <input type="text" placeholder="검색어를 입력해주세요." class="search-text">
                    <input type="submit" value="검색" class="btn-post">
                </form>
            </div>
        </section>
    </div>
</body>

</html>
