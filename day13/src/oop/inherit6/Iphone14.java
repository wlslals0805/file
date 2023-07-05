package oop.inherit6;
//IPhone14
//전화번호 데이터를 반드시 설정해야함
//색상 데이터를 반드시 설정해야함
//정보 출력(show)기능을 실행하면 설정된 전화번호와 색상 정보가 출력
//전화(call) 기능을 실행하면 "IPhone14 전화 기능 실행" 출력
//문자(sms) 기능을 실행하면 "IPhone14 문자 기능 실행" 출력
//페이스타임(faceTime) 기능을 실행하면 "IPhone14 영상통화 기능 실행" 출력
//시리(siri) 기능을 실행하면 "IPhone14 음성인식 기능 실행" 출력
public class Iphone14 extends Iphone {

	@Override
	public void call() {
	System.out.println("아이폰14 전화 기능 실행");
	}
	
	@Override
	public void sms() {
	System.out.println("아이폰14 문자 기능 실행");
		
	}
	
	public void faceTime() {
		
		System.out.println("아이폰14 영상통화 기능 실행");
	}
	
	@Override
	public void siri() {
		
		System.out.println("아이폰14 음성인식 기능 실행");
		
	}
}
