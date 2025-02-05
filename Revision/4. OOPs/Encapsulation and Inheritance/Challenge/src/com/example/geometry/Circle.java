package com.example.geometry;

public class Circle {

        private double radius;

        public Circle(double radius){
                this.radius = radius;
        }

        public double perimeter(){
                return 2 * Math.PI * this.radius;
        }

        public double area(){
                return Math.PI * Math.pow(this.radius, 2);
        }


}
