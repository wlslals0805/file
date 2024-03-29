package day01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test118 {

	public int solution(int[] nums) {

		int n = nums.length / 2;
		int max = 0;
		for (int i = 0; i <= nums.length - n; i++) {
			System.out.println(nums[i] + " " + i);
			for (int j = i + 1; j + n - 1 <= nums.length; j++) {

				List<Integer> list = new ArrayList<>();
				int answer = 0;
				list.add(nums[i]);
				answer++;
				for (int l = j; l < j + n - 1; l++) {

					if (!list.contains(nums[l])) {
						answer++;
					}
					list.add(nums[l]);

				}

				System.out.println(list);
				max = Math.max(answer, max);
			}

		}

		return max;
	}
	


	public int solution2(int[] nums) {
	    int n = nums.length / 2;
	    
	    Set<Integer> uniqueNums = new HashSet<>();
	    for (int num : nums) {
	        uniqueNums.add(num);
	    }
	    
	    return Math.min(uniqueNums.size(), n);
	}


}
