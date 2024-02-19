package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test120 {

	public int solution(int k, int m, int[] score) {
		int answer = 0;

		Arrays.sort(score);

		int index = score.length - 1;

		int count = score.length / m;

		for (int j = 0; j < count; j++) {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < m; i++) {

				list.add(score[index]);

				index--;

			}

			answer += m * list.get(list.size() - 1);
		}

		return answer;
	}
	
	

	public int solution2(int k, int m, int[] score) {
	    int answer = 0;
	    Arrays.sort(score);

	    int groups = score.length / m; 

	    for (int j = 0; j < groups; j++) {
	      
	        int lastElementIndex = score.length - 1 - j * m; 
	        answer += m * score[lastElementIndex];
	    }

	    return answer;
	}

}
