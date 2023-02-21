package homeworks.home2;

import java.util.Arrays;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        //Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
        // Для генерации случайного числа используйте метод Math.random().
        // Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли.
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длинну массива:");
        int number = scan.nextInt();
        double[] arr = new double[number];
        double sum = 0;
        double min = arr[0];
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 20;
        }
        System.out.println("Массив:" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i]<min) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное "+max);
        System.out.println("Минимальное "+min);
        System.out.println("Среднее "+(sum/arr.length));

    }
}
