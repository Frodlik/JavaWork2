package org.example;

//Сформувати масив b з вихідного одновимірного масиву a за наступним алгоритмом:
//bi дорівнює кількості елементів із значенням, рівним ai в масиві a.

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Виберіть тип масиву: 1-масив чисел, 2-масив символів");
        if (sc.nextInt() == 1) {
            System.out.println("Введіть розмір масиву:");
            double[] array = new double[sc.nextInt()];
            System.out.println("Заповніть масив відповідними значеннями:");
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextDouble();
            }
            System.out.println("Результат виконання програми: ");
            System.out.println(Arrays.toString(numArrayB(array)));

        } else if (sc.nextInt() == 2) {
            System.out.println("Введіть розмір масиву:");
            char[] array = new char[sc.nextInt()];
            System.out.println("Заповніть масив відповідними значеннями:");
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.next().charAt(0);
            }
            System.out.println("Результат виконання програми: ");
            System.out.println(Arrays.toString(charArrayB(array)));
        }
    }

    public static int[] numArrayB(double[] arrayA){

        int[] arrayB = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            int counter = 0;
            for (int j = 0; j < arrayA.length; j++) {
                if (arrayA[i] == arrayA[j]) {
                    counter++;
                }
            }
            arrayB[i] = counter;
        }
        return arrayB;
    }

    public static int[] charArrayB(char[] arrayA){

        int[] arrayB = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            int counter = 0;
            for (int j = 0; j < arrayA.length; j++) {
                if (arrayA[i] == arrayA[j]) {
                    counter++;
                }
            }
            arrayB[i] = counter;
        }
        return arrayB;
    }
}
