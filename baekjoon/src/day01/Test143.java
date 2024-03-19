package day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test143 {

	public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

		List<Integer> list = new ArrayList<>();
		List<Integer> sort_list = new ArrayList<>();

		for (int i = 0; i < data.length; i++) {

			if (ext.equals("code") && val_ext > data[i][0]) {
				list.add(i);
			} else if (ext.equals("date") && val_ext > data[i][1]) {
				list.add(i);
			} else if (ext.equals("maximum") && val_ext > data[i][2]) {
				list.add(i);
			} else if (ext.equals("remain") && val_ext > data[i][3]) {
				list.add(i);
			}
		}

		for (int i = 0; i < data.length; i++) {

			if (list.contains(i)) {

				if (sort_by.equals("code")) {

					sort_list.add(data[i][0]);

				} else if (sort_by.equals("date")) {
					sort_list.add(data[i][1]);
				} else if (sort_by.equals("maximum")) {
					sort_list.add(data[i][2]);
				} else {
					sort_list.add(data[i][3]);
				}
			}
		}

		Collections.sort(sort_list);

		int[][] answer = new int[sort_list.size()][4];

		for (int i = 0; i < answer.length; i++) {

			if (sort_by.equals("remain")) {
				for (int j = 0; j < data.length; j++) {
					if (list.contains(j) && data[j][3] == sort_list.get(i)) {

						for (int l = 0; l < data[j].length; l++) {
							answer[i][l] = data[j][l];
						}
					}
				}
			} else if (sort_by.equals("code")) {
				for (int j = 0; j < data.length; j++) {
					if (list.contains(j) && data[j][0] == sort_list.get(i)) {

						for (int l = 0; l < data[j].length; l++) {
							answer[i][l] = data[j][l];
						}
					}
				}
			} else if (sort_by.equals("date")) {
				for (int j = 0; j < data.length; j++) {
					if (list.contains(j) && data[j][1] == sort_list.get(i)) {

						for (int l = 0; l < data[j].length; l++) {
							answer[i][l] = data[j][l];
						}
					}
				}
			} else {
				for (int j = 0; j < data.length; j++) {
					if (list.contains(j) && data[j][2] == sort_list.get(i)) {

						for (int l = 0; l < data[j].length; l++) {
							answer[i][l] = data[j][l];
						}
					}
				}
			}

		}

		return answer;
	}

}
