<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="write" method="post">


게시글 제목<input type="text" name="boardTitle">
게시글 내용<input type="text" name="boardContent">

<button>게시글 등록</button>
</form>




<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>