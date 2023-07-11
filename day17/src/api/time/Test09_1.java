package api.time;

import java.time.LocalDate;

public class Test09_1 {

	public static void main(String[] args) {
		
		//입력
		String input = "2023-07-11";
		
		//계산
		LocalDate date = LocalDate.parse(input);
		//System.out.println(date);
		
		LocalDate after100days = date.plusDays(100L);
		LocalDate after200days = date.plusDays(200L);
		LocalDate after300days = date.plusDays(300L);
//		LocalDate after1years = date.plusDays(365L);
		LocalDate after1years = date.plusYears(1L);
		LocalDate after2years = date.plusYears(2L);
		LocalDate after10years = date.plusYears(10L);
		
		//출력
		System.out.println("기념일 = " + date);
		System.out.println("100일 = " + after100days);
		System.out.println("200일 = " + after200days);
		System.out.println("300일 = " + after300days);
		System.out.println("1주년 = " + after1years);
		System.out.println("2주년 = " + after2years);
		System.out.println("10주년 = " + after10years);
		
	}

}
