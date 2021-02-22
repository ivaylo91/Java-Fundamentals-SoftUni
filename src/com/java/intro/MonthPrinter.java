package com.java.intro;

import java.util.Scanner;

public class MonthPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int monthNumber = input.nextInt();
        String[] months = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };
        if (monthNumber <= months.length - 1) {
            System.out.println(months[monthNumber - 1]);
        } else {
            System.out.println("Error!Invalid input");
        }
    }

}
