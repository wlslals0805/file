package api.collection2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02_2 {

	public static void main(String[] args) {
//		이번주 로또 예상 추첨번호를 구하여 출력
		
		Set<Integer> lotto = new TreeSet<>();
		Random r =new Random();
		
//		for(int i=0;i<6;i++) {
//			
//			lotto.add(r.nextInt(45)+1);
//		}		//Set은 중복을 허용하지 않기 때문에 랜덤 숫자 중에서 같은 숫자가 두 번 나오면(중복) 원래 생각해두었던 6개의 숫자가 다 안 나올 수도 있다.
		
		//이를 해결하기 위한 방법 두가지
		
		//1
		
//		for(int i=0;i<6;i++) {
//			
//			int lottoNum=r.nextInt(45)+1;
//			
//			if(lotto.contains(lottoNum)) {
//			i--;}
//			else {
//				lotto.add(lottoNum);
//			}
//			
//			System.out.println(i); 		//중복될 때마다 돌아가고 있는지 확인하는 출력
//		}
		
		
		
		
		//2
		
		
		while(lotto.size()<6) {
			
			lotto.add(r.nextInt(45)+1);
		}
		
		System.out.println(lotto);
		
		
		
		
	}

}
