package com.kh.spring13;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test01 {
	
	@Test
	public void test() {
		//이메일 발송 코드
		//- 발송 가능한 계정이 필요(ex : email)
		//- 프로젝트 생성 시 java mail sender 라는 도구가 추가되어야 함
		
		//나중에 구조를 다 짜면 JavaMailSender를 사용 
		//전송 도구 - 업체와 계정 관련 정보를 설정 - 여기는 같은 정보
		JavaMailSenderImpl sender = new JavaMailSenderImpl();
		sender.setHost("smtp.gmail.com"); //업체주소
		sender.setPort(587); //업체의 포트번호
		sender.setUsername("jsk08test"); //나의 이메일 계정
		sender.setPassword("kucjguiidjfogxhs"); //나의 앱 비밀번호(로그인 비밀번호가 아님)
		
		//통신과 관련된 추가 설정이 필요
		Properties props = new Properties();
		props.setProperty("mail.smtp.auth", "true"); //인증 후 이용 설정(필수)
		props.setProperty("mail.smtp.debug", "true"); //디버깅 기능 이용 설정(선택)
		props.setProperty("mail.smtp.starttls.enable", "true"); //TLS 사용 설정(필수)
		props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2"); //TLS 버전 설정
		props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com"); //신뢰할 수 있는 대상 설정(필수)
		sender.setJavaMailProperties(props);
		
		
		//전송 메세지 - 상대방의 정보와 메일 내용을 설정 - 여기는 다른 정보
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
