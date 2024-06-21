package org.example;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите значение len: ");
        int len = console.nextInt();
        System.out.print("Введите значение initialValue: ");
        int initialValue = console.nextInt();

        int[] myArray = createArray(len, initialValue);

        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        return array;
    }
}

