package com.example.geometry;

public class Square {

        private double side;

        public Square(double side){
                this.side = side;
        }

        public double area(){
                return Math.pow(this.side, 2);
        }

}
