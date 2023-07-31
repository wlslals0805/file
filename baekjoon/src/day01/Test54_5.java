package day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test54_5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		

		
		list.add("c=");
		list.add("c-");
		list.add("dz=");
		list.add("lj");
		list.add("nj");
		list.add("s=");
		list.add("c=");
		list.add("z=");
		
		String input = sc.next();
		
		int result = input.length();

		
		int count=0;
		String b="";
		boolean in = true;
		
		for(int r = 0; r< input.length();r++) {

		
				

									
		if(in) {
			input = input.substring(b.length(), input.length());
			count++;
		}
		else {
			input = input.substring(1, input.length());
			count++;
		}
		}
		
		System.out.println(count);
		
		
		
		
	}
		
		
		
		
	}


