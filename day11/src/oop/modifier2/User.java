package oop.modifier2;

public class User {
	
//	KH 내집마련 적금통장 가입자 정보
//	| 이름 | 기간 | 납입회차 | 납입금액 | 잔액 | 
	//| --- | --- | --- | --- | --- | --- | 
	
//	| 유재석 | 3년 | 15회차 | 100만원 | 1500만원 | 
//	| 강호동 | 2년 | 5회차 | 50만원 | 250만원 | 
//	| 신동엽 | 2년 | 8회차 | 80만원 | 1000만원 |
//
//	요구사항
//	기간은 1, 2, 3, 5, 10년 중에서 선택 가능
//	납입회차는 기간에 맞게 자동으로 설정
//	최초 1회를 제외하고 월 1회를 기간에 맞게 자동으로 설정
//	1년일 경우 최초 1회를 포함하여 총 13회차가 되어야 함
//	납입금액은 월 납입금액을 의미하며 만원 단위로만 설정 가능
//	잔액은 0 이상이어야 함
//	이름과 기간, 납입금액은 반드시 설정되어야 함
//	납입회차는 절대로 사용자가 직접 설정하면 안됨
//	정보 출력 시 해당 적금이 만기인지 판정하여 만기인 경우 추가 키워드 출력
//	이율은 없음

	String name;
	int period;
	int count;
	int input;
	int price;
	int o;
	
	
	void setup(String name,int period,int count,int input,int price) {
		this.name=name;
		this.period=period;
		this.count=count;
		this.input=input;
		this.price=price;
		
		
	}
	
	
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getPeriod() {
		return period;
	}
	void setPeriod(int period) {
		if(period==1||period==2||period==2||period==3||period==5||period==10) {	
		this.period = period;}
		if(period==1) {
			
			this.period=13;
		}
		
	}
	int getCount() {
		return count=period*13-count;
	}
	void setCount(int count) {
		this.count = count;
	}
	int getInput() {
		return this.input;
	}
	void setInput(int input) {
		if(this.input%10000==0) {
			this.input=input;
		}
		
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
//		this.price = price;
		if(price>=0) {
			this.price=price;
		}
	}
	
	int b=this.getCount()*this.input;	

	
	boolean a=b>price;
	
	
	
	void show() {
		
		System.out.println(this.name);
		System.out.println(this.period);
		System.out.println(this.getCount());
		System.out.println(this.input);
		System.out.println(this.price);
		if(a) {System.out.println("만기");}
		System.out.println(b);
		System.out.println();
	}
	
	
	
}
