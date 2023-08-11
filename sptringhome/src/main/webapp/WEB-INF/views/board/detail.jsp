<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>



<h1>${boardDto.boardNo}번 게시글 상세</h1>


글번호	${boardDto.boardNo}<br><br>
작성자	${boardDto.boardWriter}<br><br>
제목 		${boardDto.boardTitle}<br><br>
내용		${boardDto.boardContent}<br><br>
조회수	${boardDto.boardReadcount}<br><br>
좋아요	${boardDto.boardLikecount}<br><br>
댓글수	${boardDto.boardReplycount}<br><br>
작성일	<fmt:formatDate value= "${boardDto.boardCtime}" pattern="y년 M월 d일 E a h시 m분 s초"/><br><br>
수정일	${boardDto.boardUtime}<br><br>


<a href="edit?boardNo=${boardDto.boardNo}">수정하기</a>
<a href="delete?boardNo=${boardDto.boardNo}">삭제하기</a>



<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>