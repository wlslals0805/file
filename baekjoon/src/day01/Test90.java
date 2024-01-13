package day01;

import java.util.ArrayList;
import java.util.List;

public class Test90 {
	
	public static void main(String[] args) {
		
	
		
	}

	public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int last = yearning.length-1;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<photo.length;i++) {
        	int answer = 0;
        	for(int a=0;a<photo[i].length;a++) {
        		
        		for(int b=0;b<name.length;b++) {
        			
        			if(photo[i][a].equals(name[b])) {
        				
        				if(last<b) {
        					answer+=0;
        				}
        				else {
        					answer+=yearning[b];
        				}
        				
        				
        			}
        			
        			
        		}
        		
        	}
        	list.add(answer);
        }
        
        int[] result = new int[list.size()];
        
        for(int i=0;i<result.length;i++) {
        	result[i] = list.get(i);
        	
        }
        
        return result;
	}
}
