package oop.inherit8;
//궁수(Archer) 클래스 구현
//아이디, 레벨 정보를 가질 수 있다
//생성 시 반드시 아이디가 필요하며, 레벨은 1로 설정된다
//공격 기능이 있어야 한다(궁수가 활로 공격합니다! 출력)
//이동 기능이 있어야 한다(궁수가 숨어서 이동합니다! 출력)
//상점 기능이 있어야 한다(궁수가 상점을 개설합니다! 출력)
//정보 출력 기능이 있어야 한다(아이디와 레벨을 출력)
public class Archer extends Character{


	
	
	Archer(String id) {
		super(id);
	}

	@Override
	public void attack() {
		System.out.println("궁수가 활로 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("궁수가 숨어서 이동합니다!");
	}

	@Override
	public void shop() {
		System.out.println("궁수가 상점을 개설합니다.");
	}

}
