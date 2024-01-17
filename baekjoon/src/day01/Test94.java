package day01;


public class Test94 {
	
	  public int solution(int[] numbers) {
	        int answer = 0;

	        for(int i=0;i<=9;i++) {
	        	boolean contain=false;
	        	for(int a=0;a<numbers.length;a++) {
	        		
	        		if(i==numbers[a]) {
	        			contain=true;
	        			break;
	        		}
	        	
	        	}
	        	
	        	if(contain==false) {
	        		answer+=i;
	        	}
	        	
	        	
	        }
	       
	        
	        return answer;
	        
	        
	    }

}
