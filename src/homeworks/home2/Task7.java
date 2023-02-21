package homeworks.home2;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        //6. Создайте массив строк. Заполните его произвольными именами людей.
        //Отсортируйте массив.
        //Результат выведите на консоль.
        String[] arr={"Ivan","Mihail","Olga","Marry","Ronald"};
        System.out.println("Массив "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("После сортировки "+Arrays.toString(arr));
    }
}
