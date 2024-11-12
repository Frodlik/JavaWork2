package org.example;

//Визначити, чи є всі елементи вихідного одновимірного масиву a негативними величинами,
// чи вони всі позитивні або серед елементів a є як позитивні, так і негативні величини,
// і вивести відповідні повідомлення для кожного випадку.

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть розмір масиву: ");
        int size = sc.nextInt();
        double[] arr = new double[size];

        System.out.println("Введіть числа для масиву через пробіл: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextDouble();
        }
        System.out.println(analyzeArray(arr));
    }

    public static String analyzeArray(double[] a) {
        boolean hasPositive = false;
        boolean hasNegative = false;

        for (double num : a) {
            if (num > 0) hasPositive = true;
            if (num < 0) hasNegative = true;
        }

        if (hasPositive && hasNegative) {
            return "Масив містить як позитивні, так і негативні величини.";
        } else if (hasPositive) {
            return "Масив містить лише позитивні величини.";
        } else {
            return "Масив містить лише негативні величини.";
        }
    }
}
