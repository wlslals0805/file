package oop.setter3;

public class Phone {
//	휴대폰 판매 정보
//	이름			통신사			가격			약정개월
//	갤럭시23s	SK					180만원		설정하지 않음
//	갤럭시23s	KT					175만원		24개월
//	아이폰14		LG					200만원		30개월
//	아이폰14		SK					199만원		설정하지 않음
//	요구사항
//	통신사는 SK, KT, LG 중에서 설정 가능
//	가격은 0 이상으로만 설정 가능
//	약정개월은 0, 24, 36개월 중에서만 설정 가능
//	약정기간을 설정한 경우에는 월 할부금을 계산해서 출력
//	월 할부금은 판매가격을 약정기간동안 나눠서 낸다고 가정하고 계산
//	약정기간을 설정하지 않은 경우에는 가격 옆에 (약정 없음) 을 출력
//	약정기간을 설정하지 않은 경우에는 5% 할인된 가격으로 출력
	
	String name;
	String a;
	int price;
	int period;
//	boolean period;
	
	//메소드 오버로딩(method overloading)
	void serup(String name, String a, int price) {
		
		this.setup(name, a, price, 0);
		
	}
	void setup(String name, String a, int price, int  period) {
		
		this.name=name;
		this.setA(a);
		this.setPrice(price);
		this.setPeriod(period);
	}

	
	
	
	
	void setA(String a){
		switch(a){
		
		case "SK":
		case "KT":
		case "LG":
			
			this.a=a;
		}
		}
	void setPrice(int price) {
		if(price>0) {
			
			this.price=price;
		}	
	}
	
	void setPeriod(int period) {
		if(period==0||period==24||period==36) {
				this.period=period;
			}
		}
		
	void show() {
		System.out.println("이름 "+this.name);
		System.out.println("통신사 "+this.a);
		
		if(this.period==0) {//약정이 없다면
			int discount=this.price*5/100;
			int result = this.price - discount;
		
			System.out.println("판매가: "+result+"원");
			System.out.println("(원가"+this.price+"원)");
			
		}
		else {//약정이 있다면
			int periodPrice = this.price/this.period;
			System.out.println("판매가: "+this.price+"원");
			System.out.println("(월"+periodPrice+"원)");
			
		}
		
		if(this.period==0) {
			
			System.out.println("약정 없음");
		}
		
		if(this.period==0)
				{
		System.out.println("가격 "+this.price);
		System.out.println("약정개월 "+ this.period);
		System.out.println();
		
	}
		
		
		
		
	}
}


