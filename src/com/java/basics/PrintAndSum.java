package com.java.basics;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
