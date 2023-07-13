package oop.setter3;

public class Mobile {
	String name;		//휴대폰이름
	String telecom;	//통신사
	int price;			//판매가
	int month;			//약정개월

	void setName(String name) {
		this.name = name;
	}
	void setTelecom(String telecom) {
		switch(telecom) {
		case "SK":
		case "KT":
		case "LG":
			this.telecom = telecom;
		}
	}
//	void setPrice(int price) {
//		if(price >= 0) {
//			this.price = price;
//		}
//	}
	void setPrice(int price) {
		if(price < 0) {
			return;
		}
		this.price = price;
	}
//	void setMonth(int month) {
//		if(month == 0 || month == 24 || month == 36) {
//			this.month = month;
//		}
//	}
	void setMonth(int month) {
		switch(month) {
		case 0: case 24: case 36:
			this.month = month;
		}
	}
	
	//메소드 오버로딩(method overloading)
	void setup(String name, String telecom, int price) {
		this.setup(name, telecom, price, 0);	//메인 메소드에서 객체 생성 후 참조변수.setup을 불러내고 매개변수에 값을 입력하면 알맞는 곳에 값이 저장되면서 각각의 메소드가 실행되는 것처럼 여기서는 this를 참조변수처럼 사용하며 setup메소드를 불러내고 값을 입력하는 것(마치 메인 메소드인 것처럼 구는 것) 
	}															//그니까 한마디로 괄호 안에 있는 0이 this.setMonth(0)이 되는 것.
	void setup(String name, String telecom, int price, int month) {
		this.setName(name);
		this.setTelecom(telecom);
		this.setPrice(price);
		this.setMonth(month);
	}
	void show() {
		System.out.println("<휴대폰 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("통신사 : " + this.telecom);
		
		if(this.month == 0) {//약정이 없다면
			int discount = this.price * 5 / 100;
			int result = this.price - discount;
			System.out.print("판매가 : " + result + "원");
			System.out.println("(원가 " + this.price +"원)");
		}
		else {//약정이 있다면
			int monthPrice = this.price / this.month;			//임시로 쓰는 변수에는 this를 못 붙이고 멤버필드에만 this를 붙일 수 있다.
			System.out.print("판매가 : " + this.price + "원");
			System.out.println("(월 "+monthPrice+"원)");
		}
		
		if(this.month == 0) {
			System.out.println("약정 없음");
		}
		else {
			System.out.println("약정기간 : " + this.month+"개월");
		}
	}
}
