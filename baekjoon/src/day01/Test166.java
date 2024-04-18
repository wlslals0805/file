package day01;

import java.util.ArrayList;
import java.util.List;

public class Test166 {

	public List<Integer> solution(int[] arr, int k) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}

			if (list.size() == k) {

				break;
			}
		}

		int dif = k - list.size();

		if (list.size() < k) {

			for (int i = 0; i < dif; i++) {

				list.add(-1);
			}
		}

		return list;
	}
}
