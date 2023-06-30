package oop.mathod5;

public class Test01 {

	public static void main(String[] args) {
//		| 상품명 | 상품분류 | 판매가 | 새벽배송 | 행사여부 |
//		| :---: | :---: | :---: | :---: | :---: |
//		| 참이슬후레쉬 | 주류 | 1200 | 가능 | 행사중 |
//		| 클라우드맥주 | 주류 | 3000 | 불가능 | 행사중 |
//		| 바나나킥 | 과자 | 1500 | 불가능 | 행사중 |
//		| 허니버터칩 | 과자 | 2000 | 가능 | 해당없음 |
	//
//		요구사항
	//
//		- 새벽배송이 가능한 상품은 2500원의 배송비가 추가됨을 출력 시 표시해야 합니다
//		- 행사중인 상품은 가격 옆에 "행사중"이라고 출력해야 합니다 
//		- 행사중인 상품은 가격을 10% 할인해서 출력해야 합니다
		
		Online p1=new Online();
		Online p2=new Online();
		Online p3=new Online();
		Online p4=new Online();
		
		p1.setup("참이슬후레쉬","주류",1200,true,true);
		p2.setup("클라우드맥주","주류",3000,false,true);
		p3.setup("바나나킥","과자",1500,false,true);
		p4.setup("허니버터칩","과자",2000,true,false);
		
		
		p1.show();
		p2.show();
		p3.show();
		p4.show();
		
	}

}
