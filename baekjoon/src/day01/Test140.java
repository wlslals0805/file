package day01;

public class Test140 {

	public String solution(int[] numbers, String hand) {
		String answer = "";

		int r = 12;
		int l = 10;

		for (int i = 0; i < numbers.length; i++) {

			int[] r_index = index(r);
			int[] l_index = index(l);

			int num = numbers[i];

			int[] idx = index(num);

			if (num == 1 || num == 4 || num == 7) {

				answer += "L";
				l = num;

			} else if (num == 3 || num == 6 || num == 9) {

				answer += "R";
				r = num;

			} else {

				if (Math.abs(r_index[0] - idx[0]) + Math.abs(r_index[1] - idx[1]) > Math.abs(l_index[0] - idx[0])
						+ Math.abs(l_index[1] - idx[1])) {

					answer += "L";
					l = num;
				} else if (Math.abs(r_index[0] - idx[0]) + Math.abs(r_index[1] - idx[1]) < Math.abs(l_index[0] - idx[0])
						+ Math.abs(l_index[1] - idx[1])) {

					answer += "R";
					r = num;
				} else {
					if (hand.equals("left")) {
						answer += "L";
						l = num;
					} else {
						answer += "R";
						r = num;
					}
				}

			}

		}

		return answer;
	}

	public static int[] index(int num) {

		int[][] key = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 0, 12 } };

		int[] index = new int[2];

		for (int i = 0; i < key.length; i++) {
			for (int j = 0; j < key[i].length; j++) {

				if (key[i][j] == num) {
					index[0] = i;
					index[1] = j;

				}

			}
		}

		return index;

	}
}
