package day01;

public class Test99 {
	
	public static void main(String args[]) {
		
		int num = 45;
		
		System.out.println(solution2(num));
		
	}
	
	
	public int solution(int n) {

        String answer = Integer.toString(n,3);
        
        StringBuilder sb = new StringBuilder(answer);
        
        sb.reverse();
        
        int result = Integer.parseInt(sb.toString(),3);

        return result;
    }
	
	
	public static int solution2(int n) {
		
		String s = "";
		
		while(n>0) {
			s+=n%3;
			n = n/3;
		}
		
		int length = s.length();
		
		int result = 0;
		
		for(int i=0;i<length;i++) {
			
			result+=Integer.parseInt(String.valueOf(s.charAt(length-1-i)))*Math.pow(3, i);
			
		}
	
		
		return result;
		
	}
	
	

}
