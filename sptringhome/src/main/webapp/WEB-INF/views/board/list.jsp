<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>



<c:forEach var="boardDto" items="${list}">

<h3>번호 		${boardDto.boardNo}</h3>
<h3>작성자 	${boardDto.boardWriter}</h3>
제목 			${boardDto.boardTitle}
조회수		${boardDto.boardReadcount}
좋아요 수		${boardDto.boardLikecount}
댓글 수		${boardDto.boardReplycount}
작성일	<fmt:formatDate value= "${boardDto.boardCtime}" pattern="y년 M월 d일 E a h시 m분 s초"/><br><br>
수정일		${boardDto.boardUtime}
>
<a href="detail?boardNo=${boardDto.boardNo}">게시글 상세보기</a>
</c:forEach>

<a href="write">게시글 등록</a>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>