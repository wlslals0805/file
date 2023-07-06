package oop.multi2;

public class AirPlane implements F,T,R {

	@Override
	public void Reserve() {
		System.out.println("비행기를 예약합니다");
	}

	@Override
	public void Transportation() {
		System.out.println("비행기가 이동합니다");
		
	}

	@Override
	public void Flyable() {
		System.out.println("비행기가 날아갑니다");
		
	}

	
	

}
