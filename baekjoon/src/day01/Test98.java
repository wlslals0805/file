package day01;

import java.util.ArrayList;
import java.util.List;

public class Test98 {

	public List<Integer> solution(int[] arr) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			if (i == 0) {
				list.add(arr[i]);
			} else {

				if (arr[i] != arr[i - 1]) {

					list.add(arr[i]);

				}
			}
		}

		return list;
	}

}
