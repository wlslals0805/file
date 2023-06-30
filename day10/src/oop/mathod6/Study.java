package oop.mathod6;

public class Study {

//	학생 성적 정보
//	학년	반	이름	국어	영어	수학
//	1	1	마리오	50	 	60	50
//	1	1	루이지	60	90	50
//	1	2	쿠파		70		70		80
//	1	2	요시		80	85		35
//	요구사항
//
//	출력 시 총점과 평균이 같이 출력되도록 구현하세요
//	통과/재평가 여부를 판정하여 출력하세요
//	통과의 기준은 각 과목 40점 이상, 평균 60점 이상입니다
	
	int a,b;
	String c;
	int d,e,f;
	
	void setup(int a,int b,String c,int d,int e,int f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	void show() {
		
		System.out.print(a+"학년 ");
		System.out.print(b+"반 ");
		System.out.println(c);
		System.out.print("국어점수: "+d+"점 ");
		if(d>=40) {
			System.out.println("통과");
		}
		else {System.out.println("재평가");}
		System.out.print("영어점수: "+e+"점 ");
		if(e>=40) {
			System.out.println("통과");
		}
		else {System.out.println("재평가");}
		System.out.print("수학점수: "+f+"점 ");
		if(f>=40) {
			System.out.println("통과");
		}
		else {System.out.println("재평가");
		}
		int h=d+e+f;
		float g=h/(float)3;
		System.out.println("총점: "+h+"점");
		System.out.println("평균: "+g);
		if(g>=60) {
			System.out.println("통과");
		}
		else {System.out.println("재평가");
		}
		
		System.out.println();
		
	}
	
}
