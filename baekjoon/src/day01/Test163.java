package day01;

import java.util.Arrays;

public class Test163 {
	//
	 public int[] solution(int N, int[] stages) {
	        int[] stageReached = new int[N + 1]; 
	        int[] stageFailed = new int[N + 1]; 

	        for (int stage : stages) {
	            if (stage <= N) {
	                stageFailed[stage]++;
	            }
	            for (int i = 1; i <= stage && i <= N; i++) {
	                stageReached[i]++;
	            }
	        }

	        Stage[] failRates = new Stage[N];
	        for (int i = 1; i <= N; i++) {
	            float failRate = (stageReached[i] > 0) ? (float) stageFailed[i] / stageReached[i] : 0;
	            failRates[i - 1] = new Stage(i, failRate);
	        }

	        Arrays.sort(failRates, (s1, s2) -> {
	            if (s1.failRate > s2.failRate) return -1;
	            else if (s1.failRate < s2.failRate) return 1;
	            else return Integer.compare(s1.stageNumber, s2.stageNumber);
	        });

	        int[] result = new int[N];
	        for (int i = 0; i < N; i++) {
	            result[i] = failRates[i].stageNumber;
	        }

	        return result;
	    }
	    
	    static class Stage {
	        int stageNumber;
	        float failRate;
	        
	        public Stage(int stageNumber, float failRate) {
	            this.stageNumber = stageNumber;
	            this.failRate = failRate;
	        }
	    }
}
