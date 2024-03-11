package day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test133 {

	public static List<Integer> arrayList(int[] list) {

		List<Integer> arrayList = new ArrayList<>();

		for (int i = 0; i < list.length; i++) {

			arrayList.add(list[i]);

		}

		return arrayList;

	}

	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n;

		List<Integer> lost_list = arrayList(lost);
		List<Integer> reserve_list = arrayList(reserve);
		List<Integer> intersect_list = new ArrayList<>(lost_list);

		intersect_list.retainAll(reserve_list);
		reserve_list.removeAll(intersect_list);
		lost_list.removeAll(intersect_list);

		Collections.sort(reserve_list);
		Collections.sort(lost_list);

		for (int i = 0; i < reserve_list.size(); i++) {

			for (int j = 0; j < lost_list.size(); j++) {

				if (reserve_list.get(i) - 1 == lost_list.get(j) || reserve_list.get(i) + 1 == lost_list.get(j)) {
					lost_list.remove(j);
					break;
				}

			}
		}
		answer -= lost_list.size();

		return answer;
	}
}
