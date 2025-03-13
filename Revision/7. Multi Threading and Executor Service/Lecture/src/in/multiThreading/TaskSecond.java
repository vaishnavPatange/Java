package in.multiThreading;

public class TaskSecond extends Thread {
        @Override
        public void run() {
                // second Task
                for (int i = 1; i <= 1000; i++) {
                        System.out.print(i + "@ ");
                }
                System.out.printf("\n %s @ task complete",Thread.currentThread().getName());
        }
}
