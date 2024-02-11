package day01;

import java.util.ArrayList;
import java.util.List;

public class Test119 {

	public int solution(int[] nums) {

		List<Integer> answer = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {

			if (!answer.contains(nums[i])) {
				answer.add(nums[i]);
			}

		}
		return Math.min(answer.size(), nums.length / 2);
	}

}
