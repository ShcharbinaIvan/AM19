package homeworks.home2;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        //Создайте 2 массива из 5 чисел.
        //Выведите массивы на консоль в двух отдельных строках.
        // Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение
        // оказалось больше (либо сообщите, что их средние арифметические равны).
        Random rand=new Random();
        int sum1=0;
        int sum2=0;
        int[] arr1=new  int[5];
        int[]arr2=new int[5];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=rand.nextInt(30);
            arr2[i]=rand.nextInt(30);
        }
        System.out.println("Масссив 1: "+Arrays.toString(arr1));
        System.out.println("Масссив 2: "+Arrays.toString(arr2));
        for(int i=0;i<arr1.length;i++){
            sum1+=arr1[i];
            sum2+=arr2[i];
        }
        sum1=sum1/ arr1.length;
        sum2=sum2/ arr2.length;
        System.out.println("Среднее массивов 1:"+sum1+" 2:"+sum2);
        if(sum1>sum2){
            System.out.println("Среднее массива 1 больше массива 2: ");
        }else if(sum2>sum1){
            System.out.println("Среднее массива 2 больше массива 1: ");
        }else if(sum1==sum2){
            System.out.println("Массив 1 равен массиву 2");
        }
    }
}
