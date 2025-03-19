package in.multiThreading.Join;

import in.multiThreading.runnable.PrintTask;

public class TestingJoin {
        public static void main(String[] args) throws InterruptedException {
                PrintTask p1 = new PrintTask('*');
                PrintTask p2 = new PrintTask('$');
                PrintTask p3 = new PrintTask('#');

                Thread t1 =  new Thread(p1);
                Thread t2 =  new Thread(p2);
                Thread t3 =  new Thread(p3);

                t1.start();
                t2.start();
                t1.join(); // this means that until t1 completes its work main thread will wait
                t3.start();


        }
}
