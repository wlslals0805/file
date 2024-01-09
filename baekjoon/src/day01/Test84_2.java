package day01;

import java.util.Scanner;

public class Test84_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] list = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int a = 0; a < n; a++) {

				list[i][a] = sc.nextInt();

			}
		}

		System.out.println(solution(list, n));

	}

	static int solution(int[][] input, int n) {

		int result = 0;
		int[] dy = { 0, -1, 1, 0 };
		int[] dx = { 1, 0, 0, -1 };

		for (int i = 0; i < n; i++) {

			for (int a = 0; a < n; a++) {

				boolean answer = true;

				for (int c = 0; c < dy.length; c++) {

					if (i + dy[c] >= 0 && a + dx[c] >= 0 && i + dy[c] < n && a + dx[c] < n
							&& input[i][a] <= input[i + dy[c]][a + dx[c]]) {
						answer = false;
						c = dy.length - 1;
					}

				}

				if (answer) {
					result++;
				}

			}

		}

		return result;

	}
}
