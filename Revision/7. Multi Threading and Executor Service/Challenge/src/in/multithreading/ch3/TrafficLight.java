package in.multithreading.ch3;

public class TrafficLight extends Thread{

        private final  String color;

        public TrafficLight(String color){
                this.color = color;
        }

        @Override
        public synchronized void run() {
                System.out.println(color);
        }
}
