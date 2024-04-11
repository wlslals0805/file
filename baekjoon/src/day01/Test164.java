package day01;

import java.util.ArrayList;

public class Test164 {
	public int solution(String[] babbling) {
		int answer = 0;

		ArrayList<String> list = new ArrayList<>();

		list.add("aya");
		list.add("ye");
		list.add("woo");
		list.add("ma");

		ArrayList<String> list2 = new ArrayList<>();

		list2.add("ayaaya");
		list2.add("yeye");
		list2.add("woowoo");
		list2.add("mama");

		for (int i = 0; i < babbling.length; i++) {

			String str = babbling[i];
			boolean pass = true;
			for (int j = 0; j < list.size(); j++) {

				if (str.equals(list2.get(j))) {
					pass = false;
				}

				if (str.contains(list.get(j))) {

					str = str.replaceAll(list.get(j), "%");

				}

			}

			for (char x : str.toCharArray()) {

				if (x != '%') {
					pass = false;
				}

			}

			if (pass == true) {
				answer++;
			}
		}

		return answer;
	}
}
