package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] symbols = input.nextLine().split(" ");

        for (int i = symbols.length - 1; i >= 0; i--) {
            System.out.print(symbols[i] + " ");
        }

    }
}
