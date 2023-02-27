package homeworks.home3;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
//        1. Шахматная доска
//Создать программу для раскраски шахматной доски с помощью цикла.
// Создать двумерный массив String'ов 8х8.
// С помощью циклов задать элементам циклам значения B(Black) или W(White).
        String[][] arr = new String[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + j) % 2 != 0) {
                    arr[i][j] = "B";
                } else {
                    arr[i][j] = "W";
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
