package com.abstraction;

public class Car extends Vehicle{

        private int noOfDoors;

        public Car( int noOfDoors) {
                super(4);
                this.noOfDoors = noOfDoors;
        }

        public int getNoOfDoors() {
                return noOfDoors;
        }

        public void setNoOfDoors(int noOfDoors) {
                this.noOfDoors = noOfDoors;
        }

        @Override
        public void makeStartSound(){
                System.out.println("Vroooommmmmm .......");
        }

}
