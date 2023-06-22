package data3;

public class Test7_1 {

	public static void main(String[] args) {
		
//		윤년 계산기 만들기
//
//		윤년이란 실제 1년과 달력상의 1년의 차이 때문에 생기는 날짜를 메꾸기 위한 해입니다
//
//		실제 = 365.24..일 , 달력 = 365일
//
//		윤년의 규칙은 다음과 같습니다
//
//		- 윤년에는 2월이 29일까지 있습니다(366일)
//		- 4의 배수인 해는 윤년으로 간주합니다
//		- 100의 배수인 해는 4의 배수일지라도 윤년이 아닌 것으로 간주합니다
//		- 400의 배수인 해는 100의 배수일지라도 윤년으로 간주합니다
//
//		이 기준을 토대로 특정 연도가 윤년인지 아닌지 판정해서 출력

		
//		int year=2000;
//		boolean leapYear = (year%4==0 && (year%100!=0 || year%400==0)) ||  year%400==0;
//		
//		System.out.println(leapYear);
		
		//윤년 계산 프로그램

		//입력
		int year = 2004;
	
		//계산
		//[1]4의 배수면 윤년이다
		//[2]100의 배수가 아니여야 한다
		//[3]400의 배수면 윤년이다
		
	    boolean is4 = year %4==0;
//	    boolean isNot100 = year %100!=0;
	    boolean isNot100 =!(year%100==0); //논리 부정
	    boolean is400 = year %400==0; 
		boolean leapYear = is400||is4&&isNot100;
		
		System.out.println(leapYear);
		
		//출력
				
	}

}
