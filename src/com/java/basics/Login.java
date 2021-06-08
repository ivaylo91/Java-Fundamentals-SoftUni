package com.java.basics;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        StringBuilder reverse = new StringBuilder();

        int counter = 0;

        for (int i = 0; i < username.length(); i++) {
            reverse.append(username.charAt(username.length() - i - 1));
        }
        String password = input.nextLine();

        while (!password.equals(reverse.toString())) {
            counter++;
            if (counter > 3) {
                System.out.println(String.format("User %s blocked!", username));
                break;
            }
            System.out.println("Incorrect password. Try again.");
            password = input.nextLine();
        }
        if (counter <= 3) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
