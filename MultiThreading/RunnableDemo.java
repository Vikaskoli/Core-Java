package MultiThreading;

class MyRunnable implements Runnable
{

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Runnable.....");
        }
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
            MyRunnable r = new MyRunnable();

            Thread t = new Thread(r);   //need to pass obj o runable (r) into constructor
                                        // linking MyRunnable obj with Thread class
            t.start();
            for (int i=0;i<5;i++){
                System.out.println("Main.....");
            }
    }
}
