package api.lang.String2;

public class Test04 {

	public static void main(String[] args) {
//		네이버 회원가입 양식을 토대로 아이디 검사를 구현
//
//		* 5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다.
//		* 반드시 영문 소문자로 시작해야 합니다.
		
		String id = "dD1ff66f---d";
		
		String regex = "^[a-z][a-zA-Z0-9\\_-]{4,19}$";
		
		boolean ID=id.matches(regex);
		
		
		
		if(ID) {
			System.out.println(id+"는 사용가능한 아이디입니다");
		}
		else {System.out.println("다시 설정하세요");}
	
	}

}
