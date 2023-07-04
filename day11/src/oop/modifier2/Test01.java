package oop.modifier2;

public class Test01 {

//		예금주이름	총납입기간	현재납입회차	월납입금액	총잔액
//		유재석		3년		15회차	100만원	1500만원
//		강호동		2년		5회차		50만원	250만원
//		신동엽		2년		8회차		80만원	1000만원
		public static void main(String[] args) {
			Member a=new Member("유재석", 3, 15, 1000000, 15000000);
			Member b=new Member("강호동", 2, 5, 500000, 2500000);
			Member c=new Member("신동엽", 2, 8, 800000, 10000000);
			
			
			
			a.show();
			b.show();
			c.show();
			
			
			
	}

}
