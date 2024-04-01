package day01;

import java.util.ArrayList;
import java.util.List;

public class Test156 {
	public List<String> solution(String my_str, int n) {

		List<String> list = new ArrayList<>();

		StringBuilder sb = new StringBuilder(my_str);

		while (sb.length() > 0) {

			String s = sb.substring(0, Math.min(n, sb.length()));

			list.add(s);

			sb.delete(0, Math.min(n, sb.length()));

		}

		return list;
	}
}
