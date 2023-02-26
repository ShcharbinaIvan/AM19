package homeworks.home3;


import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
//2. Умножение двух матриц
//Создайте два массива целых чисел размером 3х3 (две матрицы).
//Напишите программу для умножения двух матриц.
//Первый массив: {{1,0,0,0}, {0,1,0,0},{0,00,0}} Второй массив: {{1,2,3}, {1,1,1},{0,0,0),{2,1,0}}
//Ожидаемый результат: 123 111 000
        int[][] arr1 = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] arr2 = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };
        int a = arr1.length;
        int b = arr2[0].length;
        int c = arr2.length;
        int[][] arr3 = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int h = 0; h < c; h++) {
                    arr3[i][j] += arr1[i][h] * arr2[h][j];
                }
            }
        }
        System.out.println("Массив суммы " + Arrays.deepToString(arr3));


    }
}
