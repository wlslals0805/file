package oop.mathod4;

public class Test01_1 {

	public static void main(String[] args) {
		Menu a = new Menu();
		Menu b = new Menu();
		Menu c = new Menu();
		Menu d = new Menu();
		
		a.setup("아메리카노", "음료", 2500, true);
		b.setup("모카라떼", "음료", 3500, false);
		c.setup("치즈케이크", "디저트", 5000, true);
		d.setup("마카롱", "디저트", 3000, false);
			
		a.show();
		b.show();
		c.show();
		d.show();
	}

}
