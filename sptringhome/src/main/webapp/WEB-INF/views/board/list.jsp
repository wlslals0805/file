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


<input type=search name="search" placeholder="검색어 입력" required>
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
<th>그룹</th>
<th>상위</th>
<th>차수</th>
</tr>





<c:if test="${param.error!=null}"><h2 style=color:red>찾으시는 제목의 게시글이 존재하지 않습니다.</h2></c:if>
<c:if test="${param.error2!=null}"><h2 style=color:red>찾으시는 작성자의 게시글이 존재하지 않습니다.</h2></c:if>

<c:forEach var="boardListDto" items="${list}">


<tr>
<th>${boardListDto.boardNo}</th>

<c:choose>
<c:when test="${boardListDto.boardWriter!=null}">
<th>${boardListDto.boardWriter}</th>
</c:when>
<c:otherwise>
<th>탈퇴한 사용자</th>
</c:otherwise>
</c:choose>

<%-- <td>${boardListDto.getBoardWriterString()}</td>  --%>

<c:forEach var="i" begin="1" end="${boardListDto.boardDepth}" step="1">
&nbsp;&nbsp;
</c:forEach>

<th><a href="detail?boardNo=${boardListDto.boardNo}">${boardListDto.boardTitle}</a></th>

<th>${boardListDto.boardReadcount}</th>
<th>${boardListDto.boardLikecount}</th>
<c:if test="${boardListDto.boardReplycount>0}">${boardListDto.boardReplycount}</c:if>
<th>${boardListDto.boardReplycount}</th>
<th>${boardListDto.getBoardCtimeString()}</th>
<th><fmt:formatDate value= "${boardListDto.boardUtime}"
pattern="y년 M월 d일 E a h시 m분 s초"/></th>
<th>${boardListDto.boardGroup}</th> 
<th>${boardListDto.boardParent}</th> 
<th>${boardListDto.boardDepth}</th> 

</tr>

</c:forEach>

</table>

<c:if test="${sessionScope.name != null}"><br><br><a href="write">게시글 등록</a></c:if>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>