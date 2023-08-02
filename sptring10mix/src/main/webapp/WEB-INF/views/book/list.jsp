<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 리스트</title>
</head>
<body>


<h1>도서 목록</h1>
	
	<table border="1">
	<thead>
	<tr>
	<th>도서 번호</th>
	<th>도서 제목</th>
	<th>작가</th>
	<th>출판일</th>
	<th>가격</th>
	<th>출판사</th>
	<th>페이지수</th>
	<th>장르</th>
	</tr>
	<thead>
	<tbody>
	<c:forEach var="dto" items="${list}">
	<tr>
	<td>${dto.bookId}</td>
	<td><a href="detail?bookId=${dto.bookId}">${dto.bookTitle}</a></td>
	<td>${dto.bookAuthor}</td>
	<td>${dto.bookPublicationDate}</td>
	<td>${dto.bookPrice}</td>
	<td>${dto.bookPublisher}</td>
	<td>${dto.bookPageCount}</td>
	<td>${dto.bookGenre}</td>
	</tr>
	</c:forEach>
	
	</tbody>
	
	
	</table>    




</body>
</html>