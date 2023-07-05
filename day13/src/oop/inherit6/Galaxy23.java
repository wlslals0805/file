package oop.inherit6;
//Galaxy23s
//전화번호 데이터를 반드시 설정해야함
//색상 데이터를 반드시 설정해야함
//정보 출력(show)기능을 실행하면 설정된 전화번호와 색상 정보가 출력
//전화(call) 기능을 실행하면 "갤럭시s23 전화 기능 실행" 출력
//문자(sms) 기능을 실행하면 "갤럭시s23 문자 기능 실행" 출력
//삼성페이(samsungPay) 기능을 실행하면 "갤럭시s23 삼성페이 기능 실행" 출력
//빅스비(bixby) 기능을 실행하면 "갤럭시s23 음성인식 기능 실행" 출력
public class Galaxy23 extends Galaxy{
	
	@Override
	public void call() {
		System.out.println("갤럭시s23 전화 기능 실행");
	}
	


	
	@Override
	public void sms() {
	System.out.println("갤럭시s23 문자 기능 실행");
	}
	
	@Override
	public void samsungPay() {
			System.out.println("갤럭시s23 삼성페이 기능 실행");
	
	}
	
	public void bixby() {
		
		System.out.println("갤럭시s23 음성인식 기능 실행");
	}
	

}
