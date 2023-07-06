package oop.multi2;

public class KickBoard implements T,E{

	@Override
	public void Electronic() {
		System.out.println("전동킥보드의 전원을 끕니다/켭니다");
	}

	@Override
	public void Transportation() {
		System.out.println("전동킥보드가 이동합니다.");
	}

}
