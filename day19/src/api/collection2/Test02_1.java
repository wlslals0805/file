package api.collection2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02_1 {

	public static void main(String[] args) {
		//List 때 만들었던 로또 생성 프로그램
		
				Random r = new Random();
				
//				Set<Integer> lotto = new HashSet<>();
				Set<Integer> lotto = new TreeSet<>();
				
				while(lotto.size() < 6) {
					int number = r.nextInt(45) + 1;
					lotto.add(number);
				}
				
				System.out.println(lotto);
	}

}
