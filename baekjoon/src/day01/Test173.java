package day01;

public class Test173 {

	 public int solution(String s)
	    {
	    StringBuilder sb = new StringBuilder();
	        
	        sb.append(" ");
	      
	        for(char x : s.toCharArray()){
	            if(sb.length()>0){
	            if(sb.charAt(sb.length()-1)!=x){
	            sb.append(x); 
	              
	            }
	             else{            
	                 sb.delete(sb.length()-1,sb.length());                
	               }
	        }
	        }
	        
	      sb.deleteCharAt(0);
	        
	        return sb.length()== 0 ? 1 : 0;
	    }

}
