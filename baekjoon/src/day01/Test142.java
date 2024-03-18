package day01;

public class Test142 {
	public String solution(String new_id) {

		String edit_str = new_id.replaceAll("[^A-Za-z0-9-_.]", "");

		StringBuilder sb = new StringBuilder();

		char[] ch = edit_str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			char x = ch[i];

			if (Character.isUpperCase(x)) {
				sb.append(Character.toLowerCase(x));
			} else if (x == '.' && sb.length() < 0) {
				sb.append("");
			} else if (x == '.' && sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
				sb.append("");
			} else if (x == ' ') {
				sb.append("a");
			} else {
				sb.append(x);
			}

			if (sb.charAt(0) == '.') {
				sb.deleteCharAt(0);
			}

		}

		if (sb.length() >= 16) {
			sb.delete(15, sb.length());
		}

		while (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {

			sb.deleteCharAt(sb.length() - 1);
		}

		if (sb.length() <= 0) {
			sb.append("a");
		}

		while (sb.length() <= 2) {

			sb.append(sb.charAt(sb.length() - 1));

		}

		return sb.toString();
	}
}
