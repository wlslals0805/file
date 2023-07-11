package api.time;

import java.time.Duration;
import java.time.LocalTime;

public class Test10_1 {

	public static void main(String[] args) {
		//입력
		String begin = "14:30";
		String end = "19:15";
		
		//계산
		LocalTime t1 = LocalTime.parse(begin);
		LocalTime t2 = LocalTime.parse(end);
		
		Duration duration = Duration.between(t1, t2);
		long time = duration.getSeconds();//이용시간(초)
		System.out.println("time = " + time);
		
		time /= 60;//이용시간(분)
		
		long hour = time / 60;
		long minute = time % 60;
		
		//요금계산
		int pricePerHour = 1000;
		float pricePerMinute = pricePerHour / 60f;
		float totalPrice = pricePerMinute * time;
		
		//출력
		System.out.println("이용시간 : " + hour + "시간 " + minute + "분");
		System.out.println("이용요금 : " + totalPrice + "원");
		System.out.println("이용요금 : " + (int)totalPrice + "원");
		System.out.println("이용요금 : " + (int)Math.floor(totalPrice) + "원");
		System.out.println("이용요금 : " + Math.round(totalPrice) + "원");
		System.out.println("이용요금 : " + (int)Math.ceil(totalPrice) + "원");
	}

}
