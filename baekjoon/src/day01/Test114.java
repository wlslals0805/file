package day01;

public class Test114 {

	public int solution(int a, int b, int n) {
		int answer = 0;

		while (n >= a) {

			int rest = n % a;
			answer += (n / a) * b;
			n = n / a * b + rest;

		}

		return answer;
	}
}
