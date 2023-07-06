package oop.poly1;

public class MacBook extends Notebook{

	@Override
	public void power() {
		System.out.println("맥북 전원 ON");
	}

	@Override
	public void video() {
		System.out.println("맥북으로 동영상을 재생합니다.");
		
	}

}
