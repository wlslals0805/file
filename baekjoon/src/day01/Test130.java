package day01;

public class Test130 {

	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];

		int result = 0;
		int zeroCount = 0;

		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < lottos.length; j++) {

				if (win_nums[i] == lottos[j]) {
					result++;
				}

			}
			if (lottos[i] == 0) {
				zeroCount++;
			}
		}

		answer[0] = result + zeroCount;
		answer[1] = result;

		for (int i = 0; i < 2; i++) {

			if (answer[i] == 6) {
				answer[i] = 1;
			} else if (answer[i] == 5) {
				answer[i] = 2;
			} else if (answer[i] == 4) {
				answer[i] = 3;
			} else if (answer[i] == 3) {
				answer[i] = 4;
			} else if (answer[i] == 2) {
				answer[i] = 5;
			} else {
				answer[i] = 6;
			}

		}

		return answer;
	}

}
