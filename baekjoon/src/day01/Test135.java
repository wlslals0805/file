package day01;

import java.util.Arrays;

public class Test135 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";

		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < participant.length; i++) {

			if (i == participant.length - 1 || !participant[i].equals(completion[i])) {
				answer += participant[i];
				break;
			}

		}
		return answer;
	}
}
