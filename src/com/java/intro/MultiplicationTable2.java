    package com.java.intro;

    import java.util.Scanner;

    public class MultiplicationTable2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            int multiplier = input.nextInt();
            int product = 0;
            for (int i = multiplier; i <= 10; i++) {
                product = number * i;
                System.out.printf("%d X %d = %d\n", number,i,product);
            }
            if(multiplier > 10){
                product = number * multiplier;
                System.out.printf("%d X %d = %d\n", number,multiplier,product);
            }
        }
    }
