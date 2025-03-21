package in.executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleThreadExecutor {
        public static void main(String[] args) {
                ExecutorService service = Executors.newSingleThreadExecutor();

                PrintThreads t1 = new PrintThreads('*');
                PrintThreads t2 = new PrintThreads('$');
                PrintThreads t3 = new PrintThreads('&');

                service.submit(t1);
                service.submit(t2);
                service.submit(t3);

                service.shutdown();

        }
}
