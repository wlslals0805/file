package day01;

public class Test103 {

	public static void main(String args[]) {

		int[] list = { -1, 1, -1, 1 };

		solution(list);

	}

	public static int solution(int[] number) {
		int answer = 0;

		for (int i = 0; i < number.length - 2; i++) {
			for (int a = i + 1; a < number.length - 1; a++) {
				for (int c = a + 1; c < number.length; c++) {
					if (number[i] + number[a] + number[c] == 0) {
						answer++;
					}
				}

			}

		}

		return answer;
	}

}
