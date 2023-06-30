package oop.mathod2;

public class KoreanPlayer {
//	다음 데이터를 클래스를 만든 뒤 객체로 생성하도록 구현하세요  
//	생성 후 정보를 대입하고 출력 구문을 사용하여 화면에 출력하세요  
//	`setup`, `show`라는 이름으로 메소드를 구현하여 각각 초기화와 출력에 사용하세요 
//
//	### 역대 한국인 올림픽 메달 보유 선수
//
//	| 이름 | 종목 | 구분 | 금메달 | 은메달 | 동메달 |
//	| :---: | :---: | :---: | :---: | :---: | :---: |
//	| 진종오 | 사격 | 하계 | 4 | 2 | 0 |
//	| 김수녕 | 양궁 | 하계 | 4 | 1 | 1 |
//	| 전이경 | 쇼트트랙 | 동계 | 4 | 0 | 1 | 
//

	
	String name;
	String type;
	String a;
	int gold;
	int s;
	int d;
	
	
	void setup(String name,String type,String a,int gold, int s, int d){
		this.name=name;
		this.type=type;
		this.a=a;
		this.gold=gold;
		this.s=s;
		this.d=d;}
		
		void show() {
			
			System.out.println("이름: "+this.name);
			System.out.println("종목: "+this.type);
			System.out.println("구분: "+this.a);
			System.out.println("금메달 수 "+this.gold);
			System.out.println("은메달 수 "+this.s);
			System.out.println("동메달 수 "+this.d);
			System.out.println();
			
		}
		
		
		
	}
	
	
	
