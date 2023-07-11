package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test03 {

	public static void main(String[] args) {
		//Calendar 클래스
		//Date에 비해 가진 정보가 엄청 많다
		
//		Calendar c= new Calendar(); //=추상 클래스이므로 객체 생성 불가
		
		
//		Calendar c = new GregorianCalendar();		//업캐스팅
		Calendar c = Calendar.getInstance(); //권장하는 방법(생성위탁)
		
		System.out.println(c);
		
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd E H:mm:ss");
		System.out.println(fmt.format(d));
		
		
		
		
		
		
	}

}
