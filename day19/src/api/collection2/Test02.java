package api.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {

	public static void main(String[] args) {
//		이번주 로또 예상 추첨번호를 구하여 출력
		
		ArrayList<Integer>lotto = new ArrayList<>();
		
		Random r = new Random();
		
		
	for(int i=1;i<=45;i++) {
			
			lotto.add(i);
			
		}
	
	
	Collections.shuffle(lotto);
		
	Set<Integer> b = new TreeSet<>();
	
	for(int i=0;i<6;i++) {
		
		b.add(lotto.get(r.nextInt(45)));
		
	}
		
		
		Set<Integer> a = new HashSet<>();
		
		for(int i=0;i<6;i++) {
			
			a.add(lotto.get(i));
			
		}
		
		
		
		
		System.out.println("HashSet:"+a);
		System.out.println("TreeSet:"+b);
		
		
	}

}
