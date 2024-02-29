package day01;

import java.util.Set;
import java.util.TreeSet;

public class Test112 {

	

	public Set<Integer> solution(int[] numbers) {
	    Set<Integer> result = new TreeSet<>();

	    for (int i = 0; i < numbers.length - 1; i++) {
	        for (int j = i + 1; j < numbers.length; j++) {
	            result.add(numbers[i] + numbers[j]);
	        }
	    }

	    return result;
	}


}
