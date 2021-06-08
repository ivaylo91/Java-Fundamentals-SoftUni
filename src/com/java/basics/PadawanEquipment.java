package com.java.basics;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = input.nextDouble();
        int student = input.nextInt();
        double priceOfLightSabers = input.nextDouble();
        double priceOfRobes = input.nextDouble();
        double priceOfBelts = input.nextDouble();

        double percentOfLight = Math.ceil(student * 0.10);
        double freeBelts = Math.ceil(student / 6);

        double total = ((student + percentOfLight) * priceOfLightSabers) + (priceOfRobes * student) + ((student - freeBelts) * priceOfBelts);

        if (total <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", total - money);
        }


    }
}
