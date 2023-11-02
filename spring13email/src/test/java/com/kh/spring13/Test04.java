package com.kh.spring13;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test04 {

	@Autowired
	private JavaMailSender sender;
	
	@Test
	public void test() throws MessagingException {
		//단문메일(SimpleMailMessage)가 아니라 마임메세지(MimeMessage)를 전송
		
		//[1] 메세지 객체 생성 - sender에게 템플릿을 가져오도록 지시
		MimeMessage message = sender.createMimeMessage();
		
		//[2] 메세지 설정 도우미 객체 생성 - 메일의 내용을 쉽게 설정하도록 만드는 도구
		MimeMessageHelper helper = new MimeMessageHelper(message, false, "UTF-8");
		//encoding - utf-8처럼 변조를 막는것
		
		//[3] helper에 정보 설정
//		helper.setTo("secondepect@naver.com");
		//배열
		helper.setTo(new String[] {"secondepect@naver.com"});
//		helper.setSubject("제목");
//		helper.setText("<h1>hello</h1>" , false);
//		helper.setText("<h1>hello</h1>" , true);
		//버퍼와 빌더의 차이
		//버퍼는 빌더에 비해 느리지만 웹과 같은 다중환경에서 안정적
		//빌더는 빠름
		//문자열이 불변이므로 +를 하면 신규문자열을 생성함 -> 그래서 느림
		StringBuffer buffer = new StringBuffer();
//		buffer.append("<div>");
//		buffer.append("<h1>제목 테스트</h1>");
//		buffer.append("<p>내용 테스트</p>");
//		buffer.append("</div>");
//		helper.setText(buffer.toString(), true);
		
		//태그에 디자인도 끝내서 보내버린다(인라인 스타일)
		buffer.append("<div style='padding:20px; box-shadow: 0 0 2px 2px black'>");
		buffer.append("<h1 style='color:blue'>제목 테스트</h1>");
		buffer.append("<p>내용 테스트</p>");
		buffer.append("</div>");
		helper.setText(buffer.toString(), true);
		
		//[4] 전송
		sender.send(message);
		
	}
	
}
