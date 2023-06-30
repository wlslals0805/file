package oop.mathod3;

public class Tariff {
//	다음 데이터를 클래스를 만든 뒤 객체로 생성하도록 구현하세요  
//	생성 후 정보를 대입하고 출력 구문을 사용하여 화면에 출력하세요  
//	`setup`, `show`라는 이름으로 메소드를 구현하여 각각 초기화와 출력에 사용하세요
//
//	### 통신사 요금제 정보
//
//	| 통신사 | 상품명 | 월정액 | 데이터(GB) | 통화(분) | 문자(건) |
//	| :---: | :---: | :---: | :---: | :---: | :---: |
//	| SK | 5G언택트 52 | 52000 | 200 | 1000 | 2000 |
//	| KT | 5G세이브 | 45000 | 100 | 900 | 1500 |
//	| LG | 5G시그니처 | 130000 | 500 | 2000 | 2500 |

	String a;
	String name;
	int price;
	int gb;
	int minute;
	int messageCount;
	
	void setup(String a,String name,int price,int gb,int minute,int messageCount) {
		
		this.a=a;
		this.name=name;
		this.price=price;
		this.gb=gb;
		this.minute=minute;
		this.messageCount=messageCount;
		
		
	}
	void 	show(){
		
		System.out.println(this.a);
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.gb);
		System.out.println(this.minute);
		System.out.println(this.messageCount);
		System.out.println();
	}
	
	
}
