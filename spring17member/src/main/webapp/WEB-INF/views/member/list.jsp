<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<form>
	<div>
		멤버아이디 <input type="text" name="memberId" value="${vo.memberId}">
	</div>
	<div>
		멤버닉네임<input type="text" name="memberNickname" value="${vo.memberNickname}">
	</div>
	<div>
		멤버이메일<input type="text" name="memberEmail" value="${vo.memberEmail}">
	</div>
	<div>
		전화번호<input type="text" name="memberContact" value="${vo.memberContact}">
	</div>
	<div>
		우편번호<input type="text" name="memberPost" value="${vo.memberPost}">
	</div>
	<div>
		생년월일 <input type="date" name="birthBegin"
			value="${vo.birthBegin}"> ~ <input type="date"
			name="birthEnd" value="${vo.birthEnd}">
	</div>
	<div>
		포인트 <input type="number" name="pointMin" value="${vo.pointMin}">이상
		<input type="number" name="pointMax" value="${vo.pointMax}">이하
	</div>
	<div>
	회원등급
	<c:choose>
		<c:when test="${vo.memberLevelList.contains('일반')}">
			<input type="checkbox" name="memberLevelList" value="일반" checked>일반
		</c:when>
			<c:otherwise>
			<input type="checkbox" name="memberLevelList" value="일반">일반
			</c:otherwise>
	</c:choose>
	<c:choose>
		<c:when test="${vo.memberLevelList.contains('VIP')}">
			<input type="checkbox" name="memberLevelList" value="VIP" checked>VIP
		</c:when>
			<c:otherwise>
			<input type="checkbox" name="memberLevelList" value="VIP">VIP
			</c:otherwise>
	</c:choose>
	<c:choose>
		<c:when test="${vo.memberLevelList.contains('관리자')}">
			<input type="checkbox" name="memberLevelList" value="관리자" checked>관리자
		</c:when>
			<c:otherwise>
			<input type="checkbox" name="memberLevelList" value="관리자">관리자
			</c:otherwise>
	</c:choose>
	</div>
	
	<!-- 정렬 -->
	<div>
	1차 정렬
	<select name="orderList">
		<option value="">선택하세요</option>
		<option value="member_id asc">아이디순</option>
		<option value="member_point desc">포인트 높은 순</option>
		<option value="member_point asc">포인트 낮은 순</option>
		<option value="member_join desc">최근 가입 순</option>
	</select>
	</div>
	<div>
	2차 정렬
		<select name="orderList">
		<option value="">선택하세요</option>
		<option value="member_id asc">아이디순</option>
		<option value="member_point desc">포인트 높은 순</option>
		<option value="member_point asc">포인트 낮은 순</option>
		<option value="member_join desc">최근 가입 순</option>
	</select>
	</div>
	
	
	
	
	<button type="submit">검색</button>

</form>

<hr>

<table border="1">
	<thead>
		<tr>
			<th>멤버아이디</th>
			<th>멤버닉네임</th>
			<th>멤버이메일</th>
			<th>멤버전화번호</th>
			<th>멤버생년월일</th>
			<th>우편번호</th>
			<th>주소</th>
			<th>상세주소</th>
			<th>회원등급</th>
			<th>포인트</th>
			<th>최근로그인</th>
			<th>가입일</th>
			<th>최근변경일</th>
		</tr>
	</thead>
	<c:forEach var="memberDto" items="${list}">
		<tbody>
			<tr>
				<td>${memberDto.memberId}</td>
				<td>${memberDto.memberNickname}</td>
				<td>${memberDto.memberEmail}</td>
				<td>${memberDto.memberContact}</td>
				<td>${memberDto.memberBirth}</td>
				<td>${memberDto.memberPost}</td>
				<td>${memberDto.memberAddr1}</td>
				<td>${memberDto.memberAddr2}</td>
				<td>${memberDto.memberLevel}</td>
				<td>${memberDto.memberPoint}</td>
				<td>${memberDto.memberLogin}</td>
				<td>${memberDto.memberJoin}</td>
				<td>${memberDto.memberChange}</td>
			</tr>
		</tbody>
	</c:forEach>

</table>
