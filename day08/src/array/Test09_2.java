package array;

import java.util.Random;

public class Test09_2 {

	public static void main(String[] args) {
		//주사위를 1000번 던졌을 때 모든 숫자가 나온 횟수 측정하기
		
				Random r = new Random();
				
				int count1 = 0;
				int count2 = 0;
				int count3 = 0;
				int count4 = 0;
				int count5 = 0;
				int count6 = 0;
				for(int i=0; i < 1000; i++) {
					int dice = r.nextInt(6) + 1;
					if(dice == 1) {
						count1++;
					}
					else if(dice == 2) {
						count2++;
					}
					else if(dice == 3) {
						count3++;
					}
					else if(dice == 4) { 
						count4++;
					}
					else if(dice == 5) {
						count5++;
					}
					else {
						count6++;
					}
				}
				
				System.out.println("1 나온 횟수 = " + count1);
				System.out.println("2 나온 횟수 = " + count2);
				System.out.println("3 나온 횟수 = " + count3);
				System.out.println("4 나온 횟수 = " + count4);
				System.out.println("5 나온 횟수 = " + count5);
				System.out.println("6 나온 횟수 = " + count6);
	}

}
