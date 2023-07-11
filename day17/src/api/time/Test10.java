package api.time;

import java.time.Duration;
import java.time.LocalTime;

import javax.xml.crypto.Data;


public class Test10 {

	public static void main(String[] args) {
//		사용자에게 시작시간과 종료시간을 각각 HH:mm 형식으로 입력받아 총 이용시간과 이용요금을 출력하세요
//
//		이용요금은 한 시간당 1000원으로 계산하여 출력하세요
//
//		LocalTime 클래스는 Duration이라는 클래스와 관련이 있습니다
	
			String start = "14:30";
			String end = "20:30";
		
		//계산
		LocalTime date = LocalTime.parse(start);
		LocalTime date2 = LocalTime.parse(end);
		
//		System.out.println(date);
		
		Duration d=Duration.between(date, date2);
		
		long i=d.getSeconds()/60L/60L;
		long m=d.getSeconds()/60%60;
		
		System.out.println("이용시간:"+i+"시간"+m+"분");
		
		//요금계산
		
		float pricePerMinute=1000/60f;
		float total=pricePerMinute*d.getSeconds()/60;
		
		System.out.println("요금: "+ (int)total+"원");
		
		
		
		
		

		
		
		
		
		
	}

}
