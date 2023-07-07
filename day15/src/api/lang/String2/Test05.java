package api.lang.String2;

public class Test05 {

	public static void main(String[] args) {
		
		//사용자에게 생년월일을 입력받아 검사 후 출력
		//-형식은 연도 4자리 + 대시 + 월 2자리 + 대시 + 일 2자리로 구성
		//-연도는 1900부터 2099년까지만 가능합니다.
		//-월은 01부터 12까지만 가능합니다
		//-일은 난이도에 따라 다음과 같이 처리
		//-'하' - 무조건 31일까지
		//-'중' -큰달,작은달을 구분하여 처리(2월은 29일로 간주)
		//-'상' - 윤년을 고려하여 처리
//		(1|3|5|7|8|10|12)
		
		String b="1998-08-31";
		
		String regex="^(19[0-9]{2}|20[0-9]{2})-(0[1-9]|1[0-2])-(0[1-9]|2[0-9]|3[0-1])$";
//		String regex="^[1][9][0-9]{2}-(0[1[1-31]|2[1-30]|3[1-31]|4[1-30]|5[1-31]|6[1-30]|7[1-31]|8[1-31]|9[1-30]]1[0[1-31]|1[1-30]2[1-31]])$";

		
	boolean a = b.matches(regex);
		
	if(a) {
		System.out.println(b+" 생년월일 입력이 완료되었습니다.");}
	
		else {System.out.println("다시 입력하세요");}
	
	
	}
}
