<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
 
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

 <script>
        //목표 : 설정하기 버튼을 누르면 선택된 파일을 업로드하고 이미지 변경
        $(function(){
            $(".btn-save").click(function(){

                //파일선택창을 Javascript 형태로 불러와야함(내장API 사용)
                //var input = document.querySelector(".file-chooser");
                var input = $(".file-chooser")[0];

                //input이 file일 경우에만 files라는 항목이 존재
                //console.log(input.files);
                if(input.files.length == 0) return;

                //비동기 통신
                //- form으로 파일을 전송할 때 multipart/form-data 설정을 했었다
                //- 비동기 통신일 때는 무슨 처리를 해야 하는가?
                //- processData : false로 설정
                //- contentType : false로 설정
                //- FormData 객체를 만들어 파일을 추가한 뒤 전송
                var form = new FormData();
                //form.append("이름", 데이터);
                form.append("attach", input.files[0]);

                $.ajax({
                    url:"http://localhost:8080/pocketmon/upload",
                    method:"post",
                    processData:false,
                    contentType:false,
                    data: form,
                    success:function(response){
                        //console.log(response);
                        //이미지의 src를 바꾸는 코드
                        $("img").attr("src", "http://localhost:8080/pocketmon/download?attachNo="+response.attachNo);
                    }
                });
            });
        });        
    </script>



<form action="upload" method="post" enctype="multipart/form-data">

	이름 : <input type="text" name="name"><br><br>
	속성 : <input type="text" name="type"><br><br>
	
	<!--이미지 : <input type="file" name="attach" accept=".png, .jpg, .gif"><br><br>  -->
	이미지 : <input type="file" name="attach" accept="image/*"><br><br>

	<button type="button" class="btn-save">등록</button>
<img src="https://dummyimage.com/200x200/000/fff"
                                                    width="200" height="200">
</form>




<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>