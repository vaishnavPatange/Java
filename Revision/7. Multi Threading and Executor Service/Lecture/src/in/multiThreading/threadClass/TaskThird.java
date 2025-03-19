package in.multiThreading.threadClass;

public class TaskThird extends Thread {
        @Override
        public void run() {
                // third Task
                for (int i = 1; i <= 1000; i++) {
                        System.out.print(i + "& ");
                }
                System.out.printf("\n %s & task complete",Thread.currentThread().getName());
        }
}
