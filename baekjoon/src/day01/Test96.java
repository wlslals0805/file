package day01;

import java.util.Arrays;

public class Test96 {
	
	public static void main(String[] args) {
		
		String s = "hellO";
		
		 String answer = "";
	        
	        char[] list = s.toCharArray();
			
			Arrays.sort(list);
	      
	        
	        StringBuilder sb = new StringBuilder(new String(list));
	        
	        sb.reverse();
	        
	        
		
		System.out.println(sb.toString());
		
		
	}

}
