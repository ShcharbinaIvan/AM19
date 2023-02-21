package homeworks.home1;

public class Task9 {
    public static void main(String[] args) {
        //4. Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98.
        //В решении используйте цикл while.
        int i = 0;
        while (i < 98) {
            i++;
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
