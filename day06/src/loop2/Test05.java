package loop2;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		//1. 사용자에게 원하는 단을 입력받으면 해당 단의 구구단을 출력
		//2.정답을 지우고 사용자에게 정답을 입력받아서 정답/오답 판정 후 출력
		//3.정답과 오답의 개수를 세어 모든 문제 출제 후 출력
		
		Scanner sc=new Scanner(System.in);
		
		int number=sc.nextInt();
	
//		for(int i=1;i<=9;i++) {
//			int a=i*number;
//			
//			String b=number+"*"+i+"=";
//			
//			System.out.println(b+a);
		
		int count1=0;
		int count2=0;
		int count3=0;
		int n=1;
		
	for(int i=1;i<=9;i++) {
		int a=i*number; //정답
		
		
		String b=number+"*"+i+"=";
		
//		System.out.println(b+a); //식+정답
		System.out.print(b);
		
			int number2=sc.nextInt();
			
			boolean c=number2==a;
	
			if(c) {
				count1++;
				System.out.println("정답");
//				while(n<=9) {
//					n++;
//					if(c) {count3++;}
//				
				count3++;
				System.out.println(count3+"콤보!");
			}
			else if(c==false) {
				count2++;
				System.out.println("오답");
				count3=0;
			}

			}
			
	System.out.println("정답수="+count1);
	System.out.println("오답수="+count2);
//	System.out.println("최대 콤보는"+count3);
	
			
	}
}



