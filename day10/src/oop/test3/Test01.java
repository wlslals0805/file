package oop.test3;

public class Test01 {

	public static void main(String[] args) {
		
//		다음 데이터를 클래스를 만든 뒤 객체로 생성하도록 구현하세요
		//
//			생성 후 정보를 대입하고 출력 구문을 사용하여 화면에 출력하세요
		//
//			2022 월드컵 득점 순위
//			순위	이름	국가	골
//			1	킬리안 음바페	프랑스	8
//			2	리오넬 메시	아르헨티나	7
//			3	올리비에 지루	프랑스	4
//			4	훌리안 알바레스	아르헨티나	4
		
		worldCup p1=new worldCup();
		worldCup p2=new worldCup();
		worldCup p3=new worldCup();
		worldCup p4=new worldCup();
		
		p1.number=1;
		p1.name="킬리안 음바페";
		p1.n="프랑스";
		p1.goal=8;
		
		p2.number=2;
		p2.name="리오넬 메시";
		p2.n="아르헨티나";
		p2.goal=7;
		
		p3.number=3;
		p3.name="올리비에 지루";
		p3.n="프랑스";
		p3.goal=4;
		
		p4.number=1;
		p4.name="훌리안 알바레스";
		p4.n="아르헨티나";
		p4.goal=4;
		
		System.out.println(p1.number);
		System.out.println(p1.name);
		System.out.println(p1.n);
		System.out.println(p1.goal);
		System.out.println();
		System.out.println(p2.number);
		System.out.println(p2.name);
		System.out.println(p2.n);
		System.out.println(p2.goal);
		System.out.println();
		System.out.println(p3.number);
		System.out.println(p3.name);
		System.out.println(p3.n);
		System.out.println(p3.goal);
		System.out.println();
		System.out.println(p4.number);
		System.out.println(p4.name);
		System.out.println(p4.n);
		System.out.println(p4.goal);
		
	}

}
