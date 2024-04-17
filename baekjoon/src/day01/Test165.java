package day01;

public class Test165 {

	public String solution(String my_string, String overwrite_string, int s) {

		StringBuilder sb = new StringBuilder(my_string);

		sb.replace(s, overwrite_string.length() + s, overwrite_string);

		return sb.toString();
	}

	public String solution2(String my_string, String overwrite_string, int s) {

		StringBuilder sb = new StringBuilder();

		int index = 0;

		for (int i = 0; i < my_string.length(); i++) {

			if (i >= s && overwrite_string.length() + s > i) {

				sb.append(overwrite_string.charAt(index));
				index++;

			} else {
				sb.append(my_string.charAt(i));
			}

		}

		return sb.toString();
	}

}
