<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>



<h1>회원 탈퇴</h1>

<h2>정말로 탈퇴하시겠습니까? 탈퇴 후 정보는 사라집니다</h2>

<form action="exit2" method="post">

<input type="password" name="memberPw" placeholder="비밀번호 입력"><br><br>

<button>네, 탈퇴하겠습니다.</button><br><br>

	<c:if test="${param.error!=null}"><h1>비밀번호를 다시 입력해주세요</h1></c:if>

</form>







<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>