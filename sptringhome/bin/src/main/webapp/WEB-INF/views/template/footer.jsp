<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<hr>
	KH정보교육원 웹개발자 양성과정
	
	<c:choose>
	<c:when test="${sessionScope.name!=null}">
	<a href="/member/withdrawal">탈퇴하기</a>
	</c:when>
	</c:choose>
	
	
	
	
	</div>

    