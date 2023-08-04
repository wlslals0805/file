<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 정보 수정</title>
</head>
<body>

	
	<h1>게시글 정보 수정</h1>
	
	<!-- 
	
	번호의 경우는 전송은 하지만 수정이 불가해야 한다.
	1. 입력창에 readonly 속성 추가
	2. 입력창을 숨김으로 생성
	
	 -->
	
	
	
	<form action="edit" method="post"><br><br>
<%-- 번호<input type="text" name="no" value="${dto.no}" readonly="readonly"><br><br>--%>
	<input type="hidden" name="boardNo" value="${dto.boardNo}">
	게시글 제목<input type="text" name="boardTitle" value="${dto.boardTitle}"><br><br>
	게시글 내용<input type="text" name="boardContent" value="${dto.boardContent}"><br><br>
	<button>변경하기</button>
	</form>
	
	

</body>
</html>