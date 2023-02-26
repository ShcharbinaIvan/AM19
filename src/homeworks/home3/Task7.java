package homeworks.home3;

public class Task7 {
    public static void main(String[] args) {
//         Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.
        int sum = 0;
        int[][] arr = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Сумма " + sum);
    }
}
