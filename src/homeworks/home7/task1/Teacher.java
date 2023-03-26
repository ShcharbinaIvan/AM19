package homeworks.home7.task1;

public class Teacher {
    private String name;
    private Subject title;

    public Teacher() {
    }

    public Teacher(String name, Subject title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public Subject getTitle() {
        return title;
    }
}
