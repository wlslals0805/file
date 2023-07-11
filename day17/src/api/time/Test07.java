package api.time;

import java.util.Calendar;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
//		사용자에게 연도와 월을 입력받아서 해당하는 달 달력의 시작날짜를 출력
//
//		2023년 7월 달력의 시작날짜는 6/25(일) 입니다
		Calendar c = Calendar.getInstance();
		Scanner sc=new Scanner(System.in);
		
		String a=sc.next();
		
		String year =  a.substring(0, 4);
		String month =  a.substring(4,6);
		
		int v=Integer.parseInt(year);
		int b=Integer.parseInt(month);
		
		
		c.set(v, b,1);
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));

		
		
		
		
		
		
		
	}

}
