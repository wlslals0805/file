package day01;

public class Test124 {

	public int solution(int[] nums) {
		int answer = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int l = j + 1; l < nums.length; l++) {

					int sum = nums[i] + nums[j] + nums[l];
					boolean result = true;
					for (int k = 2; k <= Math.sqrt(sum); k++) {
						if (sum % k == 0) {
							result = false;
							break;
						}
					}
					if (result == true) {
						answer++;
					}

				}
			}
		}
		return answer;
	}

}
