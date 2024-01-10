package day01;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test85_2 {

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

		int max = Integer.MIN_VALUE;
		int cnt = 0;
		int result = 0;

		for (int i = 0; i < n; i++) {// 같은 반이 존재하는지 검사하려는 학생 번호
			cnt = 0;
			for (int a = 0; a < n; a++) {// 학생 번호 순회

				for (int b = 0; b < 5; b++) {// 학년

					if (input[i][b] == input[a][b]) {// i는 멈춤 상태, a는 순회 중 둘이 같은 반일시
						cnt++; // i 학생과 같은 반이었던 학생의 수가 올라감
						break; // 이미 같은 반으로 카운트된 학생은 더이상 셀 필요가 없음(중복 제외기 때문) a가 다음으로 넘어간다.(다음 학생)
					}
				}

				if (cnt > max) {
					max = cnt;
					result = i + 1;
				}

			}

		}

		return result;
	}

}
