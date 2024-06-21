package org.example;

public class Task2 {

    public static void checkSumSign() {
        int a = 5;
        int b = 12;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void main(String[] args) {

        checkSumSign();
    }
}
