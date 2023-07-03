package oop.mathod4;

public class Menu_1 {
	
	
//	> 커피숍 메뉴 정보
//
//	| 이름 | 분류 | 가격 | 행사여부 | 
//	| :---: | :---: | :---: | :---: |
//	| 아메리카노 | 음료 | 2500 | 행사중 | 
//	| 모카라떼 | 음료 | 3500 | - | 
//	| 치즈케이크 | 디저트 | 5000 | 행사중 |
//	| 마카롱 | 디저트 | 3000 | - |
//
//	요구사항
//
//	- 행사중인 상품은 출력 시 이름 옆에 `(행사중)` 이라고 표시
//	- 행사중인 상품은 가격을 20% 할인해서 출력
//	- `setup`, `show`라는 이름으로 메소드를 구현하여 각각 초기화와 출력에 사용하세요
	
	String name,type;
	int price;
	boolean event;
	
	void setup(String name,String type,int price,boolean event) {
		
		this.name=name;
		this.type=type;
		this.price=price;
		this.event=event;
	}
	
	void show() {
		
		System.out.print(name);
		if(event) {System.out.println(" (행사 중)");}
		System.out.println(type);
		
		if(event) {
			
			price=price-(price*20/100);
		}
		System.out.println(price);
		System.out.println();
//		System.out.println(event);
	}
	
	
	
	

}
