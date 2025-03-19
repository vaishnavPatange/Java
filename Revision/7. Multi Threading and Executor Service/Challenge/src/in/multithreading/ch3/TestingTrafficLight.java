package in.multithreading.ch3;

public class TestingTrafficLight {
        public static void main(String[] args) throws InterruptedException{

                TrafficLight t1 = new TrafficLight("RED");
                TrafficLight t2 = new TrafficLight("GREEN");
                TrafficLight t3 = new TrafficLight("YELLOW");

                t1.start(); t1.join(); Thread.sleep(5000);
                t2.start(); t2.join(); Thread.sleep(5000);
                t3.start();

        }
}
