package api.file.object;

import java.io.Serializable;

public class Player implements Serializable {

//		Player라는 클래스를 만들고 아이디, 레벨, 소지금 정보를 저장할 수 있도록 구성
//
//		프로그램을 시작하면 sample/player.kh 파일을 찾아서 다음과 같이 처리하세요
//
//		파일이 없다면 최초 실행한 것으로 간주하고 사용자에게 아이디를 입력받아 레벨 1, 소지금 0으로 생성
//		사용자에게 다음과 같은 메뉴를 반복적으로 출력
//		입력(1-정보출력/2-레벨업/3-종료) :
//		1을 입력하면 현재 플레이어의 정보를 화면에 출력
//		2를 입력하면 현재 플레이어의 레벨을 1 증가 처리
//		3을 입력하면 현재 플레이어의 정보를 sample/player.kh 파일에 저장하고 종료
		
		
		
	String name;
	int level;
	int gold;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player(String name) {
		this.setName(name);
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
	void levelUp() {
		
		this.level++;
		
	}

	public Player(String name, int level, int gold) {
		this.setName(name);
		this.setLevel(1);
		this.setGold(0);
	}
	
	void show(){
		System.out.println();
		System.out.println("플레이어 정보 출력");
		System.out.println("아이디: "+ this.name);
		System.out.println("레벨: " + this.level);
		System.out.println("소지금: " + this.gold);
		
	}

	
	
	
		
		
		
		
		
		
		

}
