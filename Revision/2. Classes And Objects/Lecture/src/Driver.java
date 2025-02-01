public class Driver {

        public static void main(String[] args) {
                Car myCar = new Car("Black", 2400000);
                Car newCar = new Car();
                System.out.println("passing parameters");
                System.out.println(myCar.fuelInLiters + " liters");
                System.out.println(myCar.color  +  "\nRs." + myCar.price);
                System.out.println("Without passing parameters");
                System.out.println(newCar.fuelInLiters + " liters");
                System.out.println(newCar.color  +  "\nRs." + newCar.price);
        }

}
