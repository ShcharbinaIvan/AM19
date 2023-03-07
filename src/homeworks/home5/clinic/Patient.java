package homeworks.home5.clinic;

public class Patient {
    private String name;
    private String surname;
    private int age;
    private TreatmentPlan plan;

    public Patient() {
    }

    public Patient(String name, String surname, int age, TreatmentPlan plan) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.plan = plan;
    }

    public TreatmentPlan getPlan() {
        return plan;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
