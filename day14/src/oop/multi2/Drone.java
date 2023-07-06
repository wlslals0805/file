package oop.multi2;

public class Drone implements E,T,F{

	@Override
	public void Flyable() {
		System.out.println("드론이 날아갑니다.");
	}

	@Override
	public void Transportation() {
		System.out.println("드론이 이동합니다.");
		
	}

	@Override
	public void Electronic() {
		System.out.println("드론의 전원을 끕니다/켭니다");
	}
	
	
	

}
