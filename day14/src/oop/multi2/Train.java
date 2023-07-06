package oop.multi2;

public class Train implements R,T{

	@Override
	public void Transportation() {
		System.out.println("기차가 이동합니다.");
	}

	@Override
	public void Reserve() {
		System.out.println("기차를 예약합니다.");
		
	}

}
