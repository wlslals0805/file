<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
매번 페이지 코드를 복사할 수 없으니 미리 만든 것을 불러오도록 설정
	-템플릿 페이지(template page)라고 부름
	-절대경로를 사용할 것
 --%>	
 <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
	
	
	<c:choose>
	
	<c:when test="${sessionScope.name!=null}">
		<h2>${sessionScope.name}님 환영합니다!</h2>
		<img src="/puppy.jpg">
	</c:when>
	
	<c:otherwise>
	
	<h2>방문을 환영합니다!</h2>
	<h3>회원가입 해주실 거죠?</h3><br><br>
	<img src="bling.jpg"><br><br>
	<a href="member/join">회원가입 바로가기</a>
	
	
	</c:otherwise>
	</c:choose>
	
	
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>



</body>
</html>