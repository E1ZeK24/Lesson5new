package org.example;

import java.util.Scanner;

public class Task8 {
    public static void printTextTools() {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        String b = "Возьмите в лабу, пожалуйста!";
        {
            for (int c = 0; c < a; c++) {
                System.out.println(b);
            }
        }
    }

    public static void main(String[] args) {

        printTextTools();
    }
}
