package data3;


import java.util.Calendar;

public class Test02_1 {

	public static void main(String[] args) {
//		KH 편의점에서는 한국 나이로 20세 이상에게만 술, 담배를 팝니다  
//
//		어떤 사람의 출생년도가 2003년일 때 이 사람에게 술, 담배를
//		팔아도 되는지 판정하여 출력하세요
//
//		(한국 나이는 태어났을 때부터 1살이며, 만 나이와 다릅니다)
		
		
		// 나이 
//		=태어난 해부터 올해까지 살아온 연도 수
//		=올해-태어난 해+1
///태어난 해부터 나이를 먹기 때문에 +1?
		
//		A부터 B까지 구하는 식
//		A-B+1
		
		//성인 판정 프로그램
		
		Calendar cal = Calendar.getInstance();
        System.out.println("The Current Year is:" + cal.get(Calendar.YEAR));
		
		//입력
		int birth=2003;
		int year= cal.get(Calendar.YEAR);
		
		//계산
		int age=year-birth+1;
		boolean adult = age >=20;
		
		System.out.println(age);
		System.out.println(adult);
		
		
	}

}

