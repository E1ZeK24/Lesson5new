package org.example;

import java.util.Scanner;

public class Task9 {
    public static boolean whatYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int year = console.nextInt();
        boolean eachYear = whatYear(year);
        if (whatYear(year)) {
            System.out.println("Високосный год.");
        } else {
            System.out.println("Не високосный год.");
        }

    }
}
