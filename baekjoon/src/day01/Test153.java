package day01;

import java.util.ArrayList;
import java.util.List;

public class Test153 {
	public List<Integer> solution(int[] arr, int[] query) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			list.add(arr[i]);

		}

		for (int i = 0; i < query.length; i++) {

			int num = query[i];

			if (i % 2 == 0) {

				for (int j = list.size() - 1; j > num; j--) {
					list.remove(num + 1);
				}

			} else {
				for (int l = 0; l < num; l++) {
					list.remove(0);
				}
			}

		}

		return list;
	}
}
