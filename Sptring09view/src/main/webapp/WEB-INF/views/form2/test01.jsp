<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포켓몬스터 수정</title>
</head>
<body>

	<h1>포켓몬스터 수정</h1>

	<form action="http://localhost:8080/update" method="post">
		
		번호: <input type="text" name="no" required><br><br>
		이름: <input type="text" name="name" required><br><br>
		속성: <input type="text" name="type" required><br><br>
		<button>수정</button>	
	
	
	</form>


</body>
</html>