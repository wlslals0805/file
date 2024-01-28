package day01;

public class Test105_2 {
	public String solution(String s, int n) {
		String answer = "";

		for (char x : s.toCharArray()) {

			char ch = (char) (x + n);

			if (Character.isUpperCase(x)) {
				if (ch > 'Z') {

					int m = ch - 'Z';

					x = (char) ('A' + m - 1);

				} else {
					x = ch;
				}
				answer += x;
			} else if (Character.isLowerCase(x)) {
				if (ch > 'z') {

					int m = ch - 'z';

					x = (char) ('a' + m - 1);

				} else {
					x = ch;
				}
				answer += x;
			} else {

				answer += x;
			}

		}

		return answer;
	}
}
