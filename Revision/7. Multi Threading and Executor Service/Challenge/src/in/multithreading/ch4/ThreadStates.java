package in.multithreading.ch4;

public class ThreadStates {
        public static void main(String[] args) throws InterruptedException {
                PrintState p1 = new PrintState();

                System.out.println("Thread started " +  p1.getState());
                p1.start();
                p1.join();

                System.out.println("Thread ended " + p1.getState());
        }
}
