package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//Test02 예제에서 한 번에 처리하도록
		
		try {//플랜A
			Scanner sc = new Scanner(System.in);
			
			System.out.println("금액: ");
			int money = sc.nextInt();
			
			System.out.println("인원: ");
			int people = sc.nextInt();
		
			sc.close();
			
			int price = money / people; //1인당 정산금액
			int remain = money % people; //자투리 금액
			
			System.out.println("1인당 내야할 금액은 " + price + "원입니다.");
			System.out.println(remain+"원은 저희가 지원해 드려요!");
			}
		
			
			catch(Exception e){	//예외의 아버지
//			catch(Throwable e){	//예외의 할아버지
				
			//플랜B. 무언가 문제가 생겼을 때
			System.err.println("프로그램 오류 발생");
			
			
		}
				
	}

}
