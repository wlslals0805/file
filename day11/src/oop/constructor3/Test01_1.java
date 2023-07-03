package oop.constructor3;

public class Test01_1 {

	public static void main(String[] args) {
		Player p1 = new Player("헤라클래스", "전사", 50);
		Player p2 = new Player("포세이돈", "마법사", 20);
		Player p3 = new Player("아프로디테", "마법사");
		
		p1.show();
		p2.show();
		p3.show();
	}

}
