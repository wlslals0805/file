package array;

import java.util.Scanner;

public class Test06_1 {

	public static void main(String[] args) {
		//실수 5개를 입력받아 출력하도록 구현
				Scanner sc = new Scanner(System.in);
				
				double[] data = new double[5];
				//data ----> [ 0.0 ][ 0.0 ][ 0.0 ][ 0.0 ][ 0.0 ] (length=5)
				
				for(int i=0; i < data.length; i++) {
					System.out.print("실수 입력 : ");
					data[i] = sc.nextDouble();
				}
				
				for(int i=0; i < data.length; i++) {
					System.out.println("데이터 = " + data[i]);
				}
	}

}
