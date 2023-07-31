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

<form action="http://localhost:8080/member/join">
아이디:<input type = "text" name="memberId" required="required"><br><br>
패스워드:<input type="password"name="memberPw" required><br><br>
닉네임:<input type="text"name="memberNickname" required><br><br>
생년월일:<input type="date" name="memberBirth" required><br><br>
이메일:<input type="email" name="memberEmail"><br><br>
전화번호:<input type="text" name="memberContact" required><br><br>
회원등급:<select name="memberLevel" required>
<option>일반</option>
<option>VIP</option>
<option>관리자</option>
</select>
<br><br>
회원포인트<input type="number" name="memberPoint"
min="0" max="1000" step="1" value="0">
<br><br>
<button>등록</button>

</form>


</body>
</html>