package day01;

public class Test167 {
	
	 public String solution(String s) {
	        String answer = "";
	        
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;
	        
	        String[] s_list = s.split(" ");
	        
	        for(int i=0;i<s_list.length;i++){
	            
	            int num = Integer.parseInt(s_list[i]);
	            
	           
	            
	            if(num>max){
	                max = num;
	            }
	            if(num<min){
	                min = num;
	            }
	            
	        }
	        
	        answer+=String.valueOf(min);
	        answer+=" ";
	        answer+=String.valueOf(max);
	        
	        
	        return answer;
	    }

}
