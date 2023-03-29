package classworks.lesson14;

public class MyThread extends Thread {
    public int count;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
    }
}
