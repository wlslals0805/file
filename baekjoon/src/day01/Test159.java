package day01;

public class Test159 {
	public int solution(int chicken) {
		int answer = 0;

		answer += chicken / 10;
		int c = (chicken % 10) + answer;

		while (c >= 10) {

			int count = c / 10;

			if (c >= 10) {
				answer += c / 10;
			}

			c = c % 10 + count;

		}
		return answer;
	}
}
