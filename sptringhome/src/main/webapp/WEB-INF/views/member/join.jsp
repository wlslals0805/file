<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page = "/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>회원 가입</h1>

<form action="join" method="post" autocomplete="off">


	아이디*<input type="text" name="memberId" required><br><br>
	비밀번호*<input type="password" name="memberPw" required><br><br>
	닉네임*<input type = "text" name="memberNickname"required><br><br>
	이메일<input type="email" name="memberEmail"><br><br>
	연락처<input type = "tel" name="memberContact"><br><br>
	생년월일<input type="date" name="memberBirth"><br><br>
	주소<br>
	<input type="text" name="memberPost"placeholder="우편번호"size="6"maxlength="6"><br><br>
	<input type="text" name="memberAddr1"placeholder="기본주소"><br><br>
	<input type="text" name="memberAddr2"placeholder="상세주소"><br><br>
	
	<button>가입하기</button>
</form> 



<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>