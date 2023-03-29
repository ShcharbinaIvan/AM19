package classworks.lesson14;

public class Main1 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread 1");
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread 2");
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread 3");
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
    }
}
