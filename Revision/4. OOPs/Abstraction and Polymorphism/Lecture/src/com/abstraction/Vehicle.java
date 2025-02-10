package com.abstraction;

public abstract class Vehicle implements Transport{

        private int noOfTyres;

        public abstract void makeStartSound(); // Abstract method

        public Vehicle( int noOfTyres){
                this.noOfTyres = noOfTyres;
        }

        @Override
        public void getSetGo() {
                System.out.println("Going to place !");
        }

        protected void commute(){
                System.out.println("Vehicle is called");
        }


}
