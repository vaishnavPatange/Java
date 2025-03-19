package in.multithreading.ch2;

public class Test implements Runnable{

        private final int threadNum;

        public Test(int threadNum){
                this.threadNum = threadNum;
        }

        public int getThreadNum() {
                return threadNum;
        }

        @Override
        public void run(){
                System.out.println("Start, Thread" + threadNum);
        }

}
