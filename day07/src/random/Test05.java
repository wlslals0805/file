package random;

import java.util.Random;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
//		사용자에게 랜덤으로 2단부터 9단 사이의 구구단 문제를 10개 출제합니다.
//
//		사용자가 입력한 값으로 정답/오답을 판정하고 모든 문제 출제가 끝나면 정답과 오답 개수를 출력해주세요
		
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		int q=0;
		int n=0;

		for(int i=1;i<=10;i++) {
			int dan=r.nextInt(8)+2;
			int number=r.nextInt(9)+1;
			
			System.out.println(dan + "x" + number+"=");
			int a=sc.nextInt();
			
			if(a==(dan*number)) {
				System.out.println("정답");
				q++;
			}
			
		
			else {
			
				System.out.println("오답");
				n++;}
			
			if(n==3) {
				System.out.println("게임 오버");
				break;
				
			}
			
		}
		
		System.out.println("정답 수는 "+ q);
		System.out.println("오답 수는 "+ n);
		
	}
	}

