package homeworks.home2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //4. Создайте массив из n случайных целых чисел и выведите его на
        //экран
        //Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
        //Если и не удовлетворяет условию выведите сообщение об этом. Если пользователь ввёл не подходящее число, то программа должна
        //просить пользователя повторить ввод.
        //Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[0];
        int count = 0;
        int index = 0;
        while (true) {
            System.out.println("Введите размер массива от 5 до 10 включительно");
            int answer = scan.nextInt();
            if (answer >= 5 && answer <= 10) {
                arr = new int[answer];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = rand.nextInt(20);
                    if (arr[i] % 2 == 0) {
                        count++;
                    }
                }
                break;
            } else {
                System.out.println("Неправильно введено");
            }
        }
        System.out.println("Массив" + Arrays.toString(arr));
        int[] arr2 = new int[count];
        System.out.println("Массив 2 " + arr2.length);
        if (count != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    arr2[index] = arr[i];
                    index++;
                }
            }
            System.out.println("Массив четных чисел:" + Arrays.toString(arr2));
        }
    }
}
