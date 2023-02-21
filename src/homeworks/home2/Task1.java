package homeworks.home2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том, входит ли заданное число в массив или нет.
        //Пусть число для поиска задается с консоли (класс Scanner).
        boolean q = false;
        int[] array = {1, 2, -5, 4, 5, 6, 7, 8, 9, 10};
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = scan.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                q = true;
                break;
            }
        }
        if (q) {
            System.out.println("Входит в массив");
        } else {
            System.out.println("Не входит в массив");
        }
        scan.close();
    }
}

