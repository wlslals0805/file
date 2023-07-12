package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test06_1 {

	public static void main(String[] args) {
		//끝말잇기 게임
				Scanner sc = new Scanner(System.in);
				
				ArrayList<String> history = new ArrayList<>();
				history.add("자바");
				
				while(true) {
					String given = history.get(history.size()-1);//마지막 기록을 추출
					
					System.out.print(given + "! ");
					String input = sc.nextLine();
					
					if(input.matches("^[가-힣]{2,6}$") == false) 
						break;
					if(given.charAt(given.length()-1) != input.charAt(0)) 
						break;
					if(history.contains(input)) 
						break;
					
					//System.out.println("통과");
					history.add(input);
				}
				
				sc.close();
				
				System.out.println("게임 오버");
				
				System.out.println("<기록>");
//				for(int i=0; i < history.size(); i++) {
//					String word = history.get(i);
				for(String word : history) {
					System.out.println("→ " + word);
				}
	}

}
