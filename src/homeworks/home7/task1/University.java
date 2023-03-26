package homeworks.home7.task1;

import java.time.LocalDate;

public class University {
    //     Создать класс University, в main создать объект этого класса, наполнить данными по желанию.
//     Внутри класса University обязателен метод получения расписания студента в определенный день,
//     примерная сигнатура -  getTimetable(String studentName, Date date).
//     Продумать, создать и использовать (внутри University) классы для хранения информации о студентах,
//     расписании, преподавателях, предметах и парах со всеми необходимыми полями и методами
    private LocalDate date;
    private Schedule schedule;

    public University() {
    }

    public void getTimetable(String studentName, LocalDate date) {
        for (int i = 0; i < schedule.getGroup().length; i++) {
            if (schedule.getGroup()[i].getName().equalsIgnoreCase(studentName)) {
                switch (date.getDayOfWeek()) {
                    case MONDAY ->
                            System.out.println("Студент: " + schedule.getGroup()[i].getName() + ". Группа: " + schedule.getGroup()[i].getGroupStud() +
                                    ". Предмет: " + schedule.getTeachers()[0].getTitle() + ". Преподователь: " + schedule.getTeachers()[0].getName());
                    case TUESDAY ->
                            System.out.println("Студент: " + schedule.getGroup()[i].getName() + ". Группа: " + schedule.getGroup()[i].getGroupStud() +
                                    ". Предмет: " + schedule.getTeachers()[1].getTitle() + ". Преподователь: " + schedule.getTeachers()[1].getName());
                    case WEDNESDAY ->
                            System.out.println("Студент: " + schedule.getGroup()[i].getName() + ". Группа: " + schedule.getGroup()[i].getGroupStud() +
                                    ". Предмет: " + schedule.getTeachers()[2].getTitle() + ". Преподователь: " + schedule.getTeachers()[2].getName());
                    case THURSDAY ->
                            System.out.println("Студент: " + schedule.getGroup()[i].getName() + ". Группа: " + schedule.getGroup()[i].getGroupStud() +
                                    ". Предмет: " + schedule.getTeachers()[3].getTitle() + ". Преподователь: " + schedule.getTeachers()[3].getName());
                    case FRIDAY ->
                            System.out.println("Студент: " + schedule.getGroup()[i].getName() + ". Группа: " + schedule.getGroup()[i].getGroupStud() +
                                    ". Предмет: " + schedule.getTeachers()[4].getTitle() + ". Преподователь: " + schedule.getTeachers()[4].getName());
                    case SATURDAY ->
                            System.out.println("Студент: " + schedule.getGroup()[i].getName() + ". Группа: " + schedule.getGroup()[i].getGroupStud() +
                                    ". Предмет: " + schedule.getTeachers()[5].getTitle() + ". Преподователь: " + schedule.getTeachers()[5].getName());
                    case SUNDAY ->
                            System.out.println("Студент: " + schedule.getGroup()[i].getName() + ". Группа: " + schedule.getGroup()[i].getGroupStud() +
                                    ". Предмет: " + schedule.getTeachers()[6].getTitle() + ". Преподователь: " + schedule.getTeachers()[6].getName());
                }
            } else {

            }
        }
        System.out.println("Такого студента нету");

    }
}
