package api.time;

import java.util.Calendar;
import java.util.Random;

public class Test05 {

	public static void main(String[] args) {
//		올해 중에서 랜덤으로 하루를 추첨하여 출력
		
		Calendar c = Calendar.getInstance();
		Random r= new Random();
		
		System.out.println("랜덤:"+c.get(r.nextInt(Calendar.DAY_OF_YEAR))+1);
		
		
		

	}

}
