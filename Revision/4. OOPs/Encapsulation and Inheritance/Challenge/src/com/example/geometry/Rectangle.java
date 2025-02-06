package com.example.geometry;

public class Rectangle {

        private double length;
        private double breadth;

      public Rectangle(double length, double breadth){
                this.breadth = breadth;
                this.length = length;
        }

        public double area(){
                return length * breadth;
        }



}
