package in.multiThreading.syncronized;

public class TestingSynchronized {
        public static void main(String[] args) throws InterruptedException {
                Counter counter = new Counter();
                SyncMethod t1 = new SyncMethod(counter);
                SyncMethod t2 = new SyncMethod(counter);

                t1.start();
                t2.start();

                t1.join();
                t2.join();

                System.out.println("Counter value is : " + counter.getCount());

        }
}
