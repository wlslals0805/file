package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test80_2 {
//	N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
//
//	예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
//
//	첫 자리부터의 연속된 0은 무시한다.
//
//
//	입력
//	첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
//
//	각 자연수의 크기는 100,000를 넘지 않는다.
//
//
//	출력
//	첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[] list = new int[num];

		for (int i = 0; i < num; i++) {
			list[i] = sc.nextInt();

		}
		System.out.println(solution(list));
	}

	public static boolean add(int input) {

		if (input == 1) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(input); i++) {

				if (input % i == 0) {
					return false;

				}

			}
		}

		return true;
	}

	static String solution(int[] input) {

		String result = "";

		for (int x : input) {

			int tmp = x;
			int answer = 0;
			while (tmp > 0) {

				int t = tmp % 10;
				answer = answer * 10 + t;
				tmp = tmp / 10;

			}

			if (add(answer)) {

				result += answer + " ";
			}

		}
		return result;
	}
}
