package array;

import java.util.Scanner;

public class Test08_1 {

	public static void main(String[] args) {
		//성적우수자 점수를 출력
		
				//int[] scoreList = new int[] {0, 0, 0, 0, 0};
				int[] scoreList = new int[5];
				
				Scanner sc = new Scanner(System.in);
				
				for(int i=0; i < scoreList.length; i++) {
					System.out.print("점수 : ");
					scoreList[i] = sc.nextInt();
				}
				
				sc.close();
				
				System.out.println("성적우수자 점수는 다음과 같습니다");
				for(int i=0; i < scoreList.length; i++) {
					if(scoreList[i] >= 90) {
						System.out.println("성적우수자 점수 = " + scoreList[i]);
					}
				}
	}

}
