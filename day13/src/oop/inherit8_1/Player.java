package oop.inherit8_1;

//추상클래스가 되면 (1) 객체 생성 금지 (2) 추상 메소드 작성 가능
public abstract class Player {
	//공통 필드
	private String id;
	private int level;
	
	//setter & getter
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
		if(level < 1) return;
		this.level = level;
	}
	
	//생성자 - 오직 아이디만 설정
	public Player(String id) {
		this.setId(id);
		this.setLevel(1);
	}
	
	//공통 메소드
	public abstract void attack();
	public abstract void move();
	public abstract void store();
	public final void show() {
		System.out.println("<캐릭터 정보>");
		System.out.println("아이디 : " + this.id);
		System.out.println("레벨 : " + this.level);
	}
}
