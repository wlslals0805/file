package day01;

import java.util.ArrayList;
import java.util.List;

public class Test150 {

	public int solution(int[][] lines) {
		int answer = 0;

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < lines.length; i++) {
			for (int j = lines[i][0]; j < lines[i][1]; j++) {

				if (list.contains(j)) {
					answer++;
					list.remove(list.indexOf(j));
				} else {
					list.add(j);
				}
			}
		}

		return answer;
	}

}
