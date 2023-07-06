package oop.inherit8_2;

//두 개의 캐릭터로 서로 간의 상호작용을 하도록 처리하는 클래스
//-ex : 거래 / 전투 /...
public class Interaction {
	
	//전투 기능
	public static void battle(Player a,Player b) //Player 클래스를 상속받는 객체들이 들어올 수 있음 
	{
		
		a.attack();
		b.attack();
		
	}
	

}
