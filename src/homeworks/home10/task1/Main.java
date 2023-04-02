package homeworks.home10.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//  1. Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа Integer.
//С помощью Stream'on:
//- Удалить дубликаты
//- Вывести все четные элементы в диапазоне от 7 до 17
//(включительно)
//- Каждый элемент умножить на 2
//- Отсортировать и вывести на экран первых 4 элемента
//- Вывести количество элементов в стриме
//- Вывести среднее арифметическое всех чисел в стриме
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(rand.nextInt(1, 25));
        }
        System.out.println(list);
        List<Integer> list1 = list.stream()
                .distinct()
                .toList();
        System.out.println(list1);
        List<Integer> list2 = list.stream()
                .filter((e) -> e > 7 && e < 17 && (e % 2 == 0))
                .toList();
        System.out.println(list2);
        List<Integer> list3 = list.stream()
                .map((e) -> e * 2)
                .toList();
        System.out.println(list3);
        List<Integer> list4 = list.stream()
                .sorted()
                .limit(4)
                .toList();
        System.out.println(list4);
        long list5 = list.stream().count();
        System.out.println(list5);
        double list6 = list.stream()
                .mapToInt(a -> a)
                .average().orElse(0);
        System.out.println(list6);
    }
}
