package homeworks.home2;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
//5. Создайте массив и заполните массив.
//Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//Снова выведете массив на экран на отдельной строке.
        Random rand = new Random();
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]= rand.nextInt(20);
        }
        System.out.println("Масссив: "+ Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                arr[i]=0;
            }
        }
        System.out.println("Масссив после: "+ Arrays.toString(arr));

    }
}
