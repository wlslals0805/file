package day01;

import java.util.ArrayList;
import java.util.List;

public class Test160 {

	public List<Integer> solution(int[][] score) {

		List<Double> score_list = new ArrayList<>();
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < score.length; i++) {

			score_list.add((score[i][0] + score[i][1]) / (double) 2);

		}

		for (int i = 0; i < score_list.size(); i++) {

			int count = 1;
			double sc = score_list.get(i);

			for (int j = 0; j < score_list.size(); j++) {
				if (sc < score_list.get(j)) {
					count++;
				}
			}

			result.add(count);

		}

		return result;
	}
}
