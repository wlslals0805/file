package day01;

public class Test95 {
	
	public String solution(String phone_number) {
	       String answer = "";
	        
	        answer = phone_number.substring(0, phone_number.length()-4).replaceAll("[0-9]", "*");
	
         answer+=phone_number.substring(answer.length());
 
	        return answer;
	    }

}
