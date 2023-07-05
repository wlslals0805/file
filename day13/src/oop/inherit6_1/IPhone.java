package oop.inherit6_1;
public class IPhone extends Mobile {

	public IPhone(String number, String color) {
		super(number, color);
	}

	//아이폰 공통기능
	public void siri() {
		System.out.println("음성 인식 기능 실행");
	}

}