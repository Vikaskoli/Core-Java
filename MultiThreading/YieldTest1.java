package MultiThreading;



class YieldTestDemo implements Runnable
{
    @Override
    public void run() {
        for (int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+": "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Thread.yield();
        }
    }

}

class YieldTest implements Runnable
{
    @Override
    public void run() {
        for (int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+": "+i);

        }
    }

}
public class  YieldTest1 {
    public static void main(String[] args) {
        Thread t=new Thread(new YieldTest(),"YieldTest");
        Thread t1=new Thread(new YieldTestDemo(),"YieldTestDemo");
        t.start();
        t1.start();

    }
}
