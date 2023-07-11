package api.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	
//	다음 형태의 시간 정보를 현재 시간으로 구하여 출력
//
//	2023년 7월 11일
//	오후 1시 1분
//	13:01:05
//	2023-07-11 화 13:01:05
	

	public static void main(String[] args) {
		
		Date a=new Date();
		Date a2=new Date();
		Date b=new Date();
		Date c=new Date();
		
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy"+"년"+"MM"+"월"+"dd"+"일");
		SimpleDateFormat fmt2 = new SimpleDateFormat("a "+"h"+"시"+"m"+"분");
		SimpleDateFormat fmt3 = new SimpleDateFormat("k"+":"+"mm:"+"ss");
		SimpleDateFormat fmt4 = new SimpleDateFormat("yyyy-MM-dd "+"E "+"k"+":"+"mm:"+"ss");
		
		
		String time = fmt.format(a);
		String time2 = fmt2.format(a2);
		String time3 = fmt3.format(b);
		String time4 = fmt4.format(c);
		System.out.println(time);
		System.out.println(time2);
		System.out.println(time3);
		System.out.println(time4);
	}

}
