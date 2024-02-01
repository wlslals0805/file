package day01;

public class Test109 {
	
	 public String solution(int[] food) {
	        String answer = "";
	        
	        for(int i=1;i<food.length;i++){
	                
	                for(int a=0;a<food[i]/2;a++){
	                answer+=i;
	                }     
	        }
	        answer+="0";
	        
	          for(int i=food.length-1;i>=1;i--){
	                
	                for(int a=0;a<food[i]/2;a++){
	                answer+=i;
	                }     
	        }
	        
	        return answer;
	    }

}
