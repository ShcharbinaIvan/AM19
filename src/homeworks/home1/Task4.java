package homeworks.home1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //4. Для введенного числа (температура на улице) вывести Если t>-5, то вывести «Тепло».
        //Если -5>= t> -20, то вывести «Нормально». Если -20>=t, то вывести «Холодно.
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите температуру на улице");
        double word = scan.nextDouble();
        if (word >= (-5)) {
            System.out.println("Тепло");
        } else if (word <= (-5) && word > (-20)) {
            System.out.println("Нормально");
        } else if (word <= (-20)) {
            System.out.println("Холодно");
        }
        scan.close();
    }
}
