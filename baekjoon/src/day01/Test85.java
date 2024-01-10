package day01;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test85 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] list = new int[n][5];

		for (int i = 0; i < n; i++) {
			for (int a = 0; a < 5; a++) {
				list[i][a] = sc.nextInt();
			}
		}
		System.out.println(solution(n, list));

	}

	static int solution(int n, int[][] input) {

		int size = 0;
		int max = 0;

		for (int i = 0; i < n; i++) {
			Set<Integer> set = new TreeSet<>();
			set.add(i);
			for (int a = 0; a < 5; a++) {// 학년

				for (int b = 0; b < n; b++) {// 학생

					if (input[b][a] == input[i][a]) {

						set.add(b);
					}
				}
			}

			if (size < set.size()) {

				max = i;
				size = set.size();

			}

		}

		return max + 1;
	}

}
