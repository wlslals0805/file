package day01;

import java.util.ArrayList;
import java.util.List;

public class Test146 {

	public List<String> solution(String[] quiz) {
		

		List<String> list = new ArrayList<>();

		for (int i = 0; i < quiz.length; i++) {

			String[] str = quiz[i].split(" ");

			if (str[1].equals("-")) {

				if (Integer.parseInt(str[0]) - Integer.parseInt(str[2]) == Integer.parseInt(str[4])) {
					list.add("O");
				} else {
					list.add("X");
				}
			} else {

				if (Integer.parseInt(str[0]) + Integer.parseInt(str[2]) == Integer.parseInt(str[4])) {
					list.add("O");
				} else {
					list.add("X");
				}

			}

		}

		return list;
	}

}
