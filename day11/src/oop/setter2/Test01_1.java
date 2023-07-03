package oop.setter2;

public class Test01_1 {

	public static void main(String[] args) {
		Subject s1 = new Subject();
		Subject s2 = new Subject();
		Subject s3 = new Subject();
		
		s1.setup("자바 마스터과정", 90, 1000000, "온라인");
		s2.setup("파이썬 기초", 60, 600000, "온라인");
		s3.setup("웹 개발자 단기완성", 120, 120000, "오프라인");
		
		s1.show();
		s2.show();
		s3.show();
	}

}
