package oop.modifier2;

public class Member {
	
//	KH 내집마련 적금통장 가입자 정보
	
//	예금주이름	총납입기간	현재납입회차	월납입금액	총잔액
//	유재석		3년		15회차	100만원	1500만원
//	강호동		2년		5회차		50만원	250만원
//	신동엽		2년		8회차		80만원	1000만원
	
//	요구사항
//	기간은 1, 2, 3, 5, 10년 중에서 선택 가능
//	납입회차는 기간에 맞게 자동으로 설정
//	최초 1회를 제외하고 월 1회를 기간에 맞게 자동으로 설정
//	1년일 경우 최초 1회를 포함하여 총 13회차가 되어야 함
//	납입금액은 월 납입금액을 의미하며 만원 단위로만 설정 가능
//	잔액은 0 이상이어야 함
//	이름과 기간, 납입금액은 반드시 설정되어야 함
//	납입회차는 최초 생성시 1회차로 설정되어야 함
//	정보 출력 시 해당 적금이 만기인지 판정하여 만기인 경우 추가 키워드 출력
//	이율은 없음
	
//	추가 요구사항
//	next라는 이름의 메소드를 만들어서 호출하면 1회차가 진행된 상태로 변경하세요
//	만기된 적금은 백날 next 불러봤자 상태변화가 생기지 않음
//	정보 출력시 만기 예상 금액을 같이 출력하세요
	
	Member(String name,int period,int input){
		this.name=name;
		this.period=period;
		this.count=0;
		this.input=input;
		this.balance=0;
		
	} 
	
	Member(String name,int period,int count,int input,int balance){
		this.setName(name);
		this.setPeriod(period);
		this.setCount(count);
		this.setInput(input);
		this.setBalance(balance);
		
	} 
	
	
	
	int a;
	int b;
	String name;
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
		
		
		if(period==1||period==2||period==3||period==5||period==10) {
		
			this.period=period;}
	}
	
	int getCount() {
		return count;
	}
	void setCount(int count) {
		this.count=count;
	}
	
	int getInput() {
		return input;
	}
	void setInput(int input) {
		if(input%10000==0) {
		this.input = input;}
	}
	int getBalance() {
		return balance;
	}
	void setBalance(int balance) {
		if(balance>=0) {
		this.balance = balance;}
	}
	int getA() {
		return this.a=(this.period*12+1)-this.count;
	}
	int getB() {
		
	return this.b=(this.getA()*this.input)+(this.count*this.input);
	
	}
	
	int period;
	int count;
	int input;
	int balance;
	
	
	void show() {
		
		System.out.println(this.name);
		System.out.println(this.period);
		System.out.println(this.count);
		System.out.println(this.input);
		System.out.println(this.balance);
		System.out.println("만기 예상 금액: "+this.getB());
		System.out.println();
		
	}


}
