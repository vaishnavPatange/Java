package in.multiThreading.runnable;

public class PrintTask implements Runnable{

        @Override
        public void run() {
                // print Task
                for (int i = 1; i <= 1000; i++) {
                        System.out.printf("%d%s", i, targetChar);
                }
                System.out.printf("\n %s %s task complete",Thread.currentThread().getName(), targetChar);
        }

        private final char targetChar;

        public PrintTask(char targetChar){
                this.targetChar = targetChar;
        }

}
