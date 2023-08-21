<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>${param.search} 검색결과</h1>

<table border="1">

<tr>
<th>번호</th>
<th>글쓴이</th>
<th>제목</th>
<th>조회수</th>
<th>좋아요 수</th>
<th>댓글 수</th>
<th>작성일</th>
<th>수정일</th>
</tr>




<c:forEach var="boardDto" items="${tList}">

<tr>
<th>${boardDto.boardNo}</th>
<th>${boardDto.boardWriter}</th>
<th><a href="detail?boardNo=${boardDto.boardNo}">${boardDto.boardTitle}</a></th>
<th>${boardDto.boardReadcount}</th>
<th>${boardDto.boardLikecount}</th>
<th>${boardDto.boardReplycount}</th>
<th><fmt:formatDate value= "${boardDto.boardCtime}" 
pattern="y년 M월 d일 E a h시 m분 s초"/></th>
<th><fmt:formatDate value= "${boardDto.boardUtime}" 
pattern="y년 M월 d일 E a h시 m분 s초"/></th>

</tr>

</c:forEach>


</table>

<a href="write">게시글 등록</a>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>