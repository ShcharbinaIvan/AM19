package homeworks.home3;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
//        найдите максимальное значение в 2-мерном массиве.
        Random rand = new Random();
        int[][] arr = new int[5][5];
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(100);
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
            System.out.println(Arrays.toString(arr[i]));

        }
        System.out.println("наибольшее число" + max);


    }
}
