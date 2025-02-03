public class Car1 {

        int noOfWheels;
        int noOfDoors;
        int noOfSeats;
        String name;
        String company;
        String modelNo;

        public Car1(int noOfWheels, int noOfDoors, int noOfSeats, String name, String company, String modelNo) {
                this.noOfWheels = noOfWheels;
                this.noOfDoors = noOfDoors;
                this.noOfSeats = noOfSeats;
                this.name = name;
                this.company = company;
                this.modelNo = modelNo;
        }

        @Override
        public String toString() {
                return "Car1   {" +
                        "noOfWheels=" + noOfWheels +
                        ", \nnoOfDoors=" + noOfDoors +
                        ", noOfSeats=" + noOfSeats +
                        ", name='" + name + '\'' +
                        ", \ncompany='" + company + '\'' +
                        ", modelNo='" + modelNo + '\'' +
                        '}';
        }

        public static void main(String[] args) {
                Car1 fortuner = new Car1(6, 5, 7, "Fortuner", "Toyota", "F244445" );
                Car1 enova = new Car1(4, 4, 9, "Enonva", "Toyota", "E244768" );
                System.out.println(fortuner);
                System.out.println(enova);
        }
}
