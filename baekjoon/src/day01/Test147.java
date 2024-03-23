package day01;

public class Test147 {

	public int solution(int[] common) {
		int answer = 0;

		int result = common[common.length - 1] - common[common.length - 2];

		boolean pass = true;	//등차수열이다
		
		for (int i = common.length - 1; i > 0; i--) {

			if (common[i] - common[i - 1] != result) {

				pass = false;	//등차수열이 아니다
			}

		}

		if (pass) {
			answer = common[common.length - 1] + result;
		} else {
			answer = common[common.length - 1] * (common[common.length - 1] / common[common.length - 2]);
		}

		return answer;
	}
}
