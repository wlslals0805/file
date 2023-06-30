package oop.mathod6;

public class Test01 {

	public static void main(String[] args) {
		
//		학생 성적 정보
//		학년	반	이름	국어	영어	수학
//		1	1	마리오	50	 	60	50
//		1	1	루이지	60	90	50
//		1	2	쿠파		70		70		80
//		1	2	요시		80	85		35
		
		
		Study p1=new Study();
		Study p2=new Study();
		Study p3=new Study();
		Study p4=new Study();
		Study p5=new Study();
		Study p6=new Study();
		
		p1.setup(1,1,"마리오",50,60,50);
		p2.setup(1,1,"루이지",60,90,50);
		p3.setup(1,2,"쿠파",70,70,80);
		p4.setup(1,2,"요시",80,85,35);

	
	
	p1.show();
	p2.show();
	p3.show();
	p4.show();
	}
}
