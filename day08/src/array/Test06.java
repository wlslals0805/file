package array;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
//		사용자에게 실수 5개를 입력받아서 출력하도록 프로그램 구현
		
		Scanner sc=new Scanner(System.in);
		
		double[] a= new double[5];
		
		for(int i=0; i<a.length; i++) {
			System.out.println("실수 입력");
			double b=sc.nextDouble();
			a[i]=b;
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	

		

		
	}

}
