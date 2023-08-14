<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="write" method="post">


제목 <textarea name="boardTitle" rows="1" cols="25"></textarea><br><br>
내용<textarea name="boardContent" rows="6" cols="25"></textarea><br><br>

<button>게시글 등록</button>
</form>




<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>