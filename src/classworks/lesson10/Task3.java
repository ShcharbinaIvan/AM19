package classworks.lesson10;

import java.util.Scanner;

public class Task3 {
    //    Считайте с клавиатуры три строки. А затем:
//1. Выведите на экран третью строку в неизменном виде.
//2. Выведите на экран вторую строку, предварительно преобразовав ее к
//верхнему регистру.
//3. Выведите на экран первую строку, предварительно преобразовав ее к
//нижнему регистру.
//● для вывода результат используйте StringBuilder
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        String[] array = new String[3];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите строку:");
            array[i] = scan.next();
            if (i == 0) {
                array[i] = array[i].toLowerCase();
            } else if (i == 1) {
                array[i] = array[i].toUpperCase();
            }
            build.append(array[i]).append(" ");
        }
        System.out.println(build);
        scan.close();


    }
}
