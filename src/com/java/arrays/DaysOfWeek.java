package com.java.arrays;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        String[] daysOfWeek = new String[]{
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        if (day >= 0 && day <= 7) {
            System.out.println(daysOfWeek[day]);
        } else {
            System.out.println("Invalid Day");
        }
    }
}
