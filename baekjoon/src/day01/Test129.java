package day01;

import java.util.ArrayList;
import java.util.List;

public class Test129 {
	public int solution(String dartResult) {
		int answer = 0;

		List<Integer> list = new ArrayList<>();

		char[] ch = dartResult.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			String s = String.valueOf(ch[i]);

			if (Character.isDigit(ch[i])) {
				System.out.println("s=" + s);
				if (ch[i + 1] == 'S') {
					list.add(Integer.parseInt(s));
					answer += Integer.parseInt(s);
				} else if (ch[i + 1] == 'D') {
					list.add(Integer.parseInt(s) * Integer.parseInt(s));
					answer += Integer.parseInt(s) * Integer.parseInt(s);
				} else if (ch[i + 1] == 'T') {
					list.add(Integer.parseInt(s) * Integer.parseInt(s) * Integer.parseInt(s));
					answer += Integer.parseInt(s) * Integer.parseInt(s) * Integer.parseInt(s);
				}

			} else if (ch[i] == '*') {
				answer -= list.get(list.size() - 1);
				answer += list.get(list.size() - 1) * 2;

				if (i > 3) {
					answer -= list.get(list.size() - 2);
					answer += list.get(list.size() - 2) * 2;
				}
			} else if (ch[i] == '#') {
				answer -= list.get(list.size() - 1) * 2;

			}
			System.out.println(answer);

		}

		return answer;
	}
}
