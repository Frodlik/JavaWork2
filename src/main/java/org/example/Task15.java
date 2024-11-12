package org.example;

//Виведіть на дисплей значення тих елементи масивів a і b, які є і в тому,
//і в іншому масиві (передбачається, що і масив a, і масив b є множинами,
//тобто кожен з них не містить елементів з однаковими значеннями).

import java.util.Arrays;

public class Task15 {

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4};
        System.out.println("ArrayA: " + Arrays.toString(arrayA));

        int[] arrayB = {3, 4, 5, 6, 7};
        System.out.println("ArrayB: " + Arrays.toString(arrayB));

        int[] commonElements = Task15.findCommonElements(arrayA, arrayB);
        System.out.print("Спільні елементи: ");
        for (int element : commonElements) {
            System.out.print(element + " ");
        }
    }

    public static int[] findCommonElements(int[] a, int[] b) {
        int[] temp = new int[Math.min(a.length, b.length)];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    temp[count++] = a[i];
                    break;
                }
            }
        }

        int[] result = new int[count];
        System.arraycopy(temp, 0, result, 0, count);

        return result;
    }
}
