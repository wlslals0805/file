package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test07_1 {
	public static void main(String[] args) {
		
		//입력
		int year = 2023;
		int month = 6;
		
		//계산
		//= 달력은 일요일부터 출력한다
		//= 1일이 무슨요일이냐에 따라서 전달의 출력 일수가 달라진다
		//= 1일이 일요일(week=1)이면 전달 출력 일수는 0일
		//= 1일이 월요일(week=2)이면 전달 출력 일수는 1일
		//= 1일이 화요일(week=3)이면 전달 출력 일수는 2일
		//= 1일이 수요일(week=4)이면 전달 출력 일수는 3일
		//= 1일이 목요일(week=5)이면 전달 출력 일수는 4일
		//= 1일이 금요일(week=6)이면 전달 출력 일수는 5일
		//= 1일이 토요일(week=7)이면 전달 출력 일수는 6일
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
//		c.set(2023,6,1);
		int week = c.get(Calendar.DAY_OF_WEEK);
//		System.out.println("week = " + week);
		
		//System.out.println("달력에는 전달을 "+(week-1)+"일 출력해야 합니다");
		c.add(Calendar.DATE, -(week-1));
		
		//출력
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd E");
		System.out.println(fmt.format(d));
		
	}
}