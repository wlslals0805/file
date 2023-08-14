<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>${boardDto.boardNo}번 게시글 상세</h1>
<table border="1">





<tr>
<th>글번호	</th>
<th>${boardDto.boardNo}</th>
</tr>
<tr>
<th>작성자	</th><th>${memberDto.memberNickname}</th>
</tr>
<tr>
<th>제목</th><th>${boardDto.boardTitle}</th>
</tr>
<tr>
<th>내용</th><th>${boardDto.boardContent}</th>
</tr>
<tr>
<th>조회수</th><th>${boardDto.boardReadcount}</th>
</tr>
<tr>
<th>좋아요	</th><th>${boardDto.boardLikecount}</th>
</tr>
<tr>
<th>댓글수	</th><th>${boardDto.boardReplycount}</th>
</tr>
<tr>
<th>작성일</th><th><fmt:formatDate value= "${boardDto.boardCtime}" 
pattern="y년 M월 d일 E a h시 m분 s초"/></th>
</tr>
<tr><th>수정일</th><th><fmt:formatDate value= "${boardDto.boardUtime}" 
pattern="y년 M월 d일 E a h시 m분 s초"/></th>
</tr>


</table>

<a href="edit?boardNo=${boardDto.boardNo}">수정하기</a>
<a href="delete?boardNo=${boardDto.boardNo}">삭제하기</a>
<a href="list">목록으로</a>

<c:if test="${param.error != null}"><h2 style=color:red>다른 사람의 글은 삭제할 수 없습니다.</h2></c:if>
<c:if test="${param.error2 != null}"><h2 style=color:red>다른 사람의 글은 수정할 수 없습니다.</h2></c:if>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>