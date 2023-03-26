package homeworks.home7.task1;

public class Schedule {
    private Student[] group = new Student[10];
    private Teacher[] teachers = new Teacher[10];

    public Schedule() {
    }

    public void addGroup(Student stud) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = stud;
                break;
            }
        }
    }
    public void addTeacher(Teacher teacher){
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                break;
            }
        }
    }

    public Student[] getGroup() {
        return group;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }
}
