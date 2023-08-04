<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 정보 수정</title>
</head>
<body>

	
	<h1>도서 정보 수정</h1>
	
	<!-- 
	
	번호의 경우는 전송은 하지만 수정이 불가해야 한다.
	1. 입력창에 readonly 속성 추가
	2. 입력창을 숨김으로 생성
	
	 -->
	
	
	
	<form action="edit" method="post"><br><br>
<%-- 번호<input type="text" name="no" value="${dto.no}" readonly="readonly"><br><br>--%>
	<input type="hidden" name="bookId" value="${dto.bookId}">
	도서 제목<input type="text" name="bookTitle" value="${dto.bookTitle}"><br><br>
	도서 저자<input type="text" name="bookAuthor" value="${dto.bookAuthor}"><br><br>
	출판일<input type="text" name="bookPublicationDate" value="${dto.bookPublicationDate}"><br><br>
	도서 가격<input type="text" name="bookPrice" value="${dto.bookPrice}"><br><br>
	출판사<input type="text" name="bookPublisher" value="${dto.bookPublisher}"><br><br>
	페이지수<input type="text" name="bookPageCount" value="${dto.bookPageCount}"><br><br>
	장르<input type="text" name="bookGenre" value="${dto.bookGenre}"><br><br>
	<button>변경하기</button>
	</form>
	
	

</body>
</html>