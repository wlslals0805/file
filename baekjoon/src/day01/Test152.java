package day01;

public class Test152 {

	public int solution(String A, String B) {
		

		int length = A.length();
		int start = 1;

		if (A.equals(B)) {
			return 0;
		}

		while (start < length) {
			StringBuilder sb = new StringBuilder();

			for (int i = A.length() - start; i < A.length(); i++) {
				sb.append(A.charAt(i));
			}

			for (int i = 0; i < A.length() - start; i++) {

				sb.append(A.charAt(i));

			}

			if (sb.toString().equals(B)) {
				break;
			}

			start++;

		}

		if (start == length) {
			return -1;
		}

		return start;
	}

}
