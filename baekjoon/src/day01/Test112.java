package day01;

import java.util.Set;
import java.util.TreeSet;

public class Test112 {

	public Set<Integer> solution(int[] numbers) {

		Set<Integer> list = new TreeSet<>();

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int a = i + 1; a < numbers.length; a++) {

				list.add(numbers[i] + numbers[a]);

			}
		}

		return list;
	}

}
