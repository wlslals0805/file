package api.lang.String2;

public class Test03_1 {

	public static void main(String[] args) {
		//정규 표현식(REGular EXpression)
		
				String number = "01012123434";
				
//				String regex = "^01[016-9][0-9]{3,4}[0-9]{4}$";
				String regex = "^01[016-9][1-9][0-9]{2,3}[0-9]{4}$";
//				boolean isValid = Pattern.matches(regex, number);
				boolean isValid = number.matches(regex);
				
				if(isValid) {
					System.out.println("유효한 전화번호입니다");
				}
				else {
					System.out.println("잘못된 전화번호입니다");
				}
	}

}
