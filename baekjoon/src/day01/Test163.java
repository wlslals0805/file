package day01;

import java.util.Arrays;

public class Test163 {

	public int[] solution(int N, int[] stages) {
		//미완성
		int[] list = new int[N + 1];

		float[] answer = new float[N];

		int[] result = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < stages.length; i++) {
			list[stages[i] - 1]++;

		}

		int count = stages.length;

		for (int i = 0; i < N; i++) {

			answer[i] = (float) list[i] / count;

			count -= list[i];

		}

		for (int i = 0; i < N - 1; i++) {
			int num = i;
			while (answer[i] > answer[i + 1]) {

				if (answer[i] > answer[i + 1]) {

					int tmp = result[num + 1];
					result[num + 1] = result[num];
					result[num] = tmp;

				}
			}

		}

		Arrays.sort(answer);

		return result;
	}
}
