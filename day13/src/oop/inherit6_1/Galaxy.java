package oop.inherit6_1;
public class Galaxy extends Mobile{

	public Galaxy(String number, String color) {
		super(number, color);
	}
	
	//갤럭시 공통기능
	public void samsungPay() {
		System.out.println("삼성페이 기능");
	}
}
