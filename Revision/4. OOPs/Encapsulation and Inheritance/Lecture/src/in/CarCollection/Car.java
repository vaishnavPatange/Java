package in.CarCollection;

public class Car {

        private String color;
        private String model;
        private int noOfWheels;
        private double fuelInLiter;


        public Car(String color, String model, int noOfWheels, double fuelInLiter) {
                this.color = color;
                this.model = model;
                this.noOfWheels = noOfWheels;
                this.fuelInLiter = fuelInLiter;
        }

        public String getColor(){
                return color;
        }

        public String getModel(){
                return model;
        }






}
