package oop.keyword6;

public class Test01 {
//	회원 정보
//	아이디			비밀번호				닉네임
//	adminuser		admin1234			관리자
//	student			student1234		수강생
//	manager		manager1234		매니저
	public static void main(String[] args) {
		User a=new User("아이디: "+"adminuser","비밀번호: "+"admin1234","닉네임: "+ "관리자");
		User b=new User("아이디: "+"student","비밀번호: "+"student1234","닉네임: "+ "수강생");
		User c=new User("아이디: "+"manager","비밀번호: "+"manager1234","닉네임: "+ "매니저");
		

		
		a.show();
		b.show();
		c.show();
	}

}
