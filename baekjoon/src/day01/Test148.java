package day01;

import java.util.ArrayList;
import java.util.List;

public class Test148 {

	public List<Integer> solution(int num, int total) {

		List<Integer> list = new ArrayList<>();
		int start = 0;

		while (true) {
			int result = 0;
			for (int i = start; i < start + num; i++) {

				result += i;

			}

			if (result > total) {
				start--;
			} else if (result < total) {
				start++;
			} else {
				break;
			}

		}

		for (int i = start; i < start + num; i++) {
			list.add(i);
		}

		return list;
	}
}
