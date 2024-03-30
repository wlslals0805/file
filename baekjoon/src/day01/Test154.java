package day01;

import java.util.ArrayList;
import java.util.List;

public class Test154 {
	public List<Integer> solution(int l, int r) {

		List<Integer> list = new ArrayList<>();

		StringBuilder sb = new StringBuilder(String.valueOf(l));

		boolean exist_zero = false;

		while (true) {

			for (int i = sb.length() - 1; i >= 0; i--) {

				if (sb.charAt(i) == '0') {
					sb.setCharAt(i, '5');
					exist_zero = true;
					break;
				}

			}

			if (exist_zero == false) {
				sb.append("0");
			}

			list.add(Integer.parseInt(sb.toString()));

			if (Integer.parseInt(sb.toString()) > r) {
				break;
			}
		}

		return list;
	}
}
