package api.lang.String2;

import java.util.regex.Pattern;

public class Test02 {

	public static void main(String[] args) {
		
		
		String name = "홍길동";
		
//		boolean isValid = Pattern.matches(검사식, 검사할 값);
		
		String regex = "^[가-힣]{2,7}$";
		boolean isValid = Pattern.matches(regex, name);
		
		System.out.println("isValid =" + isValid );
	}

}
