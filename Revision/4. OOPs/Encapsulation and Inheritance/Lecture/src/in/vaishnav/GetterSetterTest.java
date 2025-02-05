package in.vaishnav;

import in.CarCollection.Car;

public class GetterSetterTest {
        public static void main(String[] args) {
                Car car1 = new Car("Red", "maruti-800", 4, 2);

                System.out.printf("%S %S",car1.getColor(), car1.getModel());

        }
}
