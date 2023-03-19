package homeworks.home7.task1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        Subject subject = new Subject("Math");
        Subject subject1 = new Subject("Biology");
        Subject subject2 = new Subject("Drawing");
        Subject subject3 = new Subject("Chemistry");
        Subject subject4 = new Subject("Geography");
        Subject subject5 = new Subject("History");
        Schedule schedule = new Schedule();
        schedule.addGroup(new Student("Alex Allen", "1A"));
        schedule.addGroup(new Student("Beverly Anderson", "2A"));
        schedule.addGroup(new Student("Samuel Brown", "1A"));
        schedule.addGroup(new Student("Jack Clark", "3A"));
        schedule.addGroup(new Student("Joseph Davis", "1A"));
        schedule.addGroup(new Student("Harry Garcia", "2A"));
        schedule.addTeacher(new Teacher("Alfie Aldridge", subject));
        schedule.addTeacher(new Teacher("Thomas Evans", subject));
        schedule.addTeacher(new Teacher("Charlie Johnson", subject));
        schedule.addTeacher(new Teacher("Oscar Wilson", subject));
        schedule.addTeacher(new Teacher("James Parson", subject));
        schedule.addTeacher(new Teacher("William Ellington", subject));
        university.getTimetable("Alex Allen", LocalDate.now());


    }
}
