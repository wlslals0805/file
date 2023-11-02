package com.kh.spring20.websocket;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class TimeWebSocketServer extends TextWebSocketHandler{
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		
//		Calendar c = Calendar.getInstance();
//		Date d= c.getTime();
//		SimpleDateFormat fmt = new SimpleDateFormat("H:mm:ss");
//		log.debug("시작시간 : " + fmt.format(d));
		
		log.debug("사용자 접속 = {}",session);
		TextMessage message = new TextMessage(LocalDateTime.now().toString());
		session.sendMessage(message);
		
		
		
	}
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		
//		Calendar c = Calendar.getInstance();
//		Date d= c.getTime();
//		SimpleDateFormat fmt = new SimpleDateFormat("H:mm:ss");
//		log.debug("종료시간 : " + fmt.format(d));
		
		
		log.debug("사용자 종료 = {}",session);
		log.debug("종료 사유 = {}",status);
		
		
		
	}

}
