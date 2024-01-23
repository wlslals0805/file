package day01;

public class Test101 {
	
	public static void main(String args[]) {
		
		String s= "hello fuck you";
		System.out.println(solution(s));
		
	}

	public static String solution(String s) {
        String answer = "";
        
        int index = 0;
        
        
        
        
        for(char x : s.toCharArray()){
        	
            
            String s2 = String.valueOf(x);
            
            if(index%2==0){
                answer+=s2.toUpperCase();
                 index++;
            }
            else{
            	
            	answer+=s2.toLowerCase();
            	index++;
            	
            }
            
            if(!Character.isAlphabetic(x)){
            	index=0;
            }
            
           
            
        }
        
        return answer;
    }
}
