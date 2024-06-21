package org.example;

import java.util.Scanner;

public class Task7 {
    public static void compare() {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();

        if (a >= 0) {

            System.out.print(" true ");

        } else if (a < 0) {

            System.out.print(" false ");
        }

    }

    public static void main(String[] args) {

        compare();
    }
}
