package array;

import java.util.Random;

public class Test09_1 {

	public static void main(String[] args) {
//		로또 시뮬레이션
//
//	로또번호 중에서 가장 많이 나오는 번호를 찾으려는 목적으로 랜덤을 이용하여 로또번호를 1000번정도 추첨하려고 합니다.
//
//		1.각 번호(1~45)가 몇 번 나왔는지 측정하여 출력하세요
//		2.가장 많이 나온 번호를 찾아서 출력하세요
		
		Random r= new Random();
		int[] count=new int[45];
		
		for(int i = 0;i<1000;i++) {
			int a=r.nextInt(45)+1; //ex:45가 나오면
			
			count[a-1]++; //44위치에 카운트 + 1 적립
		}
		for(int i=0;i<count.length;i++) {
			
			System.out.println((i+1)+"="+count[i]+"번 나왔습니다"); 
			
			
		
		
				

	}
	}
}
