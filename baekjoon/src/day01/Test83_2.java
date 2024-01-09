package day01;


import java.util.Scanner;

public class Test83_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[][] list = new int[num][num];

		for (int i = 0; i < num; i++) {
			for (int a = 0; a < num; a++) {

				list[i][a] = sc.nextInt();

			}
		}
		System.out.println(solution(list));

	}

	static int solution(int[][] input) {

		int n = input.length;


		int result = 0;

		for (int i = 0; i < n; i++) {
			int sum1 = 0;
			int sum2 = 0;
			for (int a = 0; a < n; a++) {

				sum1 += input[i][a];
				sum2 += input[a][i];

			}
			result = Math.max(sum1, result);
			result = Math.max(sum2, result);
		}

		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < n; i++) {

				sum1+=input[i][i];
				sum2+=input[i][n-1-i];
				
				
		}
		result = Math.max(sum1, result);
		result = Math.max(sum2, result);

		return result;
	}
}
