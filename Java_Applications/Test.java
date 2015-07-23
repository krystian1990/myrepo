public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Watek1();
        Thread t2 = new Thread(new Watek2());
        
        t1.start();
        t2.start();
        
        t1.join();
    }
}
 
 
class Watek1 extends Thread
{
    @Override
    public void run() {
        while (true)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Watek1");
        }
    }
}
 
class Watek2 implements Runnable
{
    @Override
    public void run() {
        while (true)
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Watek2");
        }
    }
}
