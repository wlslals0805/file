package day01;

public class Test162 {
	
	//미완성
	
	public String solution(String polynomial) {
        String answer = "";
        
        char[] ch = polynomial.toCharArray();
        
        for(int j=0;j<ch.length;j++){
            
            int count =0;
            char x = ch[j];
            
            if(Character.isDigit(ch[j])){
                count = Integer.parseInt(String.valueOf(ch[j]))-1;
                x = ch[j+1];
            }
            
            if(!Character.isDigit(x)
               &&x!='+'
               &&!answer.contains(String.valueOf(x))
              &&x!=' '){
            for(int i=0;i<ch.length;i++){
                
                if(x == ch[i]){
                    count++;
                }
                
            }
               
                System.out.println("x="+x);
                answer+=String.valueOf(count)+x;
            }
            else{
                answer+=x;
            }
            
            
           
            
        }
        
        return answer;
    }

}
