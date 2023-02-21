package homeworks.home1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //3. Напишите программу, где пользователь вводит любое целое положительное число.
        // А программа суммирует все числа от 1 до введенного пользователем числа.
        // Для ввода числа воспользуйтесь классом Scanner.
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое положительное целое число.");
        int number = scan.nextInt();
        for (int i = 0; i <= number; i++) {
            count += i;
        }
        System.out.println("Сумма чисел: " + count);
        scan.close();
    }
}
