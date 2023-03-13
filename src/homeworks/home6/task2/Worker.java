package homeworks.home6.task2;

public class Worker implements JobTitle {
    private String name;
    private String surname;

    public Worker() {
    }

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void print() {
        System.out.println("Рабочий: " + name + " " + surname + ".");
    }
}
