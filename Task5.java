package org.example;

import java.util.Scanner;

public class Task5 {
    public static void compare() {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();

        int sum = a + b;
        if (sum >= 10 && sum <= 20) {

            System.out.print(" true ");

        } else {

            System.out.print(" false ");
        }

    }

    public static void main(String[] args) {

        compare();
    }
}
