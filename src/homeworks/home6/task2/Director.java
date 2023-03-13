package homeworks.home6.task2;

public class Director implements JobTitle {
    //    2. Создать классы "Директор", "Рабочий", "Бухгалтер".
//Реализовать интерфейс с методом, который печатает название
// должности и имплементировать этот метод в созданные классы.
    private String name;
    private String surname;

    public Director() {
    }

    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void print() {
        System.out.println("Директор: " + name + " " + surname + ".");
    }
}
