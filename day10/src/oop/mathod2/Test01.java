package oop.mathod2;

public class Test01 {

	public static void main(String[] args) {
		
		
//		| 이름 | 종목 | 구분 | 금메달 | 은메달 | 동메달 |
//		| :---: | :---: | :---: | :---: | :---: | :---: |
//		| 진종오 | 사격 | 하계 | 4 | 2 | 0 |
//		| 김수녕 | 양궁 | 하계 | 4 | 1 | 1 |
//		| 전이경 | 쇼트트랙 | 동계 | 4 | 0 | 1 | 
		
		
		KoreanPlayer p1=new KoreanPlayer();
		KoreanPlayer p2=new KoreanPlayer();
		KoreanPlayer p3=new KoreanPlayer();

		
		p1.setup("진종오", "사격", "하계", 4, 2, 0);
		p2.setup("김수녕", "양궁", "하계", 4, 1, 1);
		p3.setup("전이경", "쇼트트랙", "동계", 4, 0, 1);
		
		p1.show();
		p2.show();
		p3.show();

		
		
		
		
	}

}
