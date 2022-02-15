package ru.geekbrains.lesson1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() { //три слова в столбик
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSing() { //проверка на неотрицательное число
        int numberOne = -13;
        int numberTwo = 5;
        int sum = numberOne + numberTwo;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    private static void printColor() { //сравниваем в каком диапозоне лежит число
        int value = 0;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }

    }

    private static void compareNumbers() { //сравнение чисел
        int numberOne = 55;
        int numberTwo = -55;

        if (numberOne >= numberTwo) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }


}
