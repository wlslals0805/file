package day01;

import java.util.ArrayList;
import java.util.List;

public class Test131 {
	public int solution(String s) {
		int x_count = 0;
		int not_x_count = 0;

		char x = ' ';

		List<String> list = new ArrayList<>();
		String str = "";

		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (x == ' ') {
				x = ch[i];
			}

			if (x == ch[i]) {
				x_count++;
			} else {
				not_x_count++;
			}

			if (x_count != not_x_count) {
				str += ch[i];
				if (i == ch.length - 1) {
					list.add(str);
				}
			} else {
				list.add(str);
				x_count = 0;
				not_x_count = 0;
				x = ' ';
				str = "";
			}

		}

		return list.size();
	}
}
