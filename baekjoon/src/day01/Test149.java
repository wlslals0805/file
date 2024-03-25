package day01;

public class Test149 {

	public int solution(int[][] board) {

		int[] dx = { -1, 0, 1, -1, 1, -1, 0, 1 };
		int[] dy = { -1, -1, -1, 0, 0, 1, 1, 1 };

		int answer = 0;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {

				if (board[i][j] == 1) {

					for (int l = 0; l < dx.length; l++) {
						if (i + dy[l] >= 0 && j + dx[l] >= 0 && i + dy[l] < board.length
								&& j + dx[l] < board[i].length) {

							if (board[i + dy[l]][j + dx[l]] != 1) {
								board[i + dy[l]][j + dx[l]] = 2;
							}

						}

					}

				}

			}

		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 0) {
					answer++;
				}

			}

		}

		return answer;
	}
}
