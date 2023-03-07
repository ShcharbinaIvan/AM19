package classworks.lesson7;

public enum DayOfWeek {
//   Создайте ENUM со всеми днями недели. Сделайте метод в классе,
//который выведет все дни недели в консоль с указанием рабочий это
//день или выходной.

    MONDAY("рабочий день"), TUESDAY("рабочий день"), WEDNESDAY("рабочий день"), THURSDAY("рабочий день"),
    FRIDAY("рабочий день"), SATURDAY("выходной день"), SUNDAY("выходной день");

    String title;

    DayOfWeek(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    void show() {
        for (DayOfWeek s : DayOfWeek.values()) {
            System.out.println(s + " " + s.getTitle());
        }
    }
}


