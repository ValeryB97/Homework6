import java.time.Year;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Задание 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        // Задание 3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        // Задание 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        // Задание 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            if (Year.isLeap(i)) {
                System.out.println(i + " Год является високосным");
            }
        }
            // Задание 6
            for (int i = 7; i <= 98; i = i + 7) {
                System.out.println(i);
            }
            // Задание 7
            for (int i = 1; i <= 512; i = i * 2) {
                System.out.println(i);
            }
            // Задание 8
            int deposit = 29000;
            int annualSavings = 0;
            for (int i = 1; i <= 12; i++) {
                annualSavings = annualSavings + deposit;
                System.out.println("Месяц " + i + " Сумма накоплений равна  " + annualSavings);
            }
            // Задание 9
            for (int i = 1; i <= 12; i++) {
                annualSavings = annualSavings + deposit;
                annualSavings = annualSavings + annualSavings / 100;
                System.out.println("Месяц " + i + " Сумма накоплений равна  " + annualSavings);
            }
            // Задание 10
            int number = 2;
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + number * i);
            }
        }
    }