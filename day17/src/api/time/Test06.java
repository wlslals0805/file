package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test06 {

	public static void main(String[] args) {
//		오늘부터 100일동안 다이어트를 한다고 했을 때 다이어트가 끝나는 날을 구하여 출력
		
		Calendar c=Calendar.getInstance();
			
		
		//Calendar.DATE와 c.get(Calendar.DATE)의 값은 다르다. c라는 참조변수로 인해서 
		//c.get(Calendar.DATE)는 객체 생성 당시의 값을 반영. Calendar.DATE는 무슨 값을 반영하는지는 모르겠음.
		
		int t=c.get(Calendar.DATE);
		
		c.set(Calendar.DATE, t+99);
		
		
		Date d= c.getTime();
		
		
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd E");
		
		System.out.println(fmt.format(d));
		
	}

}
