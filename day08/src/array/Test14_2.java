package array;

import java.util.Random;

public class Test14_2 {

	public static void main(String[] args) {
Random r = new Random();
		
		//데이터 준비
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		//셔플(뒤섞기)
		for(int i=0; i < data.length; i++) {
			//[i] <---> [0~4]
			int index = r.nextInt(data.length);
			
			int backup = data[i];
			data[i] = data[index];
			data[index] = backup;
		}
		
		//출력
		for(int i=0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
