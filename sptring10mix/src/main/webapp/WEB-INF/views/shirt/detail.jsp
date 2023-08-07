<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 
	페이지 내에서 프로그래밍 처리를 할 수 있는 
	추가 도구를 사용하도록 설정 
--%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.shirtNo}번 의상 정보</title>
</head>
<body>

	<c:choose>
		<c:when test="${dto != null}">
			<h1>${dto.shirtNo}번 의상 정보</h1>
			<h2>의상 이름 : ${dto.shirtName}</h2>
			<h2>의상 컬러 : ${dto.shirtColor}</h2>
			<h2>의상 가격 : ${dto.shirtPrice}</h2>
			<h2>의상 종류 : ${dto.shirtKind}</h2>
			<h2>의상 타입 : ${dto.shirtType}</h2>
			<h2>의상 재질 : ${dto.shirtMaterial}</h2>
			<h2>의상 재고 : ${dto.shirtStock}</h2>
			
			<a href="edit?shirtNo=${dto.shirtNo}">정보수정</a>
			<a href="delete?shirtNo=${dto.shirtNo}">삭제하기</a>
			<a href="list">목록으로</a>
			<a href="add">상품등록</a>
		</c:when>
		<c:otherwise>
			<h1>존재하지 않는 번호입니다.</h1>
		</c:otherwise>
	</c:choose>


	
</body>
</html>


