package org.example;

import java.util.Scanner;

public class Task6 {
    public static void compare() {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();

        if (a >= 0) {

            System.out.print(" Положительное ");

        } else if (a < 0) {

            System.out.print(" Отрицательное ");
        }

    }

    public static void main(String[] args) {

        compare();
    }
}
