package homeworks.home10.task2;

import classworks.lesson13.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//   Создать коллекцию класса ArrayList со значениями имен всех студентов в группе
//  С помощью Stream'on:
//- Вернуть количество количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)
//- Выбрать все имена, начинающиеся на "а" (вне зависимости от Верхнего/нижнего регистра букв)
//- Отсортировать и вернуть первый элемент коллекции или "Empty@, если коллекция пуста
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = initStudents();
        System.out.println("Введите имя:");
        String str = scanner.nextLine().toLowerCase(Locale.ROOT);
        long quantity = studentList.stream()
                .map((e) -> e.getName().toLowerCase())
                .toList()
                .stream()
                .filter((s) -> s.equals(str))
                .count();
        System.out.println("Кол-во людей с эти именем: " + quantity);
        List<String> list = studentList.stream()
                .map(Student::getName)
                .toList()
                .stream()
                .filter((s) -> s.toLowerCase().startsWith("a"))
                .toList();
        System.out.println("имена, начинающиеся на \"а\" " + list);
        String list1 = studentList.stream()
                .map(Student::getName)
                .toList()
                .stream()
                .sorted()
                .findFirst().orElse("Empty@");
        System.out.println("Первый элемент коллекции: " + list1);


    }

    private static List<Student> initStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan"));
        studentList.add(new Student("David"));
        studentList.add(new Student("Sasha"));
        studentList.add(new Student("Nik"));
        studentList.add(new Student("Anton"));
        studentList.add(new Student("Andrei"));
        studentList.add(new Student("Nik"));
        studentList.add(new Student("Nik"));
        return studentList;
    }
}
