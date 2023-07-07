package api.lang.String2;

import java.util.regex.Pattern;

public class Test03 {

	public static void main(String[] args) {
//		사용자에게 휴대전화번호를 입력받아 유효한지 아닌지 판정하여 출력
//
//		대시는 작성할 수 없습니다
//		010, 011, 016, 017, 018, 019로 시작
//		가운데는 3~4자리의 숫자
//		마지막은 4자리의 숫자
		
		String number="01012341234";
		String regex = "^01[016789][0-9]{4}[0-9]{4}$";
		
		
		
//		boolean a= Pattern.matches(regex,"0162352344");
		boolean isValid = number.matches(regex);
		
		
		if(isValid) {
			System.out.println("유효한 전화번호입니다");
		}
		else {
			
		
		System.out.println("잘못된 전화번호입니다");
		
	}
	}
}
