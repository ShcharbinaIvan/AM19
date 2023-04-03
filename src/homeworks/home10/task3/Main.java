package homeworks.home10.task3;

import java.util.Scanner;

public class Main {
    //    3. Создать обобщенный функциональный интерфейс.
//Написать класс с одним методом.
//В этом методе реализуйте логику:
//- если в консоль введена цифра 1, то: использования интерфейса со строковым типом и передать в метод интерфейса
// логику реверса строки (вывода строки в обратном порядке).
//- если в консоль введена цифра 2, то: использования интерфейса с целочисленным типом и передать в метод интерфейса
// логику нахождения факториала числа.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int answ = scan.nextInt();
        operation(answ);
        scan.close();
    }

    static void operation(int answ) {
        Scanner scanner = new Scanner(System.in);
        if (answ == 1) {
            System.out.println("Введите строку для реверса");
            String str = scanner.nextLine();
            FirstInterface<String> operation1 = () -> new StringBuilder(str).reverse().toString();
            System.out.println("Реверс строки:" + operation1.giveAnswer());
            scanner.close();
        } else if (answ == 2) {
            System.out.println("Введите число для вычисления факториала");
            int number = scanner.nextInt();
            FirstInterface<Integer> operation2 = () -> {
                int res = 1;
                for (int i = 1; i <= number; i++) {
                    res = res * i;
                }
                return res;
            };
            System.out.println("Факториал:" + operation2.giveAnswer());
            scanner.close();
        }
    }
}
