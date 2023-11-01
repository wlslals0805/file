<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page = "/WEB-INF/views/template/header.jsp"></jsp:include>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>정보변경 페이지</h1>


<form action="change2" method="post">





	닉네임 <input type="text" name="memberNickname" value="${dto.memberNickname}" required><br><br>
	이메일 <input type="email" name="memberEmail" value="${dto.memberEmail}"><br><br>
	전화번호 <input type="tel" name="memberContact" value="${dto.memberContact}"><br><br>
	생년월일 <input type="date" name="memberBirth" value="${dto.memberBirth}"><br><br>
	주소 <input type="text" name="memberPost" value="${dto.memberPost}" placeholder="우편번호"><br><br>
	 <input type="text" name="memberAddr1" value="${dto.memberPost}" placeholder="기본주소"><br><br>
	 <input type="text" name="memberAddr2" value="${dto.memberPost}" placeholder="상세주소"><br><br>
	 비밀번호 입력 <input type="password" name="memberPw" required>


	
	
	
	
	<button>변경하기</button><br><br>

	<c:if test="${param.error!=null}"><h2 style="color:red">입력하신 비밀번호가 일치하지 않습니다</h2></c:if>






</form>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>