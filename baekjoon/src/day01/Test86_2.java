package day01;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test86_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] list = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int a = 0; a < n; a++) {
				list[i][a] = sc.nextInt();
			}
		}

		System.out.println(solution(list));
	}

	static int solution(int[][] list) {

		int n = list[0].length; // 학생 수
		int m = list.length; // 테스트 횟수
		int result = 0;

		for (int i = 0; i < n; i++) {
			int os = 0; // 멘토 등수
			int es = 0; // 멘티 등수
			for (int a = 0; a < n; a++) {
				int cnt = 0;
				for (int b = 0; b < m; b++) {
					for (int c = 0; c < n; c++) {
						if (list[b][c] == i + 1) {
							os = c;
						}
						if (list[b][c] == a + 1) {
							es = c;
						}
					}
					if (os > es) {
						cnt++;
					}
				}
				if (cnt >= m) {
					result++;
				}
			}

		}

		return result;
	}

}
