package day01;

import java.util.Arrays;

public class Test100 {
	
	public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
       for(int x : d) {
    	   
    	   budget-=x;
    	   if(budget>=0) {
    	   answer++;
           }
    	   else {
    		   break;
    	   }
    	   
       }
        
        
        return answer;
    }

}
