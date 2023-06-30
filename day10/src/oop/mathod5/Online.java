package oop.mathod5;

public class Online {
	
//	> 온라인 쇼핑몰 상품 정보
//
//	| 상품명 | 상품분류 | 판매가 | 새벽배송 | 행사여부 |
//	| :---: | :---: | :---: | :---: | :---: |
//	| 참이슬후레쉬 | 주류 | 1200 | 가능 | 행사중 |
//	| 클라우드맥주 | 주류 | 3000 | 불가능 | 행사중 |
//	| 바나나킥 | 과자 | 1500 | 불가능 | 행사중 |
//	| 허니버터칩 | 과자 | 2000 | 가능 | 해당없음 |
//
//	요구사항
//
//	- 새벽배송이 가능한 상품은 2500원의 배송비가 추가됨을 출력 시 표시해야 합니다
//	- 행사중인 상품은 가격 옆에 "행사중"이라고 출력해야 합니다 
//	- 행사중인 상품은 가격을 10% 할인해서 출력해야 합니다
	
	String name, type;
	int price;
	boolean dawn, event;
	
	void setup(String name, String type,int price,boolean dawn,boolean event){
		this.name=name;
		this.type=type;
		this.price=price;
		this.dawn=dawn;
		this.event=event;
	}
//	void setup(String name, String type,int price,boolean dawn){
//		
//	}
//	void setup(String name, String type,int price,boolean event){
//	
//	}
	
//	void setup(String name, String type,int price){
//		this.name=name;
//		this.type=type;
//		this.price=price;
//	}
	
	void setup(String name, String type,int price) {
		this.setup(name, type, price, false, false);
		
	}
	
	
		
		void show() {
			System.out.print("이름: "+this.name);
			if(event) {System.out.print("(행사 중)");}
			System.out.println();
			System.out.println("분류: "+this.type);
			if(dawn) {
				this.price=price+2500;
				System.out.print("(2500원의 배송비가 추가됨) ");}
			if(event) {price=price-(price*10/100);}
			System.out.println("가격: "+this.price);
//			System.out.println(this.dawn);
//			System.out.println(this.event);
			System.out.println();
			
		
	
		}
}
	
	

