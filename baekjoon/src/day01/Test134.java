package day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test134 {

	public static int[] list_count(String str) {

		int[] list = new int[10];

		for (char x : str.toCharArray()) {

			int index = Integer.parseInt(String.valueOf(x));

			list[index]++;

		}

		return list;

	}

	public String solution(String X, String Y) {

		int[] x_count = list_count(X);
		int[] y_count = list_count(Y);

		List<Integer> list = new ArrayList<>();

		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < x_count.length; i++) {

			if (x_count[i] > 0 && y_count[i] > 0) {
				int min = Math.min(x_count[i], y_count[i]);

				for (int j = 0; j < min; j++) {

					list.add(i);

				}
			}
		}

		if (list.size() == 0) {
			return "-1";
		}
		Collections.sort(list);
		Collections.reverse(list);

		for (int i = 0; i < list.size(); i++) {

			answer.append(list.get(i));

		}

		if (answer.charAt(0) == '0') {
			return "0";
		} else {
			return answer.toString();
		}

	}

}
