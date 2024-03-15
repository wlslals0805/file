package day01;

import java.util.ArrayList;
import java.util.List;

public class Test139 {

	public int solution(int[][] board, int[] moves) {
		int answer = 0;

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < moves.length; i++) {
			int c = moves[i]; // 크레인

			int cnt = 0;
			while (true) {

				if (board[0 + cnt][c - 1] != 0 || cnt >= board.length - 1) {
					break;
				} else {
					cnt++;

				}

			}
			;

			int doll = board[cnt][c - 1];
			board[cnt][c - 1] = 0;
			System.out.println(doll);

			if (doll != 0) {
				list.add(doll);
			}

			if (list.size() >= 2 && list.get(list.size() - 1) == list.get(list.size() - 2)) {
				list.remove(list.size() - 1);
				list.remove(list.size() - 1);
				answer = answer + 2;
			}

		}

		return answer;
	}

}
