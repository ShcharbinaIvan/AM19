package homeworks.home7.task2;

public class Car {
    //     Создать класс Car и Parking, внутри Parking создать массив Car.
//     Для класса Parking реализовать 2 метода. 1. Метод проверки нахождения машины с заданным vin номером на стоянке,
//     Car checkCar(String vin) throws .... , реализовать кастомное исключение и бросить его в случае,
//     если машина не найдена на стоянке, обработать такую ситуацию в мейне.
//     2. Метод подсчета  количества машин заданного возраста (количество лет) на стоянке, int countByYears(int years),
//     за точку отсчета брать текущий год
    private String vin;
    private int dateOfIssue;
    private String model;

    public Car() {
    }

    public Car(String vin, int dateOfIssue, String model) {
        this.vin = vin;
        this.dateOfIssue = dateOfIssue;
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public int getDateOfIssue() {
        return dateOfIssue;
    }

    public String getModel() {
        return model;
    }
}
