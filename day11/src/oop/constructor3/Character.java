package oop.constructor3;

public class Character {
//	캐릭터 정보
	
//	아이디					직업				레벨
//	헤라클래스				전사				50
//	포세이돈					마법사			20
//	아프로디테				마법사			1
	
//	요구사항
//	아이디와 직업은 반드시 설정되도록 구현하세요
//	레벨을 설정하지 않으면 자동으로 1로 설정되게 구현하세요
//	레벨은 1 이상만 설정 가능합니다
//	직업은 전사, 마법사, 궁수 중에서만 설정 가능합니다
	
	String id;
	String job;
	int level;
	
//	void setId(String id) {
//		if(id!=null) {
//			this.id=id;
//		}}
//		
//		void setJob(String job) {
//			switch(job){
//			case "전사":
//			case "마법사":
//			case "궁수":
//				this.job=job;
//		}}
//		void setLevel(int level) {
//			if(level==0) {
//				this.level=1;
//			}
//			if(level>=1) {
//				this.level=level;
//			}}
//			
//		void setup(String id,String job,int level) {
//			this.id=id;
//			this.job=job;
//			this.level=level;
//			
//		}
			
		
	
	
	
	
	Character(String id,String job,int level){
		
		this.id=id;
		if(id==null) {
			return;
		}
//		this.job=job;
		switch(job){
		case "전사":
		case "마법사":
		case "궁수":
			this.job=job;
		}
		
//		this.level=level;	
		if(level==0) {
			this.level=1;
		}
		if(level>=1) {
			this.level=level;
		}
	}
	
	void show() {
		
		System.out.println(this.id);
		System.out.println(this.job);
		System.out.println(this.level);
		System.out.println();
	}
	
	
	
	

}
