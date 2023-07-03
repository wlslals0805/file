package oop.getter2;

public class Score {
	//멤버 필드
		String name;
		int level;
		int korean, english, math;
		
		//멤버 메소드
		void setName(String name) {
			this.name = name;
		}
		void setLevel(int level) {
			if(level >= 1 && level <= 6) {
				this.level = level;
			}
		}
		void setKorean(int korean) {
			if(korean >= 0 && korean <= 100) {
				this.korean = korean;
			}
		}
		void setEnglish(int english) {
			if(english < 0 || english > 100) return;
			this.english = english;
		}
		void setMath(int math) {
			if(!(math >= 0 && math <= 100)) return;
			this.math = math;
		}
		
		String getName() {
			return this.name;
		}
		int getLevel() {
			return this.level;
		}
		int getKorean() {
			return this.korean;
		}
		int getEnglish() {
			return this.english;
		}
		int getMath() {
			return this.math;
		}
		
		int getTotal() {
			//return this.korean + this.english + this.math;
			return this.getKorean() + this.getEnglish() + this.getMath();
		}
		double getAverage() {
			//return this.getTotal() / 3d;
			//return this.getTotal() / 3.0;
			return (double)this.getTotal() / 3;
		}
		String getGrade() {
			double average = this.getAverage();
			if(average >= 90) 
				return "A";
			else if(average >= 80) 
				return "B";
			else if(average >= 70)
				return "C";
			else 
				return "F";
		}
		
		void setup(String name, int level, int korean, int english, int math) {
			this.setName(name);
			this.setLevel(level);
			this.setKorean(korean);
			this.setEnglish(english);
			this.setMath(math);
		}
		void show() {
			System.out.println("<학생 성적 정보>");
			System.out.println("이름 : " + this.name);
//			System.out.println("이름 : " + this.getName());
			System.out.println("학년 : " + this.level);
			System.out.println("국어 : " + this.korean);
			System.out.println("영어 : " + this.english);
			System.out.println("수학 : " + this.math);
			System.out.println("총점 : " + this.getTotal());
			System.out.println("평균 : " + this.getAverage());
			System.out.println("등급 : " + this.getGrade());
		}
}
