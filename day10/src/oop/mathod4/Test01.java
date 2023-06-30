package oop.mathod4;

public class Test01 {

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
	
	
	public static void main(String[] args) {
		CoffeeShop p1=new CoffeeShop();
		CoffeeShop p2=new CoffeeShop();
		CoffeeShop p3=new CoffeeShop();
		CoffeeShop p4=new CoffeeShop();
		
		p1.setup("아메리카노(행사 중)","음료", 2500-(2500*20/(double)100)," ");
		p2.setup("모카라떼","음료", 3500," ");
		p3.setup("치즈케이크(행사 중)","디저트", 5000-(5000*20/(double)100)," ");
		p4.setup("마카롱","디저트", 3000," ");
		
		
		p1.show();
		p2.show();
		p3.show();
		p4.show();
		
		
	}

}
