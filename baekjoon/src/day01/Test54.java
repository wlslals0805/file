package day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test54 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		

		
		list.add("c=");
		list.add("c-");
		list.add("dz=");
		list.add("d-");
		list.add("lj");
		list.add("nj");
		list.add("s=");
		list.add("z=");
		
		String input = sc.next();
		
		int result = input.length();

		
		int count=0;

		for(int i = 0;i<list.size();i++) {
			String a = list.get(i);
			if(input.contains(a)) {

				
				int b = a.length()-1;
				
				result = result - b;
				
				
				
				

		}

			
			
		}
		System.out.println(result);
		
		
		
		
		
		
		}
		
		
	}


