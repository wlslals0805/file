package day01;

public class Test117 {

	public String solution(int a, int b) {
		String answer = "";

		int total = 0;

		for (int i = 1; i < a; i++) {

			if (i == 2) {
				total += 29;
			} else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				total += 31;
			} else {
				total += 30;
			}

		}
		total += b;

		String[] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		int n = 5;

		for (int i = 0; i < total; i++) {

			answer = day[n];
			n++;
			if (n > 6) {
				n = 0;
			}

		}

		return answer;
	}
	
	public String solution2(int a, int b) {
	    int[] daysOfMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    String[] dayOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
	    
	    int totalDays = b;
	    for (int i = 1; i < a; i++) {
	        totalDays += daysOfMonth[i];
	    }
	    
	    String answer = dayOfWeek[(totalDays - 1) % 7];
	    
	    return answer;
	}


}
