package homeworks.home5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("+375_33_1234567", "iPhone", 123.6);
        Phone phone1 = new Phone("+375_29_7654321", "Samsung", 132.5);
        Phone phone2 = new Phone("+375_25_3213214", "Nokia", 111.3);
        System.out.println("Телефон 1: model-" + phone.getModel() + " number-" + phone.getNumber() + " weight-" + phone.getWeight());
        System.out.println("Телефон 2: model-" + phone1.getModel() + " number-" + phone1.getNumber() + " weight-" + phone1.getWeight());
        System.out.println("Телефон 3: model-" + phone2.getModel() + " number-" + phone2.getNumber() + " weight-" + phone2.getWeight());
        phone.receiveCall("Ivan");
        phone1.receiveCall("Olga");
        phone2.receiveCall("Egor");
        phone.receiveCall("Ivan", "123`14234");
        phone1.receiveCall("Olga", "213412342341");
        phone2.receiveCall("Egor", "789659327465");
        System.out.println(Arrays.toString(phone.sendMessage("12341234", "123123123", "qweqweqw", "435345345")));

    }
}
