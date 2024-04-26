package day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test171 {

	public int[] solution(String s) {
		int[] answer = new int[2];

		int zero_cnt = 0;
		int change_cnt = 0;

		while (true) {
			change_cnt++;
			List<String> list = new ArrayList<>();

			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) == '1') {
					list.add(s);
				} else {
					zero_cnt++;
				}

			}

			int length = list.size();

			List<String> str = new ArrayList<>();
			while (length > 0) {

				str.add(String.valueOf(length % 2));

				length = length / 2;

			}

			Collections.reverse(str);
			s = "";
			for (int i = 0; i < str.size(); i++) {
				s += str.get(i);
			}

			if (s.equals("1")) {
				break;
			}

		}

		answer[1] = zero_cnt;
		answer[0] = change_cnt;

		return answer;
	}

}
