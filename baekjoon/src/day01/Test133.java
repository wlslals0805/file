package day01;

import java.util.ArrayList;
import java.util.List;

public class Test133 {

	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		List<Integer> lost_list = new ArrayList<>();

		for (int i = 0; i < lost.length; i++) {

			lost_list.add(lost[i]);
		}

		for (int i = 0; i < reserve.length; i++) {

			
				for (int j = 0; j < lost_list.size(); j++) {

					if (reserve[i] - 1 == lost_list.get(j) || reserve[i] + 1 == lost_list.get(j)) {
						answer++;
						lost_list.remove(j);

					}

				

			}
		}
		answer += n - lost.length;

		return answer;
	}
}
