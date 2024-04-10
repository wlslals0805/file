package day01;

import java.util.ArrayList;
import java.util.List;

public class Test154 {
	public List<Integer> solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
      
        for (int num = 0; num <= r; num++) {
            if (isValid(num) && num >= l && num <= r) {
                list.add(num);
            }
        }
        
        
        if (list.isEmpty()) {
            list.add(-1);
        }
        
        return list;
    }
    
   
    private boolean isValid(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
