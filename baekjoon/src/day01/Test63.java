package day01;

import java.util.Scanner;

public class Test63 {
	
	public static void main(String[] args) {
		   Scanner in=new Scanner(System.in);
		    String input1 = in.nextLine();
		    String input2 = in.nextLine();
		    
		    input1  = input1.toLowerCase();
		    int result = 0;
		    
		    for(int i=0;i<input1.length();i++){
		      
		    	String a = String.valueOf(input1.charAt(i));
		    	
		    	
		      if(a.equalsIgnoreCase(input2)) {
		    	  
		    	  result++;
		      }
		    }
		    
		    System.out.println(result);
		
		
	}

}
