package array;


import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
//		사용자에게 나라이름 5개를 입력받아서 출력하도록 프로그램 구현
		
		Scanner sc=new Scanner(System.in);
		
		String[] a=new String[5];
		
		for(int i=0;i<a.length;i++) {
			
			
			a[i]=sc.next();
			
		}
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		
		
	}

	

}
