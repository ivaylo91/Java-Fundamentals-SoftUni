package com.java.intro;

import java.util.Scanner;

public class TheaterPromotions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String typeOfDay = input.nextLine();
        int age = input.nextInt();
        double price = 0.0;

        if (typeOfDay.equals("Weekday")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 12;
            } else if (age > 18 && age <= 64) {
                price = 18;
            }
        } else if (typeOfDay.equals("Weekend")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 15;
            } else if (age > 18 && age <= 64) {
                price = 20;
            }
        } else if (typeOfDay.equals("Holiday")) {
            if ((age >= 0 && age <= 18)) {
                price = 5;
            } else if (age > 18 && age <= 64) {
                price = 12;
            } else if ((age > 64 && age <= 122)) {
                price = 10;
            }
        }
        if (price != 0) {
            System.out.println(price);
        } else {
            System.out.println("Error!");
        }
    }
}
