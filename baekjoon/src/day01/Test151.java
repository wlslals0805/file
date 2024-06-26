package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test151 {
	public List<Integer> solution(int[] numlist, int n) {

		List<Integer> list = new ArrayList<>();

		list.add(numlist[0]);

		for (int i = 1; i < numlist.length; i++) {

			int d_num = Math.abs(numlist[i] - n);
			boolean addition = false;

			for (int j = 0; j < list.size(); j++) {

				if (Math.abs(list.get(j) - n) >= d_num) {

					if (Math.abs(list.get(j) - n) == d_num && list.get(j) > numlist[i]) {
						list.add(j + 1, numlist[i]);

					} else {
						list.add(j, numlist[i]);
					}
					addition = true;
					break;
				}

			}
			if (addition == false) {
				list.add(numlist[i]);
			}
		}

		return list;
	}
	

	public class Solution2 {
	    public List<Integer> solution(int[] numlist, int n) {
	        Comparator<Integer> comp = (a, b) -> {
	            int diffA = Math.abs(a - n);
	            int diffB = Math.abs(b - n);
	            if (diffA == diffB) {
	                return a - b;
	            }
	            return diffA - diffB;
	        };

	        List<Integer> sortedList = Arrays.stream(numlist)
	                                         .boxed()
	                                         .sorted(comp)
	                                         .collect(Collectors.toList());

	        return sortedList;
	    }
	}

}
