package day01;

public class Test122 {

	public int solution(int number, int limit, int power) {
		int answer = 0;

		int[] list = new int[number];

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					list[i - 1]++;
					if (i / j > Math.sqrt(i)) {
						list[i - 1]++;
					}
				}
			}
		}

		for (int i = 0; i < list.length; i++) {

			if (list[i] > limit) {
				answer += power;
			} else {
				answer += list[i];
			}

		}

		return answer;
	}
	
	public int solution2(int number, int limit, int power) {
	    int answer = 0;

	    for (int i = 1; i <= number; i++) {
	        int divisorCount = 0;
	        
	        for (int j = 1; j * j <= i; j++) {
	            if (i % j == 0) {
	                divisorCount++; // j는 i의 약수
	                if (j * j != i) { // i/j도 다른 약수
	                    divisorCount++;
	                }
	            }
	        }

	        if (divisorCount > limit) {
	            answer += power;
	        } else {
	            answer += divisorCount;
	        }
	    }

	    return answer;
	}


}
