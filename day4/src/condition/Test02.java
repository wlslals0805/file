package condition;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
//		# 조건(Condition)

//		고3 수험생을 대상으로 이벤트를 진행하기 위해
//		검사하는 프로그램을 만들려고 합니다
//
//		출생년도 입력받아서 19살인 경우 `이벤트 대상입니다` 출력  
//		아니면 `이벤트 대상이 아닙니다` 출력
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("출생년도를 입력하세요");
		int birth=sc.nextInt();
		int presentYear=2023;
		int age=presentYear-birth+1;
		
		System.out.println("당신의 나이는 "+age+"살");
		
		if(age==19) { System.out.println("이벤트 대상입니다.");
			
		}
		else
		{
		System.out.println("이벤트 대상이 아닙니다.");
		}
		
	}

}
