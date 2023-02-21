package homeworks.home1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //5. По введенному номеру определить цвет радуги (1- красный, 4-зеленый и т. д.).
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7 что бы узнать цвет радуги");
        int word = scan.nextInt();
        switch (word) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Жёлтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый ");
                break;
            default:
                System.out.println("В радуге такого цвета нету");
        }
    }
}
