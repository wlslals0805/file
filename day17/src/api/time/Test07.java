package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test07 {

	public static void main(String[] args) {
//		사용자에게 연도와 월을 입력받아서 해당하는 달 달력의 시작날짜를 출력
//
//		2023년 7월 달력의 시작날짜(달력에 처음으로 뜨는 날짜)는 6/25(일) 입니다
		
		Calendar c=Calendar.getInstance();
		
		int inputY =2023;
		int inputM=07;
		
		c.set(inputY, inputM-1, 1);
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		
		
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		int week=c.get(Calendar.DAY_OF_WEEK)-1;
		
		
		
		c.set(Calendar.DATE, c.get(Calendar.DATE)-week);
		
		
		
		
		Date d=c.getTime();
		
	SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd E");
		
		System.out.println(fmt.format(d));
		
		
		
		
		
		
		
		
		
		
		
	}

}
