package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test111 {

	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];

		char[] alpList = new char[strings.length];

		List<String> list = new ArrayList<>();

		for (int i = 0; i < strings.length; i++) {

			alpList[i] = strings[i].charAt(n);
			list.add(strings[i]);
		}

		Arrays.sort(alpList);
		Collections.sort(list);

		for (int i = 0; i < strings.length; i++) {

			String result = "";
			char ch = alpList[i];

			for (int a = 0; a < list.size(); a++) {

				if (list.get(a).charAt(n) == ch) {
					result = list.get(a);
					list.remove(a);
					break;
				}

			}

			answer[i] = result;

		}

		return answer;
	}
	
	

	public String[] solution2(String[] strings, int n) {
	    Arrays.sort(strings, new Comparator<String>() {
	        @Override
	        public int compare(String s1, String s2) {
	            if (s1.charAt(n) == s2.charAt(n)) {
	                return s1.compareTo(s2);
	            } else {
	                return s1.charAt(n) - s2.charAt(n);
	            }
	        }
	    });

	    return strings;
	}


}
