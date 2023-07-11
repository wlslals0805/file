package api.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test09_3 {

	public static void main(String[] args) {
		//입력
				String input = "2023년 7월 11일";
				
				//계산
				//LocalDate date = LocalDate.parse(input, 해석기준);
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("y년 M월 d일");
				LocalDate date = LocalDate.parse(input, fmt);
				
				long[] days = new long[] {
					100L, 200L, 300L, 365L, 
					400L, 500L, 600L, 700L, 365*2L,
					800L, 900L, 1000L, 365L*3,
					365L*4,365L*5, 365L*6, 365L*7, 365L*8, 365L*9, 365L*10 
				};
				
				//출력
				DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("y년 M월 d일 E요일");
				for(int i=0; i <days.length; i++) {
					LocalDate future = date.plusDays(days[i]);
					if(days[i] % 365 == 0) {
						System.out.println(days[i]/365+"년 뒤 = " + future.format(fmt2));
					}
					else {
						System.out.println(days[i]+"일 뒤 = " + future.format(fmt2));
					}
				}
	}

}
