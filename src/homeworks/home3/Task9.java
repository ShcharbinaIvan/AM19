package homeworks.home3;

import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
// Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.
        Random rand = new Random();
        int[][] arr = new int[3][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(30);
            }
        }
        System.out.println("Массив " + Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        System.out.println("Отсортированный массив " + Arrays.deepToString(arr));
    }
}
