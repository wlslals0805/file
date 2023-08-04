<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>
</head>
<body>
	
	<h1>도서 등록</h1>
	
	

	<form action="insert" method="post">
	도서명: <input name="bookTitle"> <br><br>
	저자: <input name="bookAUthor"> <br><br>
	출판일: <input type="date"name="bookPublicationDate"> <br><br>
	도서 가격: <input type="number" name="bookPrice"> <br><br>
	출판사: <input name="bookPublisher"> <br><br>
	출판사: <input name="bookPublisher"> <br><br>
	페이지수: <input type="number" name="bookPageCount"> <br><br>
	장르: <input name="bookGenre"> <br><br>
	
	<button>등록</button>	
	</form>
	
	<h2><a href="list"> 목록으로 </a></h2>

</body>
</html>