package day01;

public class Test136 {
	public String solution(String s, String skip, int index) {

		String result = "";

		for (char x : s.toCharArray()) {

			for (int i = 0; i < index; i++) {
				x++;
				if (x > 'z') {
					x = 'a';
				}
				if (skip.contains(String.valueOf(x))) {
					i--;
				}
			}
			result += x;
		}
		return result;
	}
}
