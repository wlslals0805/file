package day01;

public class Test126 {

	public int solution(int n) {
		int answer = 0;
		

		for (int i = 2; i <= n; i++) {
			boolean result = true;

			for (int j = 2; j <= Math.sqrt(i); j++) {

				if (i % j == 0) {
					result = false;
					break;
				}

			}

			if (result == true) {
				answer++;
			}

		}

		return answer;
	}

}
