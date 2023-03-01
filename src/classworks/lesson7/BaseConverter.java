package classworks.lesson7;

public class BaseConverter {
    static String convert(double temp) {
        double temp1 = (temp + 273.15);
        double temp2 = (1.8 * temp) + 32;
        return "Температура по Цельсию:" + temp + " Температура по Кельвину:" + temp1 + " Температура по Фаренгейту:" + temp2;
    }

    public static void main(String[] args) {
        System.out.println(convert(23));
    }
}
