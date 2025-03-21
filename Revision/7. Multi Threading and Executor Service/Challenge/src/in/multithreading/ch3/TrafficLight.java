package in.multithreading.ch3;

public class TrafficLight extends Thread{

        private final TrafficColor color;

        TrafficLight(TrafficColor color){
                this.color = color;
        }

        @Override
        public synchronized void run() {
                System.out.println(color + " is active");
                try {
                        Thread.sleep(color.getOnTimeInMillis());
                } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                }
                System.out.println(color + " is inActive");
        }
}
