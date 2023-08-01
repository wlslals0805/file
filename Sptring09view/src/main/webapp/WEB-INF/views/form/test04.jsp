<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
<h1>회원 가입</h1>

<!-- 자동완성 제거는 autocomplete=off로 제거 
	 입력창에 설명을 적는 속성은 placeholder-
	 
	 *중요*
	 폼에 전송방식을 지정하여 데이터를 다르게 보낼 수 있다.
	 -method ="get" : 기본값이며, 주소에 데이터를 첨부하여 전송
	 -method="post" : HTTP BODY에 데이터를 첨부하여 전송

	 -->
<form action="http://localhost:8080/member/join"
autocomplete="off" method="post">
아이디:<input type = "text" name="memberId" required="required"
placeholder ="영문소문자+숫자 8~25자"><br><br>
패스워드:<input type="password"name="memberPw" required
placeholder ="영문대/소문자+숫자,특수문자 포함" ><br><br>
<!-- 만약 비밀번호 확인을 만든다면 name은 붙이지 않는다(전송할 계획이 없으므로)(FE처리) -->
패스워드 확인<input type="password"><br><br>
닉네임:<input type="text"name="memberNickname" required
placeholder ="한글+숫자 2~10자"><br><br>
생년월일:<input type="date" name="memberBirth" required><br><br>
<!--

이메일 입력창을 type ="email"로 만들면
[1]입력값에 @가 있는지 검사해준다
[2]모바일에서 입력할 때 @와 .com이 나온다(이메일 키패드)

-->
이메일:<input type="email" name="memberEmail"
placeholder ="test@kh.com"><br><br>
<!-- 

	전화번호 입력창을 type = "tel"로 만들면...	
		-모바일에서 번호입력창 키패드가 나옴
 -->
전화번호:<input type="tel" name="memberContact" required
placeholder ="대시(-)제외하고 작성"><br><br>
회원등급:<select name="memberLevel" required>
<option>일반</option>
<option>VIP</option>
<option>관리자</option>
</select>
<br><br>
회원포인트<input type="number" name="memberPoint"
min="0" max="1000" step="1" value="0">
<br><br>
<button>가입하기</button>

</form>


</body>
</html>