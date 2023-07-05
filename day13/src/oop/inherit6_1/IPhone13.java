package oop.inherit6_1;
public class IPhone13 extends IPhone {

	public IPhone13(String number, String color) {
		super(number, color);
	}
	
	//고유 기능
	public void itunes() {
		System.out.println("아이폰13 아이튠즈 기능 실행");
	}
	//재정의
	@Override
	public void call() {
		System.out.println("아이폰13 전화 기능 실행");
	}
	@Override
	public void sms() {
		System.out.println("아이폰13 문자 기능 실행");
	}
	@Override
	public void siri() {
		System.out.println("아이폰13 음성 인식 기능 실행");
	}

}