package oop.setter2;

public class Test01 {

//	강좌명					강의시간		수강료		구분
//	자바 마스터과정		90			1000000	온라인
//	파이썬 기초				60		    600000	온라인
//	웹 개발자 단기완성	120			1200000	오프라인
	
	
	public static void main(String[] args) {
		Lecture a=new Lecture();
		Lecture b=new Lecture();
		Lecture c=new Lecture();
		
		
		a.setup("자바 마스터 과정", 85, -1000000, "온오프라인");
		
		a.show();
		
		b.setup("파이썬 기초",60 , 600000, "온라인");
		c.setup("웹 개발자 단기 완성",120 , 1200000, "오프라인");
		
		b.show();
		c.show();
	}

}
