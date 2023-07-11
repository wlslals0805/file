package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test03 {

	public static void main(String[] args) {
		//Calendar 클래스
		//Date에 비해 가진 정보가 엄청 많다
		//Date로 변환이 가능
		
//		Calendar c= new Calendar(); //=추상 클래스이므로 객체 생성 불가(객체 형식으로 불러오는 게 아님)
		
//		Calendar c = new GregorianCalendar();		//(객체 생성 가능)업캐스팅
		Calendar c = Calendar.getInstance(); //권장하는 방법(생성위탁)
			
		System.out.println(c);	//Calendar 클래스가 가지고 있는 정보들 나열
		
		
		Date d = c.getTime(); 	//Date로 변환
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd E H:mm:ss");
		System.out.println(fmt.format(d));
		
		
		
		
		
		
	}

}
