package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Test05 {

	public static void main(String[] args) {
//		올해 중에서 랜덤으로 하루를 추첨하여 출력
		
		Calendar c=Calendar.getInstance();
		Random r= new Random();
		
		int day=r.nextInt(365)+1;		
		
		c.set(2023, 0, day);		//365일 중에서 하루를 빼내면 Calendar가 자동으로 계산해서 날짜로 변환시켜준다.
		
		Date d=c.getTime();
		
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(fmt.format(d));
		
			
		
		
		
	}

}
