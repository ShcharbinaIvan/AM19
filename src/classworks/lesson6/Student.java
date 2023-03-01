package classworks.lesson6;

import java.util.Arrays;
import java.util.Random;

public class Student {
    String name;
    String group;
    int mark;

    public Student() {
    }

    public Student(String name, int mark) {
        this.name = name;
        this.group = "Group123";
        this.mark = mark;
    }

    public Student(String name, String group, int mark) {
        this.name = name;
        this.group = group;
        this.mark = mark;
    }

    void showStud() {
        System.out.println("Студент " + name + ".Группа " + group + ". Оценка " + mark);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Student[] stud = new Student[14];
        for (int i = 0; i < stud.length; i++) {
            stud[i] = new Student("Student" + i, rand.nextInt(10));
            if (stud[i].mark >= 9) {
                stud[i].showStud();
            }
        }


    }
}
