package homeworks.home3;

public class Task3 {
    public static void main(String[] args) {
//        найдите сумму элементов на побочной диагонали.
        int[][] arr = {{1, 2, 3, 5}, {1, 2, 5, 4}, {1, 5, 3, 4}, {5, 2, 3, 4}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][arr.length - i - 1];

        }
        System.out.println("Сумма чисел " + sum);
    }
}
