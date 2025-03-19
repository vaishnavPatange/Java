package in.multithreading.ch1;

public class HelloThread extends  Thread{

        private final int threadNum;

        public  HelloThread(int threadNum){
              this.threadNum = threadNum;
        }

        @Override
        public void run() {
                for (int i = 0; i < 10; i++) {
                        System.out.println("Hello thread, " + threadNum);
                }
        }
}
