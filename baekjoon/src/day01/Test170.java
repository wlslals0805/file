package day01;

public class Test170 {

	public String solution(String s) {

		String answer = "";

		int seq = 0;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (seq == 0) {

				if (Character.isAlphabetic(ch)) {
					answer += Character.toUpperCase(ch);
					seq++;
				} else {
					answer += ch;

					if (ch != ' ') {
						seq++;
					}
				}

			} else {
				if (Character.isAlphabetic(ch)) {
					answer += Character.toLowerCase(ch);
					seq++;
				} else {
					answer += ch;
					seq++;
					if (ch == ' ') {
						seq = 0;
					}

				}
			}

		}

		return answer;
	}

}
