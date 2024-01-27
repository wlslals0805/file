package day01;

public class Test105 {

	public String solution(String s, int n) {
		String answer = "";

		for (char x : s.toCharArray()) {

			if (x != ' ') {
				char ch = (char) (x + n);

				for (int i = 0; i < n; i++) {

					if (x == 'z') {

						x = 'a';

					} else if (x == 'Z') {
						x = 'A';
					} else {
						x++;
					}

				}

				answer += x;

			} else {
				answer += x;

			}

		}

		return answer;
	}

}
