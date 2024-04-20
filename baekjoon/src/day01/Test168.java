package day01;

public class Test168 {

	boolean solution(String s) {
		boolean answer = true;

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {
				count++;
			} else {

				if (count <= 0) {
					return false;
				} else {
					count--;
				}
			}

		}

		if (count > 0) {
			answer = false;
		}

		return answer;
	}

}
