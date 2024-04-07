package day01;

public class Test161 {
	public String solution(String[] id_pw, String[][] db) {
		String answer = "";

		String id = id_pw[0];
		String pw = id_pw[1];

		boolean id_pass = false;

		for (int i = 0; i < db.length; i++) {

			if (id.equals(db[i][0]) && pw.equals(db[i][1])) {
				return "login";
			}
			if (id.equals(db[i][0])) {
				id_pass = true;
			}

		}

		if (id_pass == true) {
			answer = "wrong pw";
		} else {
			answer = "fail";
		}

		return answer;
	}
}
