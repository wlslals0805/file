package day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test110 {

	public List<Integer> solution(int[] array, int[][] commands) {

		List<Integer> answer = new ArrayList<>();

		for (int i = 0; i < commands.length; i++) {

			List<Integer> list = new ArrayList<>();

			for (int a = commands[i][0] - 1; a <= commands[i][1] - 1; a++) {

				list.add(array[a]);

			}

			Collections.sort(list);

			answer.add(list.get(commands[i][2] - 1));

		}

		return answer;
	}
}
