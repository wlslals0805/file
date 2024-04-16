package day01;

import java.util.ArrayList;
import java.util.List;

public class Test160 {

	


	    public List<Integer> solution(int[][] score) {
	        int n = score.length;
	        List<Double> averages = new ArrayList<>();
	        List<Integer> ranks = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            double average = (score[i][0] + score[i][1]) / 2.0;
	            averages.add(average);
	        }

	        for (int i = 0; i < n; i++) {
	            int rank = 1;
	            for (int j = 0; j < n; j++) {
	                if (averages.get(i) < averages.get(j)) {
	                    rank++;
	                }
	            }
	            ranks.add(rank);
	        }

	        return ranks;
	    }
	

}
