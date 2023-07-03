package oop.setter3;

public class Test01 {

	public static void main(String[] args) {
//		휴대폰 판매 정보
//		이름			통신사			가격			약정개월
//		갤럭시23s	SK					180만원		설정하지 않음
//		갤럭시23s	KT					175만원		24개월
//		아이폰14		LG					200만원		30개월
//		아이폰14		SK					199만원		설정하지 않음
		
		Phone p1=new Phone();
		Phone p2=new Phone();
		Phone p3=new Phone();
		Phone p4=new Phone();
		
		p1.setup("갤럭시23s", "SK", 1800000, 0);
		p2.setup("갤럭시23s", "KT", 1750000, 24);
		p3.setup("아이폰14", "LG", 2000000, 36);
		p4.setup("아이폰14", "SK", 1990000, 0);
		
		p1.show();
		p2.show();
		p3.show();
		p4.show();
	}

}
