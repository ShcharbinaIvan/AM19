package homeworks.home2;

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        //Рефлизуйте алгоитм сортировки пузырьком
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Массив до сортировки " + Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++)
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//        }
        Arrays.sort(arr);
        System.out.println("Массив после сортировки"+Arrays.toString(arr));
    }
}
