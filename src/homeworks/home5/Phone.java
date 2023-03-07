package homeworks.home5;

public class Phone {
    //    1. Класс Phone.
//Создайте класс Phone, который содержит переменные number, model и weight.
//Создайте три экземпляра этого класса.
//Выведите на консоль значения их переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр - имя звонящего.
// Выводит на консоль сообщение "Звонит {name}". getNumber - возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//Добавить конструктор в класc Phone, который принимает на вход три параметра для инициализации переменных класса - weight. number, model
//Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса number, model,
// Добавить конструктор без параметров.
//Вызвать из конструктора с тремя параметрами конструктор с двумя.
// Добавьте перегруженный метод receiveCall, который принимает два параметра имя звонящего и номер телефона звонящего. Вызвать этот метод.
//Создать метод sendMessage с аргументами переменной длины.
// Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит: " + name + " номер: " + getNumber());
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит: " + name + " номер: " + number);
    }

    public String[] sendMessage(String... number) {
        return number;
    }

}
