package loop;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
//		사용자에게 숫자를 5번 입력받는 프로그램을 구현하세요
		
		//도구 생성은 한 번만 한다
		
		Scanner sc = new Scanner(System.in);
		
		for(int a=0; a<5; a++) {
		 System.out.println("숫자를 다섯 번 입력하세요");
			int f=sc.nextInt();
//			System.out.println(f);
		}
		
		
	}

}
