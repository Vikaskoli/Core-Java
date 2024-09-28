package MultiThreading;
class createthread extends Thread
{
    @Override
    public void run() {
        for (int i=0;i<5;i++)
        {
            System.out.println("Child thread executing...");
        }
    }
}
public class threadCreation {
    public static void main(String[] args) {
        createthread t1 = new createthread();
        t1.start();
        for (int i=0;i<5;i++){
            System.out.println("Main thread...");
        }
    }
}
