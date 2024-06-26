package day01;

public class Test158 {
	public static int not_three(int n) {

		String s = String.valueOf(n);

		if (n == 3 || n % 3 == 0 || s.contains("3")) {
			n++;
		}

		return n;

	}

	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {

			answer++;

			int origin = answer;

			while (true) {
				answer = not_three(answer);

				if (origin != answer) {
					origin = answer;
					answer = not_three(answer);
				}

				if (origin == answer) {
					break;
				}
			}

		}

		return answer;
	}
	
	
	    public static int notThree(int n) {
	        while (n % 3 == 0 || String.valueOf(n).contains("3")) {
	            n++;
	        }
	        return n;
	    }

	    public int solution2(int n) {
	        int count = 0;
	        int number = 0;

	        while (count < n) {
	            number++;
	            if (notThree(number) == number) {
	                count++;
	            }
	        }

	        return number;
	    
	}

}
