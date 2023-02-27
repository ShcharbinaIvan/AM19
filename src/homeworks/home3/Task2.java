package homeworks.home3;

public class Task2 {
    public static void main(String[] args) {
//        найдите сумму элементов на главной диагонали.
        int[][] arr = {{2, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 2, 4}, {1, 2, 3, 2}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("Сумма чисел " + sum);
    }
}
