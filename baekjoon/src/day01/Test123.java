package day01;

import java.util.ArrayList;
import java.util.List;

public class Test123 {

	public int solution(int[] nums) {
		int answer = -1;

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i + 2 < nums.length; i++) {

			for (int l = i + 1; l + 1 < nums.length; l++) {

				int result = 0;
				result = result + nums[i];

				for (int j = l; j < l + 2; j++) {

					result = result + nums[j];

				}
				list.add(result);
			}

		}

		return answer;
	}

}
