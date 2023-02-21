package homeworks.home1;

public class Task12 {
    public static void main(String[] args) {
        //1. Выведите на экран первые 11 членов последовательности Фибоначчи.
        int first=0;
        int second=1;
        int count;
        System.out.print(first+" "+second+" ");
        for(int i=3;i<=11;i++){
            count=first+second;
            System.out.print(count+" ");
            first=second;
            second=count;
        }
    }
}
