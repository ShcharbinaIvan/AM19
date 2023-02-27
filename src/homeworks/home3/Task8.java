package homeworks.home3;

public class Task8 {
    public static void main(String[] args) {
//         Создайте двумерный массив. Выведите на консоль диагонали массива.
        int[][] arr = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Основная диагональ " + arr[i][i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Побочная диагональ " + arr[i][arr.length - i - 1]);
        }
    }
}



