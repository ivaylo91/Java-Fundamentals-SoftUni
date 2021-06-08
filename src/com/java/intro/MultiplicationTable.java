package com.java.intro;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int product = 0;

        for (int i = 1; i <= 10 ; i++) {
            product =  number * i;
            System.out.printf("%d X %d = %d\n", number,i,product);

        }
    }
}
