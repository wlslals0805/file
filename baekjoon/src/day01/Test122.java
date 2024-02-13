package day01;

public class Test122 {

	public int solution(int number, int limit, int power) {
		int answer = 0;

		int[] list = new int[number];

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					list[i - 1]++;
					if (i / j > Math.sqrt(i)) {
						list[i - 1]++;
					}
				}
			}
		}

		for (int i = 0; i < list.length; i++) {

			if (list[i] > limit) {
				answer += power;
			} else {
				answer += list[i];
			}

		}

		return answer;
	}

}
