package homeworks.home8.task2;

import java.util.Scanner;

public class Main {
    //    2. Дана строка произвольной длины с произвольными словами.
//    Найти самое короткое слово в строке и вывести его на экран.
//    Найти самое длинное слово в строке и вывести его на экран.
//    Если таких слов несколько, то вывести последнее из них.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scan.nextLine();
        String[] words = str.split(" ");
        String max = "";
        String min = str;
        for (String word : words) {
            if (word.length() >= max.length()) {
                max = word;
            }
            if (word.length() <= min.length()) {
                min = word;
            }
        }
        System.out.println("Длинное слово: " + max);
        System.out.println("Короткое слово: " + min);
        scan.close();
    }
}
