package classworks.lesson14;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        long startTime = System.nanoTime();
        myThread.start();
        myThread1.start();
        myThread2.start();
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

    }
}
