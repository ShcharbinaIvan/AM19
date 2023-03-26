package homeworks.home7.task2;

public class MyException extends Exception {
    private String vin;

    public MyException(String message, String vin) {
        super(message);
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }
}
