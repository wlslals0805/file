package oop.setter2;

public class Lecture {
//	학원 강의 요금표
//
//	강좌명					강의시간		수강료		구분
//	자바 마스터과정		90			1000000	온라인
//	파이썬 기초	60		600000					온라인
//	웹 개발자 단기완성	120			1200000	오프라인
	
//	요구사항
//	강좌명은 별도의 조건이 없습니다
//	강의시간은 30시간 단위로만 구성할 수 있습니다
//	수강료는 음수가 될 수 없습니다
//	구분은 온라인과 오프라인, 혼합 셋 중 하나로 설정할 수 있습니다
	
	String name,type;
	int time,price;
	
	void setup(String name,int time, int price,String type) {
		
		this.name=name;
		this.setTime(time);
		this.setPrice(price);
		this.setType(type);
	}
		
		void show() {
			
			System.out.println("강좌명: "+this.name);
			System.out.println("강의 시간: "+this.time);
			System.out.println("수강료 "+this.price);
			System.out.println("구분: "+this.type);
			System.out.println();
		}
		
		
		void setType(String type) {
			switch(type) {
			case "온라인":
			case "오프라인":
			case "혼합":
				this.type=type;
			}
		}
			void setTime(int time) {
				if(time%30==0&&time>0) {
					this.time=time;
				}
			}
			
			void setPrice(int price) {
				if(price>=0) {
					this.price=price;
				}
			
		
		
	}
	
	
	
}
