package day01;

import java.awt.dnd.DragSourceListener;
import java.awt.image.AbstractMultiResolutionImage;
import java.util.Scanner;

public class Test74 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.next());
		String input = sc.next();
		String[] str = new String[num];
		int a = 0;
		
		for(int i=0;i<num;i++) {
			
			str[i] = input.substring(a, a+7);
			a+=7;
			str[i] = str[i].replaceAll("[#]", "1");
			str[i] = str[i].replaceAll("[*]", "0");
		}
		
			
	System.out.println(solution(str));
		
	}
	
	static String solution(String[] str) {

		int[] codeList = new int[str.length];
		String result = "";
		
		for(int i=0;i<str.length;i++) {
			int cnt = str[i].length()-1;
			for(int a=0;a<str[i].length();a++) {
				if(cnt == 0) {
				codeList[i] += 1*Integer.parseInt(String.valueOf(str[i].charAt(a)));
				cnt--;
				} 
				else {
					codeList[i]+=(Math.pow(2, cnt))*Integer.parseInt(String.valueOf(str[i].charAt(a)));
					cnt--;
				}
			}
			result = result + (char) codeList[i];
		}
		return result;
	}
	
	
	
	
}
