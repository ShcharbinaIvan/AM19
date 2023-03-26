package homeworks.home10;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
//        Напишите программу, которая принимает массив целых чисел и находит все пары чисел,
//        сумма которых равна заданному числу.
//        Используйте HashMap для хранения чисел и их индексов в массиве, где ключ - число,
//        а значение - его индекс. (Доп)
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        Map<Integer, Integer> result = new HashMap<>();
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1, 20);
        }
        System.out.println("Введите число:");
        int number = scan.nextInt();
        System.out.println(Arrays.toString(arr));
        for (int k : arr) {
            int counter = 0;
            int difference = number - k;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == difference) {
                    counter = j;
                }
            }
            if (counter > 0) {
                result.put(k, counter);
                System.out.println("число:" + k);
                System.out.println("индекс:" + counter);
            }
        }
        System.out.println(result);
        scan.close();
    }
}
