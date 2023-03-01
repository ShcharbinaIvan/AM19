package classworks.lesson7;

public class Car {
    protected String vin;

    public Car() {
    }

    public Car(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
