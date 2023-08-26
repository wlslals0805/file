<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="container w-800">
	<div class="row">
		<h1>
			${boardDto.boardNo}번 게시글
			<c:if test="${boardDto.boardUtime != null}">
				(수정됨) 
			</c:if>
		</h1>
	</div>
	<div class="row left">
		<h3>
			${boardDto.boardWriterString}
			<%-- 탈퇴한 사용자가 아닐 경우 닉네임을 옆에 추가로 출력 --%>
			<c:if test="${writerDto != null}">
			(${writerDto.memberNickname})
			</c:if>
		</h3>
	</div>
	<div class="row right">
				<fmt:formatDate value="${boardDto.boardCtime}" pattern="y년 M월 d일 E a h시 m분 s초"/>
	</div>
	<div class="row right">
		조회수 ${boardDto.boardReadcount}
		좋아요 ${boardDto.boardLikecount}
		댓글 ${boardDto.boardReplycount}개
	</div>
	<div class="row left">
		<h2>${boardDto.boardTitle}</h2>
	</div>
	<div class="row left" style="min-height:250px">
		<pre>${boardDto.boardContent}</pre>
	</div>
	<div class="row right">
		<%-- 회원일 때만 글쓰기,수정,삭제가 나와야 한다 --%>
		<c:if test="${sessionScope.name != null}">
		<a class="btn btn-positive" href="write">글쓰기</a>
		<a class="btn btn-positive" href="write?boardParent=${boardDto.boardNo}">답글쓰기</a>
		
		<%-- 수정/삭제는 소유자일 경우만 나와야 한다 --%>
		<c:if test="${sessionScope.name == boardDto.boardWriter}">
		<a class="btn btn-negative" href="edit?boardNo=${boardDto.boardNo}">수정하기</a>
		<a class="btn btn-negative" href="delete?boardNo=${boardDto.boardNo}">삭제하기</a>
		</c:if>
		</c:if>
		<a class="btn" href="list">목록보기</a>
	</div>
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>