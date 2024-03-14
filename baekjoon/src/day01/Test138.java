package day01;

public class Test138 {

	public int solution(int[] ingredient) {
		int answer = 0;

		StringBuilder sb = new StringBuilder();

		for (int x : ingredient) {

			sb.append(String.valueOf(x));

			if (sb.length() >= 4) {

				if (Integer.parseInt(String.valueOf(sb.charAt(sb.length() - 1))) == 1
						&& Integer.parseInt(String.valueOf(sb.charAt(sb.length() - 2))) == 3
						&& Integer.parseInt(String.valueOf(sb.charAt(sb.length() - 3))) == 2
						&& Integer.parseInt(String.valueOf(sb.charAt(sb.length() - 4))) == 1) {

					answer++;

					sb.delete(sb.length() - 4, sb.length());

				}

			}

		}

		return answer;
	}
}
