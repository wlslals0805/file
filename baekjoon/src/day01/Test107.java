package day01;

import java.util.ArrayList;
import java.util.List;

public class Test107 {
	
public List<Integer> solution(String s) {
        
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            
            char ch = s.charAt(i);
            int result = -1;
            for(int a=0;a<i;a++){
                
                if(s.charAt(a)==ch){
                    
                    result = i-a;
                    
                }
                
            }
            answer.add(result);
        }
        
        return answer;
    }

}
