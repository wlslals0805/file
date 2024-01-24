package day01;

public class Test102 {
	
	public static void main(String args[]) {
		
		System.out.println(solution2("3141592","271"));
		
	}
	
	class Solution {
	    public int solution(String t, String p) {
	        int answer = 0;
	        int length = p.length();
	        
	        
	        if(length==1){
	            String s = "";
	            for(int i=0;i<t.length();i++){
	                
	                s+=t.charAt(i);
	          if(Long.parseLong(s)<=Long.parseLong(p)){
	                answer++;
	            }
	                s="";
	                
	            }
	            
	           
	            
	        }
	        else{
	        for(int i=0;i<=t.length()-length;i++){
	            int c=i;
	            String s = "";
	            for(int a=0;a<length;a++){
	                
	                s+= t.charAt(c);
	                c++;
	                
	            }
	            if(Long.parseLong(s)<=Long.parseLong(p)){
	                answer++;
	            }
	            
	        }
	        }
	        
	        return answer;
	    }
	}
	
	 public static int solution2(String t, String p) {
	        int answer = 0;
	       
	        for(int i=0;i<=t.length()-p.length();i++){
	            
	            String s = t.substring(i,i+p.length());
	            
	            if(Integer.parseInt(s)<=Integer.parseInt(p)){
	                
	                answer++;
	            }
	            
	        }
	        
	        return answer;
	    }

}
