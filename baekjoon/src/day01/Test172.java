package day01;

public class Test172 {

	public int solution(int n) {
		int answer = 0;

		String n_s = Integer.toBinaryString(n);
		answer = n + 1;

		int cnt1 = 0;

		for (int i = 0; i < n_s.length(); i++) {
			if (n_s.charAt(i) == '1') {
				cnt1++;
			}
		}

		while (true) {
			int num = answer;
			String next_s = Integer.toBinaryString(num);
			int cnt = 0;

			for (int i = 0; i < next_s.length(); i++) {
				if (next_s.charAt(i) == '1') {
					cnt++;
				}
			}

			if (cnt1 == cnt) {

				break;
			} else {
				answer++;
			}

		}
		return answer;
	}

}
