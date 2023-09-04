<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>


	<script src="/js/boardWrite.js"></script>


 <div class="container w-600">
        <div class="row">
            <h1>게시 글 작성</h1>
        </div>

        <form autocomplete="off" onsubmit="return checkForm();" action="write" method="post">

        <div class="row left">
            <label>
                제목
                <i class="fa-solid fa-asterisk red"></i>
            </label>
            <input type="text" name="boardTitle" class="form-input w-100"
                        onblur="checkBoardTitle();">
            <div class="fail-feedback">제목은 필수이며 100자 이내로 작성하세요</div>
        </div>

        <div class="row left">
            <label>
                내용
                <i class="fa-solid fa-asterisk red"></i>
            </label>

            <textarea name="boardContent" class="form-input w-100"
                        rows="10" oninput="checkBoardContent();"></textarea>
            <div class="fail-feedback">내용은 반드시 작성해야 합니다</div>
        </div>

        <div class="row right">
            <span class="len red">0</span> / 1000
        </div>

        <div class="row">
            <button class="btn btn-positive w-100">
                <i class="fa-solid fa-pen"></i>
                작성하기
            </button>
        </div>

        </form>
    </div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>