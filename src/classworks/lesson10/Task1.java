package classworks.lesson10;

import java.util.Scanner;

public class Task1 {
    //    Ввести n строк с консоли, найти самую короткую и самую длинную строки.
//Вывести найденные строки и их длину.
//● для вывода результат используйте StringBuilder
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько будет строк?");
        int length = scan.nextInt();
        String[] arrayStr = new String[length];
        String shortString = null;
        String longString = null;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arrayStr.length; i++) {
            System.out.println("Введите строку №:" + (i + 1));
            arrayStr[i] = scan.next();
            if (min > arrayStr[i].length()) {
                min = arrayStr[i].length();
                shortString = arrayStr[i];
            }
            if (max < arrayStr[i].length()) {
                max = arrayStr[i].length();
                longString = arrayStr[i];
            }
        }
        stringBuilder.append(shortString).append(min).append(longString).append(max);
        System.out.println(stringBuilder);
        scan.close();


    }
}
