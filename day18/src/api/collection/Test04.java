package api.collection;

import java.util.ArrayList;
import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
//		이번 주 로또 당첨 예상번호를 추첨하는 프로그램을 구현하고 싶습니다.
//		보너스 번호를 제외한 6개의 1~45 범위 내에서 중복없는 숫자를 추첨한 뒤 저장소에 저장하고 출력
//
//		//int, long과 같은 원시형은 Generic Type을 사용할 수 없다(null 때문)
//		ArrayList<int> a = new ArrayList<>();//error
//		ArrayList<Integer> b = new ArrayList<>();//ok
		
		Random r =new Random();
		ArrayList<Integer>list = new ArrayList<>();
		
		
		for(int i=0;i<6;i++) {
			int lotto = r.nextInt(45)+1;
			if(list.contains(lotto)) {
				i--;
			}
			else {
				list.add(lotto);
			}
		}
		list.sort(null);
		
			System.out.println("오늘의 로또 번호는: "+list);
			
		
		
		
		
		
		
		
	}

}
