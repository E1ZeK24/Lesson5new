package org.example;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();

        int[][] array = new int[a][a];

        for (int i = 0; i < a; i++) {
            array[i][i] = 1;
        }

        for (int i = 0; i < a; i++) {
            for (int b = 0; b < a; b++) {
                System.out.print(array[i][b] + " ");
            }
            System.out.println();
        }
    }
}
