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
			this.setJob("무직");
		}
		
		void show() {
			
			System.out.println(this.name);
			System.out.println(this.age+this.getType());
			System.out.println(this.job);
			
		}


		

}
