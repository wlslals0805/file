package oop.inherit8;

//전사(Warrior) 클래스 구현
//아이디, 레벨 정보를 가질 수 있다
//생성 시 반드시 아이디가 필요하며, 레벨은 1로 설정된다
//공격 기능이 있어야 한다(전사가 칼로 공격합니다! 출력)
//이동 기능이 있어야 한다(전사가 뛰어서 이동합니다! 출력)
//상점 기능이 있어야 한다(전사가 상점을 개설합니다! 출력)
//정보 출력 기능이 있어야 한다(아이디와 레벨을 출력)

//마법사(Magician) 클래스 구현
//아이디, 레벨 정보를 가질 수 있다
//생성 시 반드시 아이디가 필요하며, 레벨은 1로 설정된다
//공격 기능이 있어야 한다(마법사가 마법으로 공격합니다! 출력)
//이동 기능이 있어야 한다(마법사가 텔레포트로 이동합니다! 출력)
//상점 기능이 있어야 한다(마법사가 상점을 개설합니다! 출력)
//정보 출력 기능이 있어야 한다(아이디와 레벨을 출력)

//궁수(Archer) 클래스 구현
//아이디, 레벨 정보를 가질 수 있다
//생성 시 반드시 아이디가 필요하며, 레벨은 1로 설정된다
//공격 기능이 있어야 한다(궁수가 활로 공격합니다! 출력)
//이동 기능이 있어야 한다(궁수가 숨어서 이동합니다! 출력)
//상점 기능이 있어야 한다(궁수가 상점을 개설합니다! 출력)
//정보 출력 기능이 있어야 한다(아이디와 레벨을 출력)

//캐릭터 생성 후 정보 출력

public abstract class Character {
	
	private String id; 
	private int level;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(1>level) return;
		this.level = level;
	} 
	

	Character(String id){
		this.setId(id);
		this.setLevel(1);
	}
	
	public abstract void attack();
	public abstract void move();
	public abstract void shop();
	
	public final void show() {
		System.out.println("아이디: "+this.id);
		System.out.println("레벨: "+this.level);
		
	}
	
	
	

}
