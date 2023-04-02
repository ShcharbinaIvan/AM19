package homeworks.home11.task1;

public class MyThread extends Thread {


    @Override
    public void run() {
        System.out.println("Идет поток " + getName());
    }
}

