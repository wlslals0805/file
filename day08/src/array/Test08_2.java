package array;

import java.util.Scanner;

public class Test08_2 {

	public static void main(String[] args) {
		//등수 구하기
		
				//int[] scoreList = new int[] {0, 0, 0, 0, 0};
				int[] scoreList = new int[5];
				
				Scanner sc = new Scanner(System.in);
				
				for(int i=0; i < scoreList.length; i++) {
					System.out.print("점수 : ");
					scoreList[i] = sc.nextInt();
				}
				
				sc.close();
				
				int score = 75;
				int rank = 1;
				for(int i=0; i < scoreList.length; i++) {
					if(scoreList[i] > score) {
						rank++;
					}
				}
				System.out.println("예상 등수 = " + rank);
	}

}
