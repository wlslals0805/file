package day01;

import java.util.Scanner;

public class Test157 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        
        String result = "";
        
        for(int i =0;i<a.length();i++){
            
            char ch = a.charAt(i);
            
       
            
            if(Character.isLowerCase(ch)) {
            	
            	result+=String.valueOf(ch).toUpperCase();
            	
            }
            else {
            	result+=String.valueOf(ch).toLowerCase();
            }
            
        }
        System.out.println(result);
    }
}
