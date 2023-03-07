package homeworks.home5.clinic;

public class Main {
    public static void main(String[] args) {
//       2. Создать программу для имитации работы клиники.
//Пусть в клинике будет три врача: хирург, терапевт и дантист.
//Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
//Так же предусмотреть класс «Пациент» и класс «План лечения».
//Создать объект класса «Пациент» и добавить пациенту план лечения. Так же создать метод, который будет назначать врача пациенту согласно
//плану лечения.
//Если план лечения имеет код 1 - назначить хирурга и выполнить метод
//лечить.
//Если план лечения имеет код 2 назначить дантиста и выполнить метод лечить.
//Если план лечения имеет любой другой код назначить терапевта и
//выполнить метод лечить.
        Therapist doc1 = new Therapist("Ivan", "Doctor1");
        Dentist doc2 = new Dentist("Denis", "Doctor2");
        Surgeon doc3 = new Surgeon("Artem", "Doctor3");
        Patient patient = new Patient("Alex", "Weak", 33, TreatmentPlan.CODE1);
        Patient patient1 = new Patient("Nikita", "Dasd", 43, TreatmentPlan.CODE2);
        Patient patient2 = new Patient("Kiril", "Riodas", 55, TreatmentPlan.CODE3);
        heal(patient, doc1, doc2, doc3);
        heal(patient1, doc1, doc2, doc3);
        heal(patient2, doc1, doc2, doc3);

    }

    static void heal(Patient patient, Therapist doc1, Dentist doc2, Surgeon doc3) {
        switch (patient.getPlan()) {
            case CODE1:
                System.out.println("Пациент: " + patient.getName() + " " + patient.getSurname() + ". Возраст:" + patient.getAge()
                        + ". План лечения: " + patient.getPlan());
                doc3.healing();
                break;
            case CODE2:
                System.out.println("Пациент: " + patient.getName() + " " + patient.getSurname() + ". Возраст:" + patient.getAge()
                        + ". План лечения: " + patient.getPlan());
                doc2.healing();
                break;
            default:
                System.out.println("Пациент: " + patient.getName() + " " + patient.getSurname() + ". Возраст:" + patient.getAge()
                        + ". План лечения: " + patient.getPlan());
                doc1.healing();
                break;
        }

    }
}
