package org.example;

//Визначте номер дня у місяці та номер місяця року по заданому номеру
// дня в році (вводиться як аргумент при виклику програми).
// Ознака, чи є рік високосним, задається як булевська змінна. Вказівка:
// кількість днів до початку цього місяця (НЕ високосний рік): січень - 0, лютий - 31,
// березень - 59, квітень - 90, травень -120, червень - 151, липень - 181, серпень - 212,
// вересень - 243, жовтень - 273, листопад - 314, грудень - 334 задати у вигляді масиву.
// У високосному році, починаючи з березня, до кількості днів додається 1.

public class Task25 {

    public static void main(String[] args) {
        int dayOfYear = 60; // 60-й день року
        boolean isLeapYear = true; // Високосний рік
        String date = findDate(dayOfYear, isLeapYear);
        System.out.println(date);
    }

    public static String findDate(int dayOfYear, boolean isLeapYear) {
        int[] daysInMonths = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

        if (isLeapYear) {
            for (int i = 2; i < daysInMonths.length; i++) {
                daysInMonths[i]++;
            }
        }

        int month = 0;
        for (int i = 1; i < daysInMonths.length; i++) {
            if (dayOfYear <= daysInMonths[i]) {
                month = i;
                break;
            }
        }

        int day = dayOfYear - daysInMonths[month - 1];
        return "День: " + day + ", Місяць: " + month;
    }
}
