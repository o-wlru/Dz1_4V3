package ru.sky.pro;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int number = 1;
        while (number <= 10) {
            if (number < 10) {
                System.out.print(number + " ");
                number++;
            }
            else {
                System.out.println(number);
                break;
            }
        }

        for (int i = 10; i >= 1; i--) {
            if (i == 1) {
                System.out.println(i);
                break;
            }
            else {
                System.out.print(i + " ");
            }
        }
        // Задание 2
        System.out.println("Задание 2");
        int fridayFirst = 2;
        for (int fridayToday = fridayFirst; fridayToday <= 30; fridayToday = fridayToday +7) {
            System.out.println("Сегодня пятница, " + fridayToday + " число. Пора готовить отчет");
        }

        // Задание 3
        System.out.println("Задание 3");
        int currentYear = 2021;
        int startYear = currentYear - 200;
        int finishYear = currentYear + 100;
        for (int i = startYear; i <= finishYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
        // Задание 4*
        System.out.println("Задание 4*");
        for (int i = 1; i <=30; i++) {
            if (i % 3 ==0 && i % 5 == 0) {
                System.out.println(i + ": ping-pong");
            }
            else if (i % 5 == 0) {
                System.out.println(i + ": pong");

            }
            else if (i % 3 ==0) {
                System.out.println(i + ": ping");
            }
            else {
                System.out.println(i + ":");
            }
        }

        // Задание 5*
        System.out.println("Задание 5*");
        int furstNumber = 0;
        int secondNumber = 1;
        int endString = 8;
        System.out.print(furstNumber + " " + secondNumber + " ");

        for (int i = 1; i <= endString; i++) {
            int nextNumber = furstNumber + secondNumber;
            System.out.print(nextNumber + " ");
            furstNumber = secondNumber;
            secondNumber = nextNumber;
        }

    }
}
