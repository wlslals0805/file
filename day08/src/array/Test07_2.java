package array;

import java.util.Scanner;

public class Test07_2 {

	public static void main(String[] args) {
		
//		사용자에게 나라이름 5개를 입력받아서 출력하도록 프로그램 구현
		
		Scanner sc=new Scanner(System.in);
		
		String[] name= new String[5];
		
		for(int i=0;i<name.length;i++) {
			
			System.out.println("나라이름을 입력하세요");
			
			String a=sc.next();
			name[i]=a;
			
		}
		for(int i=0;i<name.length;i++) {
			
			System.out.println(name[i]);
			
		}
		
		
	}

}
