package in.multithreading.ch2;

public class Testing {
        public static void main(String[] args) throws InterruptedException{
                Test p1 = new Test(1);
                Test p2 = new Test(2);
                Test p3 = new Test(3);

                Thread t1 = new Thread(p1);
                Thread t2 = new Thread(p2);
                Thread t3 = new Thread(p3);

                t1.start(); t1.join(); Thread.sleep(2000);
                System.out.println("End, thread, "  + p1.getThreadNum());
                t2.start(); t2.join(); Thread.sleep(2000);
                System.out.println("End, Thread " + p2.getThreadNum());
                t3.start(); t3.join();
                System.out.println("End, Thread " + p3.getThreadNum());

        }
}
