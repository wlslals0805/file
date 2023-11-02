<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>

<h1>기본 웹소켓 예제</h1>
    
    <button type="button" class="connect-btn">연결</button>
    <button type="button" class="disconnect-btn">종료</button>
    
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    
    <script>
    
    $(function(){
    	
    	//목표 : 연결버튼을 누르면 웹소켓 연결 생성, 종료버튼을 누르면 생성한 연결 종료
    	
    	$(".connect-btn").click(function(){
    		var uri = "ws://localhost:8080/ws/default";
    		
    		window.socket = new WebSocket(uri);
    		
    	});
    	
    	$(".disconnect-btn").click(function(){
    		
    		
    		
    		window.socket.close();
    		
    		
    	});
    	
    	
    });
    
    
    </script>