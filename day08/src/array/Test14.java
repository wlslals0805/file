package array;

import java.util.Random;

public class Test14 {

	public static void main(String[] args) {
//		이전 문제와 동일한 데이터 또는 어떠한 데이터든 관계 없이 준비하고 
//		배열의 모든 데이터를 랜덤으로 섞는 코드를 구현(cf:카드섞기)
//
//		모든 자리는 1번씩 다른 위치와 바뀌어야 한다
//		어디랑 섞일지 대상 위치는 모르며 같은 위치일 수도 있다
//		랜덤으로 정해진 위치와 현재 위치의 데이터를 바꾸도록 구현
		
		Random r=new Random();
		int[] data=new int[] {30,50,20,10,40};
		int backup=0;
		
		for(int i=0;i<data.length;i++) {
			int x=r.nextInt(5);
			backup=data[i];
			data[i]=data[x];
			data[x]=backup;
		
			
		}
		for(int i=0;i<data.length;i++) {
			
			System.out.println(data[i]);
		}
		
		
		
	}

}
