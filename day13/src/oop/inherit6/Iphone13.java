package oop.inherit6;
//IPhone13
//전화번호 데이터를 반드시 설정해야함
//색상 데이터를 반드시 설정해야함
//정보 출력(show)기능을 실행하면 설정된 전화번호와 색상 정보가 출력
//전화(call) 기능을 실행하면 "IPhone13 전화 기능 실행" 출력
//문자(sms) 기능을 실행하면 "IPhone13 문자 기능 실행" 출력
//아이튠즈(itunes) 기능을 실행하면 "IPhone13 아이튠즈 기능 실행" 출력
//시리(siri) 기능을 실행하면 "IPhone13 음성인식 기능 실행" 출력

public class Iphone13 extends Iphone{
	
	@Override
	public void call() {
	System.out.println("아이폰13 전화 기능 실행");
	}
	
	@Override
	public void sms() {
	System.out.println("아이폰13 문자 기능 실행");
		
	}
	
	public void itunes() {
		
		System.out.println("아이폰13 아이튠즈 기능 실행");
	}
	
	@Override
	public void siri() {
		
		System.out.println("아이폰13 음성인식 기능 실행");
		
	}
	
	

}
