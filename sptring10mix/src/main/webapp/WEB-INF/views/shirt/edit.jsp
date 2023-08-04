<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>의상 정보 수정</title>
</head>
<body>

	
	<h1>의상 정보 수정</h1>
	

	
	<form action="edit" method="post"><br><br>
<%-- 번호<input type="text" name="no" value="${dto.no}" readonly="readonly"><br><br>--%>
	<input type="hidden" name="shirtNo" value="${dto.shirtNo}">
	의상 이름<input type="text" name="shirtName" value="${dto.shirtName}"><br><br>
	의상 컬러: <select name="shirtColor" required>
	<option>블랙</option>
	<option>화이트</option>
	<option>그레이</option>
	<option>레드</option>
	<option>블루</option>
</select><br><br>
	의상 비용<input type="text" name="shirtPrice" value="${dto.shirtPrice}"><br><br>
	의상 종류<select name="shirtKind" required>
	<option>라운드</option>
	<option>브이넥</option>
	<option>정장</option>
</select><br><br>
	의상 유형<select name="shirtType" required>
	<option>민소매</option>
	<option>반팔</option>
	<option>긴팔</option>
</select><br><br>
	의상 재질<input type="text" name="shirtMaterial" value="${dto.shirtMaterial}"><br><br>
	의상 재고<input type="text" name="shirtStock" value="${dto.shirtStock}"><br><br>
	<button>변경하기</button>
	</form>
	
	

</body>
</html>