package com.java.intro;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i < 2*n; i++) {
            if (i % 2 !=0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.printf("Sum of odd numbers is: %d", sum);
    }
}
