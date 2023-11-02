package com.kh.spring13;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test03 {
	
	//application.properties에 작성된 정보를 불러와 사용
	@Autowired
	private JavaMailSender sender;
	
	@Test
	public void test() {
		//이메일 발송 코드
		//- 발송 가능한 계정이 필요(ex : email)
		//- 프로젝트 생성 시 java mail sender 라는 도구가 추가되어야 함	
		
		//전송 메세지 - 상대방의 정보와 메일 내용을 설정 - 여기는 다른 정보 + 매번 바뀜
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("secondepect@naver.com"); //setTo는 받는 사람 지정, 여러 명도 가능
		message.setSubject("야"); // 제목을 설정
		message.setText("뭐하냐"); //내용을 설정
		
		//전송
		sender.send(message);
		
	}
	//SSL 
	//- 보인이 강화된 통신 방식(http -> https)
	//- 전송되는 모든 데이터를 암호화 하여 전송
	//- 반드시 서비스 제공자가 인증서를 등록해야함

	//TLS
	//- SSL 버전 3.0부터를 TLS라고 부른다
	
}
