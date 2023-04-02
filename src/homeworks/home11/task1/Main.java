package homeworks.home11.task1;

public class Main {
    // 1. Создать три потока Т1, Т2 и Т3
//Реализовать выполнение поток в последовательности Т3 -> Т2 -> T1 (используя метод join)
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t3.start();
        t3.join();
        t2.start();
        t2.join();
        t1.start();
    }
}
