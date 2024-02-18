package day01;

public class Test127 {

	public int solution(int n, int m, int[] section) {
		int answer = 0;

		int[] list = new int[n];

		for (int i = 0; i < section.length; i++) {
			int index = section[i] - 1;

			if (list[index] != 2) {
				list[index] = 1;
				for (int j = 0; j < m; j++) {

					list[index] = 2;
					index++;

					if (index >= n) {
						break;
					}

				}
				answer++;
			}

		}

		return answer;
	}

}
