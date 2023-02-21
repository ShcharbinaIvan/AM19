package homeworks.home1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        //2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
        //Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев. А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
        //Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
        int percent = 7;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму вклада:");
        float sum1 = scan.nextFloat();
        System.out.println("Введите количество месяцев:");
        int month = scan.nextInt();
        for (int i = 1; i <= month; i++) {
            sum1 += sum1 * percent / 100;
        }
        System.out.println("Итоговая сумма: " + sum1);
        scan.close();
    }
}
