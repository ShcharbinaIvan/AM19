package homeworks.home3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        0. Создать трехмерный массив из целых чисел.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
// Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int[][][] arr = new int[5][5][5];
        System.out.println("Введите число на которое увеличить");
        int number = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int h = 0; h < arr[i][j].length; h++) {
                    arr[i][j][h] = rand.nextInt(5);
                    arr[i][j][h] += number;
                }
                System.out.println(Arrays.toString(arr[i][j]));
            }

        }
    }
}
