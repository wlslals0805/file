package oop.keyword6;

public class User {
//	다음 요구사항에 맞도록 클래스를 구성하고 정보를 출력하시오
//
//	회원 정보
//	아이디			비밀번호				닉네임
//	adminuser		admin1234			관리자
//	student			student1234		수강생
//	manager		manager1234		매니저
	
//	요구사항
//	아이디는 최초 1회 설정 후 절대로 변경할 수 없습니다.
//	비밀번호는 출력 시 최초 2글자 출력 후 마스킹 처리 합니다.
//	마스킹은 * 10개를 뒤에 붙여서 출력하면 됩니다
//	추가 요구사항
//	사용자에게 정보를 입력받아서 회원 객체를 생성하도록 구현해보세요
	
	
	private final String id;
	private String number;
	private String name;
	
	User(String id,String number, String name){
		
		this.id=id;
		this.number=number;
		this.name=name;	
	}

	public void setNumber(String number) {
	
		this.number = number;
	}

		public void show() {
			
			System.out.println(this.id);
			System.out.println(this.number);
			System.out.println(this.name);
			System.out.println();
		}


}
