package day01;

public class Test132 {
	public int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];

		boolean not_exist = true;
		for (int i = 0; i < targets.length; i++) {
			int cnt = 0;

			for (int j = 0; j < targets[i].length(); j++) {

				String s = String.valueOf(targets[i].charAt(j));

				int min = Integer.MAX_VALUE;

				not_exist = true;
				for (int l = 0; l < keymap.length; l++) {
					int count = 0;
					boolean each_exist = false;
					for (int z = 0; z < keymap[l].length(); z++) {
						count++;
						if (String.valueOf(keymap[l].charAt(z)).equals(s)) {
							not_exist = false;
							each_exist = true;
							break;
						}

					}

					if (count < min && each_exist == true) {
						min = count;
					}

				}

				if (not_exist == true) {
					cnt -= 1;
					answer[i] = -1;
					break;
				} else {
					cnt += min;
					answer[i] = cnt;
				}
			}

		}

		return answer;
	}

}
