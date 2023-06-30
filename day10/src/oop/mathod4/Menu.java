package oop.mathod4;

public class Menu {
	
	String name;
	String type;
	int price;//할인 전 금액
	boolean event;
	
	//setup을 두 종류로 구현(메소드 오버로딩, method overloading)
	//[1] 3개의 데이터가 들어오면 이벤트는 안하는 걸로 생각하여 처리
	//[2] 4개의 데이터가 들어오면 이벤트 정보도 설정하는걸로 처리
	void setup(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.event = false;
	}
	void setup(String name, String type, int price, boolean event) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.event = event;
	}
	
	
	
	void show() {
		System.out.println("<메뉴 정보>");
		
		System.out.print("메뉴명 : " + this.name);
		if(this.event) {//행사중이면
			System.out.print("(행사중)");
		}
		System.out.println();
		
		System.out.println("구분 : " + this.type);
		
		if(this.event) {//행사중이면
			System.out.print("판매가 : " + this.price*80/100+"원");
			System.out.print("(원가 : " + this.price+"원)");
			System.out.println();
		}
		else {
			System.out.println("판매가 : " + this.price+"원");
		}
		
		//System.out.println("이벤트 : " + this.event);
	}
}
