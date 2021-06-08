package com.java.intro;

import java.util.Scanner;

public class ForeignLanguage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String countryName = input.nextLine();

        if (countryName.equals("USA")) {
            System.out.println("English");
        }else if (countryName.equals("England")){
            System.out.println("English");
        } else if (countryName.equals("Argentina")) {
            System.out.println("Spanish");
        } else if (countryName.equals("Spain")) {
            System.out.println("Spanish");
        } else if (countryName.equals("Mexico")) {
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }
    }
}
