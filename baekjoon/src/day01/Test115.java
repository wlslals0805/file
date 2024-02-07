package day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test115 {
	public List<Integer> solution(int k, int[] score) {

		List<Integer> list = new ArrayList<>();
		List<Integer> answer = new ArrayList<>();

		for (int i = 0; i < score.length; i++) {

			list.add(score[i]);

			Collections.sort(list);
			Collections.reverse(list);

			if (list.size() >= k) {
				list = list.subList(0, k);

			}

			answer.add(list.get(list.size() - 1));

		}

		return answer;
	}
}
