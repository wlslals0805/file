/*

링크 비활성화 또는 확인창 띄우는 라이브러리

만든사람 - KH정보교육원!

*/








window.addEventListener("load",function(){
    //.link-disabled에 해당하는 모든 링크의 기본이벤트 차단
    //-이벤트 처리 함수에는 첫번째 매개변수로 이벤트 정보가 전달

    var disabledList = document.querySelectorAll(".link-disabled");

    for(var i=0;i<disabledList.length;i++){

        disabledList[i].addEventListener("click",function(e){
            e.preventDefault(); //기본이벤트 차단 명령
            // console.log(e);
        
            // return false;    //작동하지 않음


        })

    }

    var disabledList = document.querySelectorAll(".link-confirm");

    for(var i=0;i<disabledList.length;i++){

        disabledList[i].addEventListener("click",function(e){

            var message = this.dataset.message || "정말 이동하시겠습니까?";
            //앞에 꺼가 없으면 뒤에 걸로. 있으면 앞의 걸로
            
           var result = confirm(message);

            if(result==false){

                e.preventDefault();
            }
           

         


})

}

});
