<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>



<h1>게시글 수정</h1>

<form action="edit" method="post">

<input type="hidden" name="boardNo" value="${boardDto.boardNo}">
게시글 제목 <input type="text" name="boardTitle" value="${boardDto.boardTitle}" ><br><br>
게시글 내용 <input type="text" name="boardContent" value="${boardDto.boardContent}"><br><br>


<button>수정하기</button>

</form>



<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>