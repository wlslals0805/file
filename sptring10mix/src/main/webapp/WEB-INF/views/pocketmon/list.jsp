<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
    
    <%-- 
    
    for(PocketmonDto dto:list){
    System.out.println(dto.getName());} 
    
    
    <c:forEach var="dto" items="${list}">
    <h2>${dto}</h2>
    </c:forEach> 
    --%>
    
	<h1>포켓몬스터 목록</h1>
	
	<table border="1">
	<thead>
	<tr>
	<th>번호</th>
	<th>이름</th>
	<th>속성</th>
	<th>이동</th>
	</tr>
	<thead>
	<tbody>
	<c:forEach var="dto" items="${list}">
	<tr>
	<td>${dto.no}</td>
	<td>${dto.name}</td>
	<td>${dto.type}</td>
	<td><a href="/pocketmon/detail?no=${dto.no}">상대</a></td>
	<td><a href="detail?no=${dto.no}">절대</a></td>
	</tr>
	</c:forEach>
	
	</tbody>
	
	
	</table>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>