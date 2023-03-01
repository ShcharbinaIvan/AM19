package homeworks.home4;

public class Ram {
    String name;
    double volume;

    public Ram() {
    }

    public Ram(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    void show() {
        System.out.println("Название: " + name + ". Объем: " + volume + ".");
    }

    @Override
    public String toString() {
        return "Ram{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
