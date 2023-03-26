package homeworks.home7.task2;

import java.time.LocalDate;

public class Parking {
    private Car[] cars;

    public Parking() {
    }

    public Parking(Car[] cars) {
        this.cars = cars;
    }

    public Car checkCar(String vin) throws MyException {
        Car car1 = new Car();
        boolean a = false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getVin().equalsIgnoreCase(vin)) {
                car1 = cars[i];
                a = true;
            }
            if (!a) throw new MyException("Такого автомобиля нету.", vin);
        }
        return car1;
    }

    public int countByYears(int years) {
        int count = 0;
        LocalDate date = LocalDate.now();
        int searchYear = date.getYear() - years;
        for (Car car : cars) {
            if (car.getDateOfIssue() == searchYear) {
                count += 1;
            }
        }
        return count;
    }

    public Car[] getCars() {
        return cars;
    }
}
