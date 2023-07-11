package api.time;

import java.time.LocalDate;
import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
//		사용자에게 날짜를 yyyy-MM-dd 형식으로 입력받아 다음을 계산하여 출력하십시오
//
//		100일
//		200일
//		300일
//		1주년
//		2주년
//		10주년
		
		Scanner sc=new Scanner(System.in);
		
		String time=sc.next();
		
		String v=time.substring(0, 4);
		String c=time.substring(5, 7);
		String x=time.substring(8, 10);
		
		
		int b1=Integer.parseInt(v);
		int b2=Integer.parseInt(c);
		int b3=Integer.parseInt(x);
		
//		String time = "2023-07-11";
		
		LocalDate a= LocalDate.of(b1, b2, b3);
		
		LocalDate a100=a.plusDays(100L);
		LocalDate a200=a.plusDays(200L);
		LocalDate a300=a.plusDays(300L);
		LocalDate a1=a.plusYears(1L);
		LocalDate a2=a.plusYears(2L);
		LocalDate a10=a.plusYears(10L);
		
		
		System.out.println("100일: "+a100);
		System.out.println("200일: "+a200);
		System.out.println("300일: "+a300);
		System.out.println("1주년: "+a1);
		System.out.println("2주년: "+a2);
		System.out.println("10주년: "+a10);
		
		
	}

}
