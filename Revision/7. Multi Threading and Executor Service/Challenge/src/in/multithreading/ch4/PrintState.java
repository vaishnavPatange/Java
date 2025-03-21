package in.multithreading.ch4;

public class PrintState extends Thread{

        @Override
        public void run() {
                try {
                        Thread.sleep(5000);
                } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                }
                System.out.println("From inside the thread " + getState());
        }
}
