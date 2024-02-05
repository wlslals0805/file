package day01;

import java.util.ArrayList;
import java.util.List;

public class Test113 {
	public List<String> solution(int n, int[] arr1, int[] arr2) {

		List<String> list = new ArrayList<>();

		String[] arr3 = new String[arr1.length];
		String[] arr4 = new String[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			String result = "";
			String r = "";
			for (int b = 0; b < arr1.length; b++) {

				int a = arr1[i] % 2;
				arr1[i] = arr1[i] / 2;
				result = a + result;

				int c = arr2[i] % 2;
				arr2[i] = arr2[i] / 2;
				r = c + r;
			}
			arr3[i] = result;
			arr4[i] = r;
		}

		for (int i = 0; i < arr1.length; i++) {
			String result = "";

			for (int a = 0; a < arr1.length; a++) {

				if (arr3[i].charAt(a) == '0' && arr4[i].charAt(a) == '0') {

					result += " ";
				} else {
					result += "#";
				}

			}
			list.add(result);
		}

		return list;
	}

}
