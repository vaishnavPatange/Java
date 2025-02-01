public class Car {
        static int totalCarsSold;
        int noOfWheels;
        String color;
        float fuelInLiters = 10;
        float speed;
        int price;

        static { // when jvm first sees Car class it will initialize totalCarsSold = 0
                totalCarsSold = 0;
        }

        { // this will execute before constructor and will increase totalCarsSold value
                // when new object is created
                totalCarsSold++;
        }


        Car(String color ,int price ){
                this.color = color;
                this.price = price;
        }

        Car(){
                this("Black", 2390000);
                fuelInLiters = 15;
        }

        public void startCar(){
                System.out.println("Car is running");
                fuelInLiters--;
        }

        public void getCarFuel(){
                System.out.println(fuelInLiters);
        }


}
