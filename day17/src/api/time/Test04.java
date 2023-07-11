package api.time;

import java.util.Calendar;

public class Test04 {

	public static void main(String[] args) {
		//Calendar의 장점
		//=1900년이 기준이 아니기 때문에 일반적인 연도 설정 가능
		//=범위를 벗어나도 자동으로 가능한 값으로 변환된다(계산 특화)
		
		Calendar c =Calendar.getInstance();	//생성하는 시점의 시간이 들어간다
	
		
		//항목별로 설정
//		c.set(Calendar.YEAR, 2000);
//		c.set(Calendar.MONTH, 0); 	//1월이 0부터 시작(주의)
//		c.set(Calendar.DATE, 1);
//		c.set(2000, 0, 1);
//		c.set(2000, 0, 0);
//		c.set(2000, 30, 1);	//Calendar의 좋은 점: 날짜가 범위를 넘어가도 자동으로 맞는 날짜로 변경해줌
		
		
		//항목별로 추출하여 출력
		//Date와 다르게 많은 정보를 담고있는 Calendar에서 
		//원하는 정보만 뽑아서 출력하기 위해 객체의 참조변수.get을 사용
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year+"년");
		
		//(주의) 월은 0부터 11까지 관리됨
		int month = c.get(Calendar.MONTH)+1;		
		System.out.println(month+"월");
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day+"일");
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		
		System.out.println(hour+"시");
		int minute = c.get(Calendar.MINUTE);
		System.out.println(minute+"분");
		int second = c.get(Calendar.SECOND);
		System.out.println(second+"초");
		
	}

}
