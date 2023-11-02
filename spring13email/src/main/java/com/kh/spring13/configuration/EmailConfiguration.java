package com.kh.spring13.configuration;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

//JavaMAilSenderImpl을 스프르잉에 등록해두기 위한 설정
//- Bean 설정 등록을 하는 설정 파일은 상속이 필요하지 않다
@Configuration
public class EmailConfiguration {
	
	@Autowired
	private EmailProperties emailProperties;
	
	//객체를 생성하여 반환하는 메소드를 만들고 상단에 @Bean을 추가
	@Bean
	public JavaMailSender sender() { // 이렇게 만들면 @Autowired가 가능해진다
		//전송 도구 - 업체와 계정 관련 정보를 설정 - 여기는 같은 정보
		JavaMailSenderImpl sender = new JavaMailSenderImpl(); //impl 을 만들어도 sender로 나간다(업캐스팅)
		sender.setHost(emailProperties.getHost()); //업체주소
		sender.setPort(emailProperties.getPort()); //업체의 포트번호
		sender.setUsername(emailProperties.getUsername()); //나의 이메일 계정
		sender.setPassword(emailProperties.getPassword()); //나의 앱 비밀번호(로그인 비밀번호가 아님)
		
		//통신과 관련된 추가 설정이 필요
		Properties props = new Properties();
		props.setProperty("mail.smtp.auth", "true"); //인증 후 이용 설정(필수)
		props.setProperty("mail.smtp.debug", "true"); //디버깅 기능 이용 설정(선택)
		props.setProperty("mail.smtp.starttls.enable", "true"); //TLS 사용 설정(필수)
		props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2"); //TLS 버전 설정
		props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com"); //신뢰할 수 있는 대상 설정(필수)
		sender.setJavaMailProperties(props);

		return sender;//객체를 반환
	}
}
