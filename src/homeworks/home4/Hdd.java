package homeworks.home4;

public class Hdd {
    String name;
    double volume;
    String type;

    public Hdd() {
    }

    public Hdd(String name, double volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    void show() {
        System.out.println("Название: " + name + ". Объем: " + volume + "." + " Тип:" + type);
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", type='" + type + '\'' +
                '}';
    }
}
