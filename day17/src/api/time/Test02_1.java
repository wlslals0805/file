package api.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02_1 {

	public static void main(String[] args) {
		//시간 객체
		Date d = new Date();
		
		//형식 객체
		SimpleDateFormat f1 = new SimpleDateFormat("y년 M월 d일");
		SimpleDateFormat f2 = new SimpleDateFormat("a h시 m분");
		SimpleDateFormat f3 = new SimpleDateFormat("H:mm:ss");
		SimpleDateFormat f4 = new SimpleDateFormat("yyyy-MM-dd E H:mm:ss");
		
		//출력
		System.out.println(f1.format(d));
		System.out.println(f2.format(d));
		System.out.println(f3.format(d));
		System.out.println(f4.format(d));
	}

}
