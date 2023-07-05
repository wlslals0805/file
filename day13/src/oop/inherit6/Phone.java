package oop.inherit6;
//Galaxy23s
//전화번호 데이터를 반드시 설정해야함
//색상 데이터를 반드시 설정해야함
//정보 출력(show)기능을 실행하면 설정된 전화번호와 색상 정보가 출력
//전화(call) 기능을 실행하면 "갤럭시23s 전화 기능 실행" 출력
//문자(sms) 기능을 실행하면 "갤럭시23s 문자 기능 실행" 출력
//삼성페이(samsungPay) 기능을 실행하면 "갤럭시23s 삼성페이 기능 실행" 출력
//빅스비(bixby) 기능을 실행하면 "갤럭시23s 음성인식 기능 실행" 출력

//GalaxyFold4
//전화번호 데이터를 반드시 설정해야함
//색상 데이터를 반드시 설정해야함
//정보 출력(show)기능을 실행하면 설정된 전화번호와 색상 정보가 출력
//전화(call) 기능을 실행하면 "갤럭시폴드4 전화 기능 실행" 출력
//문자(sms) 기능을 실행하면 "갤럭시폴드4 문자 기능 실행" 출력
//삼성페이(samsungPay) 기능을 실행하면 "갤럭시폴드4 삼성페이 기능 실행" 출력
//홍채인식(iris) 기능을 실행하면 "갤럭시폴드4 홍채인식 기능 실행" 출력

//IPhone13
//전화번호 데이터를 반드시 설정해야함
//색상 데이터를 반드시 설정해야함
//정보 출력(show)기능을 실행하면 설정된 전화번호와 색상 정보가 출력
//전화(call) 기능을 실행하면 "IPhone13 전화 기능 실행" 출력
//문자(sms) 기능을 실행하면 "IPhone13 문자 기능 실행" 출력
//아이튠즈(itunes) 기능을 실행하면 "IPhone13 아이튠즈 기능 실행" 출력
//시리(siri) 기능을 실행하면 "IPhone13 음성인식 기능 실행" 출력

//IPhone14
//전화번호 데이터를 반드시 설정해야함
//색상 데이터를 반드시 설정해야함
//정보 출력(show)기능을 실행하면 설정된 전화번호와 색상 정보가 출력
//전화(call) 기능을 실행하면 "IPhone14 전화 기능 실행" 출력
//문자(sms) 기능을 실행하면 "IPhone14 문자 기능 실행" 출력
//페이스타임(faceTime) 기능을 실행하면 "IPhone14 영상통화 기능 실행" 출력
//시리(siri) 기능을 실행하면 "IPhone14 음성인식 기능 실행" 출력

public class Phone {
	
	 protected String number;
	 protected String color;
	
	 public String getNumber() {
		 return number;
	 }
	 
	 public void setNumber(String number) {
		 this.number = number;
	 }

		public void setColor(String color) {
			this.color = color;
		}
	
	public String getColor() {
		return color;
	}


	public final void show() {
		
		System.out.println("전화번호: "+this.number);
		System.out.println("색상: "+this.color);
	}


	public void call() {
		
		System.out.println("전화 기능 실행");
	}
	public void sms() {
		System.out.println("문자 기능 실행");
	}
}
