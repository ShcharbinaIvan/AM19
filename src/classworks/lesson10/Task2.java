package classworks.lesson10;

import java.util.Scanner;

public class Task2 {
    //    Ввести n строк с консоли. Вывести на консоль те строки, длина которых
//больше средней, а также длину.
//● для вывода результат используйте StringBuilder
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько будет строк?");
        int length = scan.nextInt();
        String[] arrayStr = new String[length];
        System.out.println("Введите среднее значение длинны:");
        int average = scan.nextInt();
        for (int i = 0; i < arrayStr.length; i++) {
            System.out.println("Введите строку №:" + (i + 1));
            arrayStr[i] = scan.next();
            if (arrayStr[i].length() > average) {
                build.append(arrayStr[i]).append(arrayStr[i].length());
            }
        }
        System.out.println(build);
        scan.close();
    }
}
