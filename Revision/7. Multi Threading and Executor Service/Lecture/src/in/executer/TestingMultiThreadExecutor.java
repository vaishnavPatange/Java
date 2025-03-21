package in.executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingMultiThreadExecutor {
        public static void main(String[] args) throws InterruptedException {
                ExecutorService service = Executors.newFixedThreadPool(2);
                for (int i = 34 ; i < 44; i++) {
                        PrintThreads t = new PrintThreads((char)i);
                        service.submit(t);
                }
                service.shutdown();

                if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                        service.shutdownNow();
                        System.out.println("\nShutDown abruptly");
                }

        }
}
