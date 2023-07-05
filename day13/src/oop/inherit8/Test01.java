package oop.inherit8;

public class Test01 {

	public static void main(String[] args) {
		Warrior w = new Warrior("qwer1234");
		Magician m =new Magician("asdf1234");
		Archer a=new Archer("zxcv1234");
		
		w.attack();
		w.move();
		w.shop();
		w.show();
		
		System.out.println();
		
		m.attack();
		m.move();
		m.shop();
		m.show();
		
		System.out.println();
		
		a.attack();
		a.move();
		a.shop();
		a.show();
	}

}
