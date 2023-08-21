<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    
    <h2>회원 관리</h2>
   
    
    <form action="list" method="post">
    <c:choose>
		<c:when test="${vo.type == 'member_nickname'}">
			<select name="type">
				<option value="member_id">아이디</option>
				<option value="member_nickname" selected>닉네임</option>
				<option value="member_contact">전화번호</option>
				<option value="member_email">이메일</option>
				<option value="member_birth">생년월일</option>
			</select>
		</c:when>
		<c:when test="${vo.type == 'member_contact'}">
			<select name="type">
				<option value="member_id">아이디</option>
				<option value="member_nickname">닉네임</option>
				<option value="member_contact" selected>전화번호</option>
				<option value="member_email">이메일</option>
				<option value="member_birth">생년월일</option>
			</select>
		</c:when>
		<c:when test="${vo.type == 'member_email'}">
			<select name="type">
				<option value="member_id">아이디</option>
				<option value="member_nickname">닉네임</option>
				<option value="member_contact">전화번호</option>
				<option value="member_email" selected>이메일</option>
				<option value="member_birth">생년월일</option>
			</select>
		</c:when>
		<c:when test="${vo.type == 'member_birth'}">
			<select name="type">
				<option value="member_id">아이디</option>
				<option value="member_nickname">닉네임</option>
				<option value="member_contact">전화번호</option>
				<option value="member_email">이메일</option>
				<option value="member_birth" selected>생년월일</option>
			</select>
		</c:when>
		<c:otherwise>
			<select name="type">
				<option value="member_id">아이디</option>
				<option value="member_nickname">닉네임</option>
				<option value="member_contact">전화번호</option>
				<option value="member_email">이메일</option>
				<option value="member_birth">생년월일</option>
			</select>
		</c:otherwise>
	</c:choose>
			<input type="search" name="keyword" placeholder="검색어">
    	
    <button>검색</button>
    
    </form>
    
    
    
    
    
    
    
    
    <table border="1" width="800">
    <thead>
    <tr>
    <td>아이디</td>
    <td>닉네임</td>
    <td>이메일</td>
    <td>전화번호</td>
    <td>생년월일</td>
    <td>회원등급</td>

    </tr>
    </thead>
    <tbody>

    <c:forEach var="memberDto" items="${list}">
    
    <tr>
    <td><a href="member/detail?memberId=${memberDto.memberId}">${memberDto.memberId}</a></td>
    <td>${memberDto.memberNickname}</td>
    <td>${memberDto.memberEmail}</td>
    <td>${memberDto.memberContact}</td>
    <td>${memberDto.memberBirth}</td>
    <td>${memberDto.memberLevel}</td>
   
    </tr>
 	</c:forEach>   
     </tbody>
    </table>
    <br>

<!-- 페이지 네비게이터 출력 -->
<h3>

<!-- 이전 버튼 -->
<c:if test="${!vo.first}">
	<a href="list?${vo.prevQueryString}">&lt;</a>
</c:if>

<!-- 숫자 버튼 -->
<c:forEach var="i" begin="${vo.begin}" end="${vo.end}" step="1">
	<c:choose>
		<c:when test="${vo.page == i}">
			${i}	
		</c:when>
		<c:otherwise>
		<a href="list?${vo.getQueryString(i)}">${i}</a>
		</c:otherwise>
	</c:choose>
</c:forEach>

<!-- 다음 버튼 -->
<c:if test="${!vo.last}">
	<a href="list?${vo.nextQueryString}">&gt;</a>	
	
</c:if>


</h3>

<br>
     
    
    
    
    
    
    
    
    
     <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
