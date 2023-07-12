package api.collection;

import java.util.ArrayList;
import java.util.Random;

public class Test04_1 {

	public static void main(String[] args) {
		//로또 번호 추첨기
		
				Random r = new Random();
				
				ArrayList<Integer> lotto = new ArrayList<>();
				
				while(lotto.size() < 6) {
					int number = r.nextInt(45) + 1;
//					if(lotto.contains(number) == false) {
					if(!lotto.contains(number)) {
						lotto.add(number);
					}
				}
				
				lotto.sort(null);
				
				System.out.println(lotto);
	}

}
