package array;

import java.util.Scanner;

public class Test07_1 {

	public static void main(String[] args) {
		//나라이름 5개 입력받고 출력
		
				Scanner sc = new Scanner(System.in);
				
				String[] names = new String[5];
				//names ---> [ null ][ null ][ null ][ null ][ null ] (length=5)
				
				for(int i=0; i < names.length; i++) {
					System.out.print("나라이름 입력 : ");
					names[i] = sc.next();
				}
				
				for(int i=0; i < names.length; i++) {
					System.out.println(names[i]);
				}
	}

}
