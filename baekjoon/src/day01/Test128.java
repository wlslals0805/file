package day01;

import java.util.ArrayList;

public class Test128 {
	
	public int solution(String[] babbling) {
        int answer = 0;
        
        ArrayList<String> list = new ArrayList<>();
        
        list.add("aya");
        list.add("ye");
        list.add("woo");
        list.add("ma");
        
        
        for(int i=0;i<babbling.length;i++){
            
            String str = babbling[i];
            
          for(int j=0;j<list.size();j++){
             
              if(str.contains(list.get(j))){

                  str = str.replaceFirst(list.get(j), "%");
             
              }
              
          }
           
            boolean pass = true;
            for(char ch : str.toCharArray()){
                
            if(ch!='%'){
                pass=false;
            }
            }
            if(pass==true){
                answer++;
            }
        }
        
        return answer;
    }

}
