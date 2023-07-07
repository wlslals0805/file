package api.lang.String2;

public class Test06 {

	public static void main(String[] args) {
		//반드시 1개를 포함해야 되는 경우에 대한 검사
		
		String password = "KHuser1234@";

//		String regex = "^[A-Za-z0-9!@#$]{8,16}$";
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,16}$";

		System.out.println(password.matches(regex));

		
		
//		^(?=.*(아무글자나 상관없으니까 뒤에 알파벳이 1개 있어야 해))[A-Za-z0-9!@#$]{8,16}$
		
		
		
		
	}

}
