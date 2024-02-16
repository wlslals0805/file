package day01;

public class Test125 {
	public int solution(int n) {
		int answer = 0;
		int[] list = new int[n + 1];

		for (int i = 2; i <= n; i++) {
			if (list[i] == 0) {

				answer++;

				for (int j = i; j <= n; j += i) {
					list[j] = 1;
				}

			}

		}

		return answer;
	}
}
