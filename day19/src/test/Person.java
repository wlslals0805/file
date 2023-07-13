package test;

public class Person {

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

		public void setAge(int age) {
			if(age>=1) {
			
			this.age = age;}
		}

		public String getJob() {
			return job;
		}

		public void setJob(String job) {
			if(job.matches("^[가-힣a-zA-Z0-9]{1,}$")) {
			this.job = job;}
		}

		public Person(String name, int age, String job) {
			this.setName(name);
			this.setAge(age);
			this.setJob(job);
		}
		
		public Person(String name,int age) {
			this.setName(name);
			this.setAge(age);
			this.job="무직";
		
		}
		
		void show() {
			
			System.out.println(this.name);
			System.out.println(this.age);
			if(age>=20) {
				System.out.println("성인");
			}
			else if(age>=14) {
				System.out.println("청소년");
			}
			else if(age>=8) {
				System.out.println("어린이");
			}
			else {System.out.println("유아");}
			
			
			System.out.println(this.job);
			
		}


		

}
