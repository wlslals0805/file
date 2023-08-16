<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>


<form action="list" method="post">

<select name="type">
<option>제목</option>
<option>작성자</option>
</select>

<input type=text name="search" required>
<button>검색</button><br><br>

</form>

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





<c:if test="${param.error!=null}"><h2 style=color:red>찾으시는 제목의 게시글이 존재하지 않습니다.</h2></c:if>
<c:if test="${param.error2!=null}"><h2 style=color:red>찾으시는 작성자의 게시글이 존재하지 않습니다.</h2></c:if>

<c:forEach var="boardDto" items="${list}">


<tr>
<th>${boardDto.boardNo}</th>

<c:choose>
<c:when test="${boardDto.boardWriter!=null}">
<th>${boardDto.boardWriter}</th>
</c:when>
<c:otherwise>
<th>탈퇴한 사용자</th>
</c:otherwise>
</c:choose>

<%-- <td>${boardDto.getBoardWriterString()}</td>  --%>


<th><a href="detail?boardNo=${boardDto.boardNo}">${boardDto.boardTitle}</a></th>
<th>${boardDto.boardReadcount}</th>
<th>${boardDto.boardLikecount}</th>
<c:if test="${boardDto.boardReplycount>0}">${boardDto.boardReplycount}</c:if>
<th>${boardDto.boardReplycount}</th>
<th>${boardDto.getBoardCtimeString()}</th>
<th><fmt:formatDate value= "${boardDto.boardUtime}" 
pattern="y년 M월 d일 E a h시 m분 s초"/></th>

</tr>

</c:forEach>

</table>

<c:if test="${sessionScope.name != null}"><br><br><a href="write">게시글 등록</a></c:if>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>