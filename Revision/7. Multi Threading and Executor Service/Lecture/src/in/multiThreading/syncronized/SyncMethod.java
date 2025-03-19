package in.multiThreading.syncronized;

public class SyncMethod extends Thread{

        private Counter couter;

        public SyncMethod(Counter couter){
                this.couter = couter;
        }

        @Override
        public void run() {
                for (int i = 0; i < 10000; i++) {
                        couter.increment();
                }
        }
}
