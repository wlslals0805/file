package random;

import java.util.Random;

public class Test04_1 {

	public static void main(String[] args) {
		//더블 확률 계산
				Random r = new Random();
				
				int count = 0;
				int size = 100;
				
				for(int i=0; i < size; i++) {
					int dice1 = r.nextInt(6) + 1;
					int dice2 = r.nextInt(6) + 1;
					
					//System.out.println("주사위 = " + dice1 + " , " + dice2);
					if(dice1 == dice2) {
						count++;
					}
				}
				
				System.out.println("더블이 나온 횟수 = " + count);
				double percent = (double)count/size*100;
				System.out.println("확률 = " + percent+"%");
	}

}
