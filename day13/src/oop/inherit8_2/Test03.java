package oop.inherit8_2;

public class Test03 {

	public static void main(String[] args) {
		
		//객체를 업캐스팅하여 생성
				// =상속관계에서 특정 클래스로 대충 묶어서 표현하고 싶을 때 
		
		Player a = new Warrior("테스터1");
//		Player a = new Magician("테스터1");
//		Player a = new Archer("테스터1");
		
//		Player b = new Warrior("테스터2");
		Player b = new Magician("테스터2");
//		Player b = new Archer("테스터2");

		Interaction.battle(a, b);
	}

}
