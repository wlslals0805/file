package day01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	public int solution2(int[] nums) {
	    Set<Integer> uniqueNums = new HashSet<>();

	    for (int num : nums) {
	        uniqueNums.add(num);
	    }

	    return Math.min(uniqueNums.size(), nums.length / 2);
	}
}
