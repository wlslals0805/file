package oop.getter2;

public class Test01_1 {

	public static void main(String[] args) {
		Score s1 = new Score();
		Score s2 = new Score();
		Score s3 = new Score();
	
		s1.setup("마리오", 1, 90, 80, 70);
		s2.setup("루이지", 1, 85, 85, 83);
		s3.setup("쿠파", 3, 70, 60, 55);
		
		s1.show();
		s2.show();
		s3.show();
	}

}
