package homeworks.home1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //3. Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.
        // Для определения четности числа используйте операцию получения остатка от деления операция выглядит так: 2').
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число");
        int word = scan.nextInt();
        if (word % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }
        scan.close();
    }
}
