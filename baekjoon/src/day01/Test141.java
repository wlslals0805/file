package day01;

import java.util.*;

public class Test141 {
	public String solution(String[] survey, int[] choices) {

		String answer = "";

		Map<Character, Integer> map = new HashMap<>();

		map.put('R', 0);
		map.put('T', 0);
		map.put('C', 0);
		map.put('F', 0);
		map.put('J', 0);
		map.put('M', 0);
		map.put('A', 0);
		map.put('N', 0);

		for (int i = 0; i < survey.length; i++) {

			char c1 = survey[i].charAt(0);
			char c2 = survey[i].charAt(1);

			int num = choices[i];

			if (num == 1) {
				map.put(c1, map.get(c1) + 3);
			} else if (num == 2) {
				map.put(c1, map.get(c1) + 2);
			} else if (num == 3) {
				map.put(c1, map.get(c1) + 1);
			} else if (num == 5) {
				map.put(c2, map.get(c2) + 1);
			} else if (num == 6) {
				map.put(c2, map.get(c2) + 2);
			} else if (num == 7) {
				map.put(c2, map.get(c2) + 3);
			}
		}

		if (map.get('R') < map.get('T')) {
			answer += 'T';
		} else {
			answer += "R";
		}

		if (map.get('C') < map.get('F')) {
			answer += 'F';
		} else {
			answer += "C";
		}

		if (map.get('J') < map.get('M')) {
			answer += 'M';
		} else {
			answer += "J";
		}

		if (map.get('A') < map.get('N')) {
			answer += 'N';
		} else {
			answer += "A";
		}

		return answer;
	}
}
