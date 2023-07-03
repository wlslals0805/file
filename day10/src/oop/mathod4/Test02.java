package oop.mathod4;

public class Test02 {

	public static void main(String[] args) {
//		| 이름 | 분류 | 가격 | 행사여부 | 
//		| :---: | :---: | :---: | :---: |
//		| 아메리카노 | 음료 | 2500 | 행사중 | 
//		| 모카라떼 | 음료 | 3500 | - | 
//		| 치즈케이크 | 디저트 | 5000 | 행사중 |
//		| 마카롱 | 디저트 | 3000 | - |
	//
		Menu_1 p1=new Menu_1();
		Menu_1 p2=new Menu_1();
		Menu_1 p3=new Menu_1();
		Menu_1 p4=new Menu_1();
		
		p1.setup("아메리카노", "음료", 2500, true);
		p2.setup("모카라떼", "음료", 3500, false);
		p3.setup("치즈케이크", "디저트", 5000, true);
		p4.setup("마카롱", "디저트", 3000, false);
		
		p1.show();
		p2.show();
		p3.show();
		p4.show();
		
		
	}

}
