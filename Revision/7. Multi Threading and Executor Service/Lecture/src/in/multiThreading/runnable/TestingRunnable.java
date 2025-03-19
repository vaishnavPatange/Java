package in.multiThreading.runnable;

public class TestingRunnable {
        public static void main(String[] args) {
                PrintTask p1 = new PrintTask('*');
                PrintTask p2 = new PrintTask('$');
                PrintTask p3 = new PrintTask('#');

                new Thread(p1).start();
                new Thread(p2).start();
                new Thread(p3).start();

        }
}
