package classworks.lesson7;

public class Bus extends Car {
    private float capacity;

    public Bus() {
    }

    public Bus(String vin, float capacity) {
        super(vin);
        this.capacity = capacity;
    }

    public Bus(float capacity) {
        this.capacity = capacity;
    }
}
