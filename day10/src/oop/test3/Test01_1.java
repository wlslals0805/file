package oop.test3;

public class Test01_1 {

	public static void main(String[] args) {
		//생성
				Player p1 = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				Player p4 = new Player();

				//초기화
				p1.rank = 1;
				p1.name = "킬리안 음바페";
				p1.nation = "프랑스";
				p1.goal = 8;

				p2.rank = 2;
				p2.name = "리오넬 메시";
				p2.nation = "아르헨티나";
				p2.goal = 7;

				p3.rank = 3;
				p3.name = "올리비에 지루";
				p3.nation = "프랑스";
				p3.goal = 4;

				p4.rank = 4;
				p4.name = "훌리안 알바레스";
				p4.nation = "아르헨티나";
				p4.goal = 4;

				//출력
				System.out.println("순위 : "+ p1.rank);
				System.out.println("이름 : " + p1.name);
				System.out.println("국가 : " + p1.nation);
				System.out.println("골 수 : " + p1.goal);

				System.out.println("순위 : "+ p2.rank);
				System.out.println("이름 : " + p2.name);
				System.out.println("국가 : " + p2.nation);
				System.out.println("골 수 : " + p2.goal);

				System.out.println("순위 : "+ p3.rank);
				System.out.println("이름 : " + p3.name);
				System.out.println("국가 : " + p3.nation);
				System.out.println("골 수 : " + p3.goal);

				System.out.println("순위 : "+ p4.rank);
				System.out.println("이름 : " + p4.name);
				System.out.println("국가 : " + p4.nation);
				System.out.println("골 수 : " + p4.goal);
	
	}

}
