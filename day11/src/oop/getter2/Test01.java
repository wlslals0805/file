package oop.getter2;

public class Test01 {

	public static void main(String[] args) {
//		학생 성적 정보
//		평균의 소수점 자리수는 신경쓰지 마세요
	//
//		이름		학년		국어점수		영어점수		수학점수
//		마리오	1			90			80			70
//		루이지	1			85				85				83
//		쿠파		3			70				60			55
		
		Student a = new Student();
		Student b = new Student();
		Student c = new Student();
		
		
		a.setup("마리오", 1, 90, 80, 70);
		b.setup("루이지", 1, 85, 85, 83);
		c.setup("쿠파", 3, 70, 60, 55);
		
		a.show();
		b.show();
		c.show();
		
	}

}
