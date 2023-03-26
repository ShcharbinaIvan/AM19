package homeworks.home9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        Напишите программу, которая принимает строку в качестве входных данных и подсчитывает,
//        сколько раз каждый символ встречается в этой строке.
//        Для хранения количества встреч символов используйте HashMap, где ключ - символ,
//        а значение - количество встреч.
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        String text = scan.nextLine();
        text = text.toLowerCase();
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            Character uniqueChars = text.charAt(i);
            Integer countOfUniqueChars = result.get(uniqueChars);
            if (countOfUniqueChars == null) {
                countOfUniqueChars = 1;
                result.put(uniqueChars, countOfUniqueChars);
            } else {
                countOfUniqueChars += 1;
                result.put(uniqueChars, countOfUniqueChars);
            }
        }
        System.out.println(result);
        scan.close();

    }
}
