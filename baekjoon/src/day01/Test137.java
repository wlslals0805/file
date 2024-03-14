package day01;

public class Test137 {
	public int solution(String[][] board, int h, int w) {
		int answer = 0;

		int[] dh = { 0, 1, -1, 0 };
		int[] dw = { 1, 0, 0, -1 };

		for (int i = 0; i < dh.length; i++) {

			int h_index = h + dh[i];
			int w_index = w + dw[i];

			if (h_index >= 0 && h_index < board.length && w_index >= 0 && w_index < board[0].length) {

				if (board[h_index][w_index].equals(board[h][w])) {
					answer++;
				}

			}

		}

		return answer;
	}
}
