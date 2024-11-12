package org.example;

//Визначте (у відсотках від загальної кількості елементів),
// скільки елементів в масиві a мають значення менше, ніж середнє значення,
// скільки елементів - значення, рівне середньому значенню і скільки елементів мають значення,
// більше, ніж середнє значення.

import java.util.Arrays;

public class Task20 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array20: " + Arrays.toString(array));

        double[] percentages = calculatePercentage(array);
        System.out.println("Елементів менше середнього: " + String.format("%.2f", percentages[0]) + "%");
        System.out.println("Елементів рівно середньому: " + String.format("%.2f", percentages[1]) + "%");
        System.out.println("Елементів більше середнього: " + String.format("%.2f", percentages[2]) + "%");
    }

    public static double[] calculatePercentage(int[] a) {
        double sum = 0;
        for (int num : a) {
            sum += num;
        }
        double average = sum / a.length;

        int lessCount = 0, equalCount = 0, greaterCount = 0;
        for (int num : a) {
            if (num < average) lessCount++;
            else if (num == average) equalCount++;
            else greaterCount++;
        }

        double[] percentages = new double[3];
        percentages[0] = (lessCount * 100.0) / a.length;
        percentages[1] = (equalCount * 100.0) / a.length;
        percentages[2] = (greaterCount * 100.0) / a.length;

        return percentages;
    }
}
