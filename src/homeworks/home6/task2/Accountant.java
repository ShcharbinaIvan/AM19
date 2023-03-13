package homeworks.home6.task2;

public class Accountant implements JobTitle {
    private String name;
    private String surname;

    public Accountant() {
    }

    public Accountant(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void print() {
        System.out.println("Бухгалтер: " + name + " " + surname + ".");
    }
}
