package oop.mathod1;

//클래스
public class Player {
	//멤버 필드(멤버 변수)-데이터를 저장하는 게 목적
	int rank; //순위
	String name;//이름
	String nation;//국가
	int goal;//골 수
	
	//멤버 메소드 - 공통코드
	//void 이름(){코드}
	
	//초기화용
	//-설정될 값을 알 수 없으므로 외부에서 조달받아서 초기화
	//-매개변수
		void setup(int rank,String name,String nation,int goal) {
			this.rank = rank;
			this.name = name;
			this.nation = nation;
			this.goal = goal;
			
	}
	
	
	
	
	//출력용
	void show() {
		//this=클래스의 멤버를 의미(내 꺼)
		System.out.println();
		System.out.println("순위 : "+ this.rank);
		System.out.println("이름 : " + this.name);
		System.out.println("국가 : " + this.nation);
		System.out.println("골 수 : " + this.goal);
	}
	
	
}
