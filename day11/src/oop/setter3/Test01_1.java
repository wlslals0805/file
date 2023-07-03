package oop.setter3;

public class Test01_1 {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		Mobile m3 = new Mobile();
		Mobile m4 = new Mobile();
		
		m1.setup("갤럭시 23s", "SK", 1800000, 0);
		m2.setup("갤럭시 23s", "KT", 1750000, 24);
		m3.setup("아이폰 14", "LG", 2000000, 30);
		m4.setup("아이폰14", "SK", 1990000, 0);
		
		m1.show();
		m2.show();
		m3.show();
		m4.show();
	}

}
