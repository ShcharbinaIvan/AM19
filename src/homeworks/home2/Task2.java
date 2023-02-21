package homeworks.home2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
        //Пусть число задается с консоли (класc Scanner). Если такого числа нет -
        //выведите сообщения об этом.
        //В результате должен быть новый массив без указанного числа.
        int[] arr2 = null;
        int[] arr1 = {1, 2, -5, 4, 5, 6, 7, 8, 9, 10};
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = scan.nextInt();
        System.out.println("Текущий массив " + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == number) {
                arr2 = new int[arr1.length - 1];
                for (int j = 0; j < i; j++) {
                    arr2[j] = arr1[j];
                }
                for (int h = i; h < arr1.length - 1; h++) {
                    arr2[h] = arr1[h + 1];
                }
            }
        }
        System.out.println("Новый маасссив:" + Arrays.toString(arr2));
        scan.close();
    }
}
