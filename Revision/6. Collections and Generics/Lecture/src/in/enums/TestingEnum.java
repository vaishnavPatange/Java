package in.enums;

public class TestingEnum {
        public static void main(String[] args) {
                TrafficLight color = TrafficLight.RED;
                Grade grd = Grade.D;

                Grade grd2 = Grade.valueOf("A");

                // to iterate over the Enums
                for (Grade value : Grade.values()) {
                        System.out.println(value);
                }


        }
}
