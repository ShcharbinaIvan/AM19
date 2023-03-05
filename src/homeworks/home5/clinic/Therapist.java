package homeworks.home5.clinic;

public class Therapist extends Doctor {
    public Therapist() {
        super();
    }

    public Therapist(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void healing() {
        System.out.println("Лечит терапевт: " + getName() + " " + getSurname());
    }
}
