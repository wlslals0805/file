package oop.getter2;

public class Student {
//	학생 성적 정보
//	평균의 소수점 자리수는 신경쓰지 마세요
//
//	이름		학년		국어점수		영어점수		수학점수
//	마리오	1			90			80			70
//	루이지	1			85				85				83
//	쿠파		3			70				60			55
	
//	요구 사항
//	각 점수는 0점 이상 100점 이하일 경우에만 설정하도록 필터링 처리
//	정보 출력시 반드시 총점, 평균, 등급이 나오도록 구현
//	등급은 다음과 같이 계산합니다
//	90점 이상 100점 이하 : A
//	80점 이상 89점 이하 : B
//	70점 이상 79점 이하 : C
//	70점 미만 : F
	
	String name;
	int g;
	int korean;
	int english;
	int math;
	
	void setup(String name, int g,int korean,int english,int math) {
		
		setName(name);
		setG(g);
		setKorean(korean);
		setEnglish(english);
		setMath(math);
		
		
	}
	void setName(String name) {
		this.name=name;
	}
	
	void setG(int g) {
		
		this.g=g;
	}
	
	void setKorean(int korean) {
		if(korean>=0&&korean<=100) {
		this.korean=korean;}
	}
	
	void setEnglish(int english) {
		if(english>=0&&english<=100)
		
		this.english=english;
	}
	
	void setMath(int math) {
		if(math>=0&&math<=100)
		this.math = math;	
	}
	
	
	int getTotal() {
		return this.korean+this.english+this.math;	
	}
	float getAverage() {
		
		return getTotal()/3f;
	}
	
	String getGrade() {
		double average = this.getAverage();
		if(average>=90) {
			
			return "A";
			
		}
		else if(average>=80) {
			return "B";
		}
		else if(average>=70) {
			return "C";
		}
		else {
			return "F";}
			
		}
		
	
	
//	90점 이상 100점 이하 : A
//	80점 이상 89점 이하 : B
//	70점 이상 79점 이하 : C
//	70점 미만 : F
	
	void show() {
		
		System.out.println("이름: "+this.name);
		System.out.println("학년: "+this.g);
		System.out.println("국어점수: "+this.korean);
//		if(korean>=90&&korean<=100) {
//			System.out.println("등급: A");
//		}
//		else if(80<=korean) {System.out.println("등급 B");}
//		else if(70<=korean) {System.out.println("등급 C");}
//		else if(70>korean) {System.out.println("등급 F");}
		System.out.println("영어점수: "+this.english);
//		if(english>=90&&english<=100) {
//			System.out.println("등급: A");
//		}
//		else if(80<=english) {System.out.println("등급 B");}
//		else if(70<=english) {System.out.println("등급 C");}
//		else if(70>english) {System.out.println("등급 F");}
		System.out.println("수학점수: "+this.math);
//		if(math>=90&&math<=100) {
//			System.out.println("등급: A");
//		}
//		else if(80<=math) {System.out.println("등급 B");}
//		else if(70<=math) {System.out.println("등급 C");}
//		else if(70>math) {System.out.println("등급 F");}
		System.out.println("총점: "+getTotal());
		System.out.println("평균: "+getAverage());
		System.out.println("등급: "+getGrade());
		System.out.println();
	}
	
	
	

		}
