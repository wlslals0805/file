package day01;

import java.util.Scanner;

public class Test54_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int index = 0;
        int count = 0;

        while (index < input.length()) {
            char currentChar = input.charAt(index);

            if (currentChar == 'c' || currentChar == 'd' || currentChar == 'l' || currentChar == 'n' || currentChar == 's' || currentChar == 'z') {
                if (index + 1 < input.length()) {
                    char nextChar = input.charAt(index + 1);
                    if (currentChar == 'c' && (nextChar == '=' || nextChar == '-')) {
                        index += 2;
                    } else if (currentChar == 'd' && nextChar == 'z') {
                        if (index + 2 < input.length() && input.charAt(index + 2) == '=') {
                            index += 3;
                        } else {
                            index++;
                        }
                    } else if ((currentChar == 'l' || currentChar == 'n') && nextChar == 'j') {
                        index += 2;
                    } else if (currentChar == 's' || currentChar == 'z') {
                        if (nextChar == '=') {
                            index += 2;
                        } else {
                            index++;
                        }
                    } else {
                        index++;
                    }
                } else {
                    index++;
                }
            } else {
                index++;
            }
            count++;
        }

        System.out.println(count);
    }
}