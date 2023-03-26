package homeworks.home7.task2;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("A123456", 2010, "Volkswagen");
        cars[1] = new Car("B123456", 2011, "Volkswagen");
        cars[2] = new Car("C123456", 2012, "Volkswagen");
        cars[3] = new Car("D123456", 2013, "Volkswagen");
        cars[4] = new Car("E123456", 2014, "Volkswagen");
        Parking parking = new Parking(cars);
        try {
            System.out.println(parking.checkCar("B123456"));
        } catch (MyException e) {
            System.out.println(e.getMessage() + " VIN: " + e.getVin());
        }
        System.out.println("Количество автомобилей: " + parking.countByYears(10));
        System.out.println(Arrays.toString(parking.getCars()));

    }
}
