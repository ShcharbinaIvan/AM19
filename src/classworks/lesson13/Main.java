package classworks.lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = initStudents();
        Map<Student, Double> avgMap = studentList.stream()
                .collect(Collectors.toMap(student -> student,
                        student -> student.getMarks()
                        .stream()
                        .mapToDouble(mark -> mark)
                        .average()
                        .getAsDouble()));
        System.out.println(avgMap);

    }

    private static List<Student> initStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", "01", List.of(6.6f, 7.9f, 7.5f)));
        studentList.add(new Student("David", "02", List.of(6.4f, 6.7f, 3.4f)));
        studentList.add(new Student("Sasha", "01", List.of(6.7f, 5.8f, 2.3f)));
        studentList.add(new Student("Nik", "02", List.of(6.9f, 7.5f, 6.1f)));
        return studentList;
    }
}
