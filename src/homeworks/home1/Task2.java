package homeworks.home1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //2. Написать программу для вывода названия поры года по номеру
        //месяца.
        //При решении используйте оператор if-else-if.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of month:");
        int word = sc.nextInt();
        if (word == 12 || word == 1 || word == 2) {
            System.out.println("Winter");
        } else if (word == 3 || word == 4 || word == 5) {
            System.out.println("Spring");
        } else if (word == 6 || word == 7 || word == 8) {
            System.out.println("Summer");
        } else if (word == 9 || word == 10 || word == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Not found");
        }
        sc.close();
    }
}
