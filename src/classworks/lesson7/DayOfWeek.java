package classworks.lesson7;

public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    void watch() {
        System.out.println(DayOfWeek.MONDAY + " Рабочий. " + DayOfWeek.TUESDAY + " Рабочий. " + DayOfWeek.WEDNESDAY + " Рабочий. " + DayOfWeek.THURSDAY + " Рабочий. " +
                DayOfWeek.FRIDAY + " Рабочий. " + DayOfWeek.SATURDAY + " Выходной. " + DayOfWeek.SUNDAY + " Выходной. ");
    }
}

