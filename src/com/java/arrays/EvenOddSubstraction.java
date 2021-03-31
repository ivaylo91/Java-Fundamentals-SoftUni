package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubstraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int evenSum = 0;
        int oddSum = 0;
        int diff = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        diff = evenSum - oddSum;
        System.out.println(diff);
    }
}
