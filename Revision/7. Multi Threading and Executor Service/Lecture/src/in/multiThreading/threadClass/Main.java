package in.multiThreading.threadClass;

public class Main {
        public static void main(String[] args) {
                long startTime = System.currentTimeMillis();

                TaskOne t1 = new TaskOne();
                TaskSecond t2 = new TaskSecond();
                TaskThird t3 = new TaskThird();

                System.out.println("Task 1 start");
                t1.start();
                System.out.println("Task 2 start");
                t2.start();
                System.out.println("Task 3 start");
                t3.start();

                long endTime = System.currentTimeMillis();

                System.out.printf("Time taken: %s  %d" , Thread.currentThread().getName(),(endTime-startTime));

        }
}