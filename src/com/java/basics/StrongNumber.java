package com.java.basics;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        int parseNumber = Integer.parseInt(input);

        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            int lastNum = parseNumber % 10;
            parseNumber = parseNumber / 10;

            int fact = 1;

            for (int j = 1; j <= lastNum; j++) {
                fact = fact * j;
            }
            result += fact;
        }
        if (result == Integer.parseInt(input)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
