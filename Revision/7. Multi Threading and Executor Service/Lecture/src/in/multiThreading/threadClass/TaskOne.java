package in.multiThreading.threadClass;

public class TaskOne extends Thread {
        @Override
        public void run() {
                // first Task
                for (int i = 1; i <= 1000; i++) {
                        System.out.print(i + "* ");
                }
                System.out.printf("\n %s * task complete",Thread.currentThread().getName());
        }
}
