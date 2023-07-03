package oop.constructor3;

public class Player {
	
	//멤버 필드
		String id;
		String job;
		int level;
		
		//멤버 메소드
		void setId(String id) {
			this.id = id;
		}
		void setJob(String job) {
			switch(job) {
			case "전사":
			case "마법사":
			case "궁수":
				this.job = job;
			}
		}
		void setLevel(int level) {
			if(level < 1) return;
			this.level = level;
		}
		String getId() {
			return id;
		}
		String getJob() {
			return job;
		}
		int getLevel() {
			return level;
		}
		
		void show() {
			System.out.println("<캐릭터 정보>");
			System.out.println("아이디 : " + this.id);
			System.out.println("직업 : " + this.job);
			System.out.println("레벨 : " + this.level);
		}
		
		//생성자 - 생성 시 필요한 데이터를 강제하는 도구
		Player(String id, String job) {
			this(id, job, 1);
		}
		Player(String id, String job, int level) {
			this.setId(id);
			this.setJob(job);
			this.setLevel(level);
		}

}
