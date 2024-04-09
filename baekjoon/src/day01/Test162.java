package day01;

public class Test162 {
	
	 public String solution(String polynomial) {
	        String[] terms = polynomial.split(" \\+ ");
	        int constant = 0;
	        int xCoefficient = 0;

	        
	        for (String term : terms) {
	            if (term.contains("x")) {
	                
	                int index = term.indexOf("x");
	                String coefficient = term.substring(0, index);
	                if (coefficient.equals("")) {
	                    xCoefficient += 1;
	                } else {
	                    xCoefficient += Integer.parseInt(coefficient);
	                }
	            } else {
	              
	                constant += Integer.parseInt(term);
	            }
	        }

	       
	        StringBuilder result = new StringBuilder();
	        if (xCoefficient > 0) {
	            if (xCoefficient > 1) {
	                result.append(xCoefficient);
	            }
	            result.append("x");
	            if (constant > 0) {
	                result.append(" + ");
	            }
	        }
	        if (constant > 0) {
	            result.append(constant);
	        }

	        return result.toString();
	    }

}
