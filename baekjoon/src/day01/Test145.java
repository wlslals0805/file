package day01;

import java.util.*;

public class Test145 {

	public int solution(int[] array) {
		int answer = 0;
		int max = 0;

		for (int j = 0; j < array.length; j++) {
			int count = 0;
			int num = array[j];
			for (int i = 0; i < array.length; i++) {

				if (array[i] == num) {
					count++;
				}

			}

			if (count > max) {

				max = count;
				answer = num;
			}

		}

		Set<Integer> set = new HashSet<>();

		for (int j = 0; j < array.length; j++) {
			int count = 0;
			int num = array[j];
			for (int i = 0; i < array.length; i++) {

				if (array[i] == num) {
					count++;
				}

			}

			if (count == max) {

				set.add(num);
			}

		}

		if (set.size() >= 2) {
			return -1;
		} else {
			return answer;
		}

	}
}
