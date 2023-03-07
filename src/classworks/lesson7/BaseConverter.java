package classworks.lesson7;

public class BaseConverter {
    //    Напишите класс BaseConverter для конвертации из градусов по Цельсиюв Кельвины , Фаренгейты , и так далее.
//    У класса должен быть метод convert, который и делает
//конвертацию.
//Соотношения температур: • <Температура по Цельсию>
//• <Температура по Цельсию> + 273.15 —-> по Кельвину
//• 1.8 * <Температура по Цельсию> + 32 —-> по Френгейту
    static String convert(double temp) {
        double temp1 = (temp + 273.15);
        double temp2 = (1.8 * temp) + 32;
        return "Температура по Цельсию:" + temp + " Температура по Кельвину:" + temp1 + " Температура по Фаренгейту:" + temp2;
    }

    public static void main(String[] args) {

        System.out.println(convert(23));
    }
}
