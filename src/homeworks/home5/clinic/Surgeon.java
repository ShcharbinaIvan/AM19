package homeworks.home5.clinic;

public class Surgeon extends Doctor {
    public Surgeon() {
        super();
    }

    public Surgeon(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void healing() {
        System.out.println("Лечит хирург: " + getName() + " " + getSurname());
    }
}
