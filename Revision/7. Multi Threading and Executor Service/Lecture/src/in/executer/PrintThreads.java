package in.executer;

public class PrintThreads implements Runnable{

        private final char character;

        PrintThreads(char character){
                this.character = character;
        }

        @Override
        public void run() {
                for (int i = 1; i <= 100; i++) {
                        try {
                                Thread.sleep(30);
                        } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                        }
                        System.out.printf("%d%c ", i, character);
                }
                System.out.println("\n"+Thread.currentThread().getName() + " Complete");
        }
}
