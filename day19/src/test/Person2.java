package test;

public class Person2 {

		private String name;

		private int age;

		private String job;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			
			if(name.matches("^[가-힣]{1,2}[가-힣]{1,5}$")) {
			
			this.name = name;}
		}

		public int getAge() {
			return age;
		}
		
		public String getType() {
			
			if(age>=20) {
				return " 성인";
			}
			else if(age>=14) {
				return " 청소년";
			}
			else if(age>=8) {
				return " 어린이";
			}
			else {return " 유아";}
			
		}

		public void setAge(int age) {
			if(age>=1) {
			
			this.age = age;
			
			}
		}

		public String getJob() {
			return job;
		}

		public void setJob(String job) {
			if(job.matches("^[가-힣a-zA-Z0-9]{1,}$")) {
			this.job = job;}
		}

		public Person2(String name, int age, String job) {
			this.setName(name);
			this.setAge(age);
			this.setJob(job);
		}
		
		public Person2(String name,int age) {
			this.setName(name);
			this.setAge(age);
			this.setJob("무직");	//원래는 this.job="무직" 으로 해놨었는데 감점 당함. 
											//	입력받는 곳은 무조건 setter 메소드로 설정해놓는 게 좋다. setter 메소드에서 잘못된 입력을 걸러주기 때문. 
											//this.job=job은 입력하는 모든 값을 job으로 넣어준다.  한마디로 거르지 않고 잘못된 입력도 승인해준다는 것. setter 메소드를 사용하는 의미가 없어진다.
											//강사님이 말씀하신 "무직"이 setter 메소드의 조건을 통과한다는 뜻의 의미를 알겠다.
											//setter 메소드의 this.job=job에서 job 자리에 "무직"이 들어가는 거고 입력된 값(무직)이 setter 메소드 필터링에 통과됐으니까 this.job에는 무직이 들어간다. 
											//그렇게 들어간 입력값은 show메소드가 호출되었을 때 this.job으로서 출력된다 
											//그니까 생성자에서 입력값을 받는 게 첫 스타트. 스타트가 끊어지면 입력값은 클래스 안에서 물흐르듯이 이동한다. 생성자->(this.set멤버필드 속으로 들어감)->setter메소드->setter 메소드 검사 통과->this.멤버필드 속으로 들어감->show에서 this.멤버필드로 출력. 이런 식으로.
		}
		
		void show() {
			
			System.out.println(this.name);
			System.out.println(this.age+this.getType());
			System.out.println(this.job);
			
		}


		

}
