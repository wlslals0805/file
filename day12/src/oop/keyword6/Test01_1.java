package oop.keyword6;

public class Test01_1 {

	public static void main(String[] args) {
		Member a = new Member("adminuser", "adminuser1234", "관리자");
		Member b = new Member("student", "student1234", "수강생");
		Member c = new Member("manager", "manager1234", "매니저");
		
		a.show();
		b.show();
		c.show();
	}

}
