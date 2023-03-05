package homeworks.home5.clinic;

public class Dentist extends Doctor {

    public Dentist() {
        super();
    }

    public Dentist(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void healing() {
        System.out.println("Лечит дантист: " + getName() + " " + getSurname());
    }
}
