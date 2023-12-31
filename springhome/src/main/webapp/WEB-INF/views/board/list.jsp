<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1><c:if test="${param.keyword!=null}">${param.keyword} 검색 결과  </c:if></h1>

<form action="list" method="get">



<c:choose>
		<c:when test="${param.type == 'member_nickname'}">
			<select name="type" required>
				<option value="board_title">제목</option>
				<option value="member_nickname" selected>작성자</option>
			</select>
		</c:when>
		<c:otherwise>
			<select name="type" required>
				<option value="board_title">제목</option>
				<option value="member_nickname">작성자</option>
			</select>
		</c:otherwise>
	</c:choose>

<input type=search name="keyword" placeholder="검색어 입력" required>
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
<th>${boardListDto.boardWriter}(${boardListDto.memberNickname})</th>
</c:when>
<c:otherwise>
<th>탈퇴한 사용자</th>
</c:otherwise>
</c:choose>

<%-- <td>${boardListDto.getBoardWriterString()}</td>  --%>
		
<td align="left">
<%-- 차수만큼 띄어쓰기 출력 --%>
<%-- for(int i=1; i <= 차수; i++) { --%>
			
	<c:forEach var="i" begin="1" end="${boardListDto.boardDepth}" step="1">
				&nbsp;&nbsp;
				</c:forEach>
<c:if test = "${boardListDto.boardDepth>0}">

<img src="/reply.jpg" width="30" height="15">

</c:if>			

<a href="detail?boardNo=${boardListDto.boardNo}">${boardListDto.boardTitle}</a></td>

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

<!-- 이전 버튼 -->
<c:if test="${begin > 1}">
	<%-- 링크는 검색과 목록을 따로 구현 --%>
	<c:choose>
		<c:when test="${isSearch}">
			<a href="list?page=${begin-1}&type=${param.type}&keyword=${param.keyword}">&lt;</a>
		</c:when>
		<c:otherwise>
			<a href="list?page=${begin-1}">&lt;</a>
		</c:otherwise>
	</c:choose>			
</c:if>

<!-- 숫자 버튼 -->
<c:forEach var="i" begin="${begin}" end="${end}" step="1">
	<c:choose>
		<c:when test="${page == i}">
			${i}	
		</c:when>
		<c:otherwise>
			<%-- 링크는 검색과 목록을 따로 구현 --%>
			<c:choose>
				<c:when test="${isSearch}">
					<a href="list?page=${i}&type=${param.type}&keyword=${param.keyword}">${i}</a>
				</c:when>
				<c:otherwise>
					<a href="list?page=${i}">${i}</a>
				</c:otherwise>
			</c:choose>			
		</c:otherwise>
	</c:choose>
</c:forEach>

<!-- 다음 버튼 -->
<c:if test="${end < pageCount}">
	<%-- 링크는 검색과 목록을 따로 구현 --%>
	<c:choose>
		<c:when test="${isSearch}">
			<a href="list?page=${end+1}&type=${param.type}&keyword=${param.keyword}">&gt;</a>
		</c:when>
		<c:otherwise>
			<a href="list?page=${end+1}">&gt;</a>
		</c:otherwise>
	</c:choose>			
	
</c:if>


</h3>

<br>

<c:if test="${sessionScope.name != null}"><br><br><a href="write">게시글 등록</a></c:if>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>