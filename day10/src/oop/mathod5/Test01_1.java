package oop.mathod5;

public class Test01_1 {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		p1.setup("참이슬후레시", "주류", 1200, true, false);
		p2.setup("클라우드맥주", "주류", 3000, false, true);
		p3.setup("바나나킥", "과자", 1500, false, true);
		p4.setup("허니버터칩", "과자", 2000, true, false);
		
		p1.show();
		p2.show();
		p3.show();
		p4.show();
	}

}
