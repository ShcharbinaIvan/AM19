package homeworks.home6.task2;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Jon", "Doe");
        Worker worker = new Worker("Stan", "Marsh");
        Accountant accountant = new Accountant("Tomas", "Angelo");
        director.print();
        worker.print();
        accountant.print();
    }
}
