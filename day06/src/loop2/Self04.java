package loop2;

import java.util.Scanner;

public class Self04 {

	public static void main(String[] args) {
		//1. 사용자에게 원하는 단을 입력받으면 해당 단의 구구단을 출력
		//2.정답을 지우고 사용자에게 정답을 입력받아서 정답/오답 판정 후 출력
		//3.정답과 오답의 개수를 세어 모든 문제 출제 후 출력
		//연속으로 맞출 경우 콤보 카운트
		
		Scanner sc=new Scanner(System.in);
		
		int dan=sc.nextInt();
//		int a=sc.nextInt();
		int o=0;
		int x=0;
		int c=0;
		for(int i=1;i<=9;i++) {
			
			System.out.println(dan+"x"+i+"=");
			int a=sc.nextInt();
			
		if(a==(dan*i)) {
			System.out.println("정답");
			o++;
			c++;
		}
		else {
			System.out.println("오답");
			x++;
			c=0;
		}
		
		
		}
		System.out.println("정답 수는 "+o);
		System.out.println("오답 수는 "+x);
		System.out.println("콤보 수는 "+c);
	}

}
