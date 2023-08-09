<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page = "/WEB-INF/views/template/header.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- if문,for문 필요할 때 -->


<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- 날짜를 상황에 맞춰서 예쁘게 나타내고 싶을 때 -->


<h2>${memberDto.memberId}님의 회원 정보</h2>

<table border="1"width="500">
	<tr>
		<th>닉네임</th>
		<td>${memberDto.memberNickname}</td>
		</tr>
		
		<tr>
		<th>이메일</th>
		<td>${memberDto.memberEmail}</td>
		
		</tr>
		<tr>
		<th>연락처</th>
		<td>${memberDto.memberContact}</td>
		</tr>
		
		<tr>
		<th>생년월일</th>
		<td>${memberDto.memberBirth}</td>
		
		</tr>
		
		<tr>
		<th>주소</th>
		<td>${memberDto.memberPost}
		${memberDto.memberAddr1}
		${memberDto.memberAddr2}
		</td>
		</tr>
		
		<tr>
		<th>등급</th>
		<td>${memberDto.memberLevel}</td>
		</tr>

		<tr>
			<th>포인트</th>
			<!-- <td>${memberDto.memberPoint}</td> -->
			<td><fmt:formatNumber value = "${memberDto.memberPoint}"
			pattern="#,##0">
			</fmt:formatNumber>pt
			</td>
			</tr>
			
			<tr>
			<th>가입일</th>
			<!-- <td>${memberDto.memberJoin}</td> -->
			
			
			<td>
			
			<fmt:formatDate value="${memberDto.memberJoin}" pattern="y년 M월 d일 E a h시 m분 s초"/>
			
			
			</td>
			</tr>
			<tr>
			<th>마지막 로그인</th>
		<!-- 	<td>${memberDto.memberLogin}</td> -->
			<td><fmt:formatDate value="${memberDto.memberLogin}" pattern="y년 M월 d일 E a h시 m분 s초"/></td>
			
			</tr>

			<tr>
			<th>마지막 변경일</th>
		<!-- 	<td>${memberDto.memberChange}</td> -->
			<td><fmt:formatDate value="${memberDto.memberChange}" pattern="y년 M월 d일 E a h시 m분 s초"/></td>
			</tr>
</table>


<h2><a href="password">비밀번호 변경</a></h2>
<h2><a href="change">개인정보 변경</a></h2>
<h2><a href="change2">지니의 개인정보 변경</a></h2>
<h3><a href="exit">회원 탈퇴</a></h3>
<h3><a href="exit2">지니의 회원 탈퇴</a></h3>



<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>