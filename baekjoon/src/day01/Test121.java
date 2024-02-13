package day01;

import java.util.ArrayList;
import java.util.List;

public class Test121 {

	public List<Integer> solution(int[] answers) {

		int[] pattern1 = { 1, 2, 3, 4, 5 };
		int[] pattern2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] pattern3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		List<Integer> answer = new ArrayList<>();

		int[] score = new int[3];

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == pattern1[i % pattern1.length]) {
				score[0]++;
			}
			if (answers[i] == pattern2[i % pattern2.length]) {
				score[1]++;
			}
			if (answers[i] == pattern3[i % pattern3.length]) {
				score[2]++;
			}

		}

		int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

		for (int i = 0; i < 3; i++) {

			if (score[i] == maxScore) {
				answer.add(i + 1);
			}

		}
		return answer;
	}

}
