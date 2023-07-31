<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 등록</title>
</head>
<body>

<h1>게시글 등록</h1>

<!-- 
		작성자(boardWriter) 
		제목(boardTitle)
		내용(boardContent)
		- 여러줄 입력창(textarea)으로 처리 (rows=줄수, cols=칸수)
	-->


<form action="http://localhost:8080/insert">
게시글 제목:<input name="boardTitle"><br><br>
<!--게시글 내용:<input name="boardContent"><br><br>-->
내용 : <textarea name="boardContent" rows="10" cols="100"></textarea>	<br><br>
게시글 작성자:<input name="boardWriter"><br><br>

<button>등록</button>

</form>

</body>
</html>