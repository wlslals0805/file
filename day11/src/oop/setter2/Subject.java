package oop.setter2;

public class Subject {
	String title;//강좌명
	int period;//강의시간
	int price;//수강료
	String type;//구분
	
	void setTitle(String title) {
		this.title = title;
	}
	void setPeriod(int period) {
		if(period > 0 && period % 30 == 0) {
			this.period = period;
		}
	}
//	void setPrice(int price) {
//		if(price >= 0) {
//			this.price = price;
//		}
//	}
	void setPrice(int price) {
		if(price < 0) {
			return;//반환은 없지만 중지하세요!
		}
		this.price = price;
	}
	void setType(String type) {
		switch(type) {
		case "온라인":
		case "오프라인":
		case "혼합":
			this.type = type;
		}
	}
	
	//객체 생성 후 참조변수.setup 메소드를 불러내면 괄호 안에 들어간 매개변수 입력값이 나오고 그 안에 입력하면 아래 과정이 진행된다. (멤버필드의 값 하나가 입력되면 set멤버필드로 가서 입력된다. 결국 메소드 하나를 불러내면 그 메소드가 메소드 4개(멤버필드 수)의 활동으로 이어지는 것. 하나하나 불러올 때처럼. ex:p1(참조변수).name="홍길동" )
	void setup(String title, int period, int price, String type) {
		this.setTitle(title);		//매개변수 title을 입력받아서 this(이 클래스 안의).setTitle 메소드에 넣겠다. 
										//setTitle 메소드에 들어간 입력값 title은 setTitle 메소드 안에서 검사를 받는다. 검사에 통과하면 this.title에 입력값 title이 들어간다. 결국 show()메소드 에서 출력되는 것은 title 값이 들어간 this.title이다.
		this.setPeriod(period);
		this.setPrice(price);
		this.setType(type);
	}
	
	void show() {
		System.out.println("<강좌 정보>");
		System.out.println("이름 : " + this.title);
		System.out.println("시간 : " + this.period);
		System.out.println("가격 : " + this.price+"원");
		System.out.println("유형 : " + this.type);
	}
}
