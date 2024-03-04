package day01;

public class Test108 {
	
	public static void main(String args[]) {
		
		String s = "one4seveneight";
		
		System.out.println(solution(s));
		
	}

	
	public static int solution(String s) {
        
        
        
        String[] alp = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        
        for(int i=0;i<alp.length;i++) {
        	
        	String str = alp[i];
        	
        	if(s.contains(alp[i])) {
        		
        		s = s.replaceAll(str, String.valueOf(i));
        	}
        	
        	
        }
        
        
        return Integer.parseInt(s);
    }
	
	public static int solution2(String s) {
	    String[] alp = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	    
	    for(int i = 0; i < alp.length; i++) {
	        s = s.replaceAll(alp[i], String.valueOf(i));
	    }
	    
	    return Integer.parseInt(s);
	}

	
}
