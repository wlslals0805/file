package day01;

import java.util.ArrayList;
import java.util.List;

public class Test129 {
	public int solution(String dartResult) {
        int answer = 0;
        List<String> strList = new ArrayList<>();
        char[] ch = dartResult.toCharArray();
        
        for(int i=0;i<ch.length;i++){
            
            String str = String.valueOf(ch[i]);
            
            if(Character.isDigit(ch[i])){
                
                if(ch[i+1]=='0'){
                    strList.add("10");
                    i=i+1;
                }
                else{
                    strList.add(str);
                }
                
            }
            else{
                strList.add(str);
            }
            
        }
  
        List<Integer> list = new ArrayList<>();
        
      
        
        for(int i=0;i<strList.size();i++){

            String s = strList.get(i);
           
            if(s.matches("\\d+")){
                
                if(strList.get(i+1).equals("S")){
                    list.add(Integer.parseInt(s));
                    answer+=Integer.parseInt(s);
                }
                else if(strList.get(i+1).equals("D")){
                    list.add(Integer.parseInt(s)*Integer.parseInt(s));
                    answer+=Integer.parseInt(s)*Integer.parseInt(s);
                }
                else if(strList.get(i+1).equals("T")){
                    list.add(Integer.parseInt(s)*Integer.parseInt(s)*Integer.parseInt(s));
                   answer+=Integer.parseInt(s)*Integer.parseInt(s)*Integer.parseInt(s); 
                }
    
            }
            else if(s.equals("*")){
                answer-=list.get(list.size()-1);
                answer+=list.get(list.size()-1)*2;
                
                if(i>3){
                    
                    if(strList.get(i-3).equals("*")){
                    answer-=list.get(list.size()-2)*2;
                    answer+=list.get(list.size()-2)*4;
                    }
                    else if(strList.get(i-3).equals("#")){
                        answer-=list.get(list.size()-2);
                       
                    }
                    else{
                    answer-=list.get(list.size()-2);
                    answer+=list.get(list.size()-2)*2;
                    }
                }
            }
            else if(s.equals("#")){
                answer-=list.get(list.size()-1)*2;
                
            }
            
           
            
        }
        
        return answer;
    }
}
