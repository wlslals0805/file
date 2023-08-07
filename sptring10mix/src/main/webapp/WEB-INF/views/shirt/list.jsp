<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
      
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>의상 목록</title>
</head>
<body>


<h1>의상 목록</h1>
	<h2><a href="add">신규등록</a></h2>
		
	<table border="1">
	<thead>
	<tr>
	<th>의상 번호</th>
	<th>의상 이름</th>
	<th>의상 컬러</th>
	<th>의상 비용</th>
	<th>의상 종류</th>
	<th>의상 타입</th>
	<th>의상 재질</th>
	<th>의상 재고</th>
	</tr>
	<thead>
	<tbody>
	<c:forEach var="dto" items="${list}">
	<tr>
	<td>${dto.shirtNo}</td>
	<td><a href="detail2?shirtNo=${dto.shirtNo}">${dto.shirtName}</a></td>
	<td>${dto.shirtColor}</td>
	<td>${dto.shirtPrice}</td>
	<td>${dto.shirtKind}</td>
	<td>${dto.shirtType}</td>
	<td>${dto.shirtMaterial}</td>
	<td>${dto.shirtStock}</td>
	</tr>
	</c:forEach>
	
	</tbody>
	
	
	</table>    

</body>
</html>