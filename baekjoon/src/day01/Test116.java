package day01;

public class Test116 {

	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";

		int c1 = 0;
		int c2 = 0;

		for (int i = 0; i < goal.length; i++) {

			String str = goal[i];

			System.out.println(str);
			if (c1 < cards1.length && cards1[c1].equals(str)) {
				c1++;

			} else if (c2 < cards2.length && cards2[c2].equals(str)) {
				c2++;

			} else {
				answer = "No";
				break;
			}

		}

		return answer;
	}
	
	public String solution2(String[] cards1, String[] cards2, String[] goal) {
	    String answer = "Yes";

	    int indexCards1 = 0;
	    int indexCards2 = 0;

	    for (int i = 0; i < goal.length; i++) {
	        String currentGoalCard = goal[i];
	        
	        if (indexCards1 < cards1.length && cards1[indexCards1].equals(currentGoalCard)) {
	            indexCards1++; 
	        } else if (indexCards2 < cards2.length && cards2[indexCards2].equals(currentGoalCard)) {
	            indexCards2++; 
	        } else {
	            return "No"; 
	        }
	    }

	    return answer;
	}


}
