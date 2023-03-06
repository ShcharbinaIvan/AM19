package classworks.lesson8;

import java.util.Calendar;

public abstract class Animal {
    private Integer animal_id;
    private String name;
    private Calendar birthday;

    public Animal() {
    }

    public Animal(Integer animal_id, String name, Calendar birthday) {
        this.animal_id = animal_id;
        this.name = name;
        this.birthday = birthday;
    }
}
