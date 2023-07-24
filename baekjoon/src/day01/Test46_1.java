package day01;

import java.util.Scanner;

public class Test46_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String input = sc.next();
            
            StringBuilder result = new StringBuilder();

            for (int a = 0; a < input.length(); a++) {
                for (int b = 0; b < r; b++) {
                    result.append(input.charAt(a));
                }
            }

            System.out.println(result);
        }
        
        sc.close();
    }
}