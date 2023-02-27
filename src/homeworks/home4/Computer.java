package homeworks.home4;

public class Computer {
    //    1. Создать класс для описания компьютера, в этом классе должны быть поля: стоимость, модель (строковый тип),
//    RAM и HDD. Для полей RAM и HDD следует создать свои собственные классы. Классы для RAM и HDD
//    должны иметь конструктор по умолчанию и
//    конструктор со всеми параметрами. Класс RAM имеет поля "название" и "объем".
//    Класс HDD имеет поля "название", "объем" и "тип" (внешний или
//    внутренний).
//    Класс Computer должен иметь два конструктора:
//   - первый - с параметрами стоимость и модель,
//   - второй - со всеми полями. При создании объекта "компьютер" с помощью первого конструктора
//    должны создаваться поля RAM и HDD с помощью конструкторов по умолчанию.
//   В каждом из классов предусмотреть методы для вывода полной
//   информации (вывод всех полей и всех значений).
//   Тестовый сценарий для проверки:
//   создать объект "компьютер 1" с помощью первого конструктора и вывести информацию на экран;
//   создать объект "компьютер 2" с помощью второго конструктора и вывести информацию на экран.
    double cost;
    String model;
    Hdd hard;
    Ram oper;

    public Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
        this.hard = new Hdd();
        this.oper = new Ram();
    }

    public Computer(double cost, String model, Hdd hard, Ram oper) {
        this.cost = cost;
        this.model = model;
        this.hard = hard;
        this.oper = oper;
    }

    void show() {
        System.out.println("Название: " + model + ". Цена: " + cost + ". " + hard.toString() + ". " + oper.toString());
    }

    public static void main(String[] args) {
        Hdd hard = new Hdd("HARD ", 256.6, "HDD");
        Ram oper = new Ram("RAM", 8);
        Computer comp1 = new Computer(234.10, "FIRST");
        Computer comp2 = new Computer(509.6, "Second", hard, oper);
        comp1.show();
        comp2.show();


    }
}
