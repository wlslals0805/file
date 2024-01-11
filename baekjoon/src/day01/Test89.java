package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test89 {
	

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		String[][] list = new String[n][m];
		
		for(int i=0;i<n;i++) {
			String input= sc.next();
			for(int a=0;a<m;a++) {
				list[i][a] = String.valueOf(input.charAt(a));
			}
		}
		
	
		
		System.out.println(solution(list));
		
		
	}
	
	static int solution(String[][] input) {
		int n = input.length;
		int m = input[0].length;
		int result = 0;
		
		int redIndex1 = 0;
		int redIndex2 = 0;
		
		for(int i=0;i<n;i++) {
			for(int a=0;a<m;a++) {
				if(input[i][a].equals("R")) {
					redIndex1 = i;
					redIndex2 = a;
					
				}
			}
		}
		
		List<String> way =new ArrayList<String>();
		
		int origin1=redIndex1;
		int origin2=redIndex2;
		
		way.add(" ");
		while(true) {
			int up=0;
			int down=0;
			int right=0;
			int left=0;
			int max=0;
			
			int origin3=redIndex1;
			int origin4=redIndex2;
			
			System.out.println("redIndex1="+redIndex1+" redIndex2="+redIndex2);
			if(input[redIndex1][redIndex2+1].equals("O")||
					input[redIndex1][redIndex2-1].equals("O")||
					input[redIndex1+1][redIndex2].equals("O")||
					input[redIndex1-1][redIndex2].equals("O")) {
				
				if(redIndex1==origin1&&redIndex2==origin2) {
				result ++;}
				break;
			}
			
			else if(input[redIndex1][redIndex2+1].equals(".")&&!way.get(way.size()-1).equals("right")) {
				right++;
				while(input[redIndex1][origin4+right].equals(".")) {
					
					
					right++;
				
				}
		}
			else if(input[redIndex1][redIndex2-1].equals(".")&&!way.get(way.size()-1).equals("left")) {
				left--;
				while(input[redIndex1][origin4+left].equals(".")) {
					
					left--;
					
					
				}
				
				
			}
			else if(input[redIndex1+1][redIndex2].equals(".")&&!way.get(way.size()-1).equals("up")) {
				down++;
				while(input[origin3+down][redIndex2].equals(".")) {
					
					down++;
					
				}
			}
			else if(input[redIndex1-1][redIndex2].equals(".")&&!way.get(way.size()-1).equals("down")) {
				up--;
				while(input[origin3+up][redIndex2].equals(".")) {
					up--;
				}
			}
			System.out.println("right="+right);
			int tmp1 = Math.max(Math.abs(left), right);
			int tmp2 = Math.max(Math.abs(left), down);
			max = Math.max(tmp1, tmp2);
			System.out.println(max);
			if(max==Math.abs(left)) {
				redIndex2=origin4+left+1;
				way.add("right");
				result++;
			}
			else if(max==right) {
				redIndex2=origin4+right-1;
				way.add("left");
				result++;
			}
			else if(max==Math.abs(up)){
				redIndex1=origin3+up+1;
				way.add("down");
				result++;
			}
			else if(max==down) {
				redIndex1=origin3+down-1;
				way.add("up");
				result++;
			}
			
			
			
		
		}
		
		
		return result;
		
	}

}
