package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test06 {

	public static void main(String[] args) {
//		오늘부터 100일동안 다이어트를 한다고 했을 때 다이어트가 끝나는 날을 구하여 출력
		
		Calendar c = Calendar.getInstance();
		
		int today=c.get(Calendar.DATE);

		System.out.println(today);

		c.set(Calendar.DAY_OF_MONTH, today+99);
				
		System.out.println(c.get(Calendar.DATE));
		
		Date d= c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd E");
		System.out.println(fmt.format(d));
		
	}

}
