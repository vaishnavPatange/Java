package com.abstraction;

public class Square extends Shape{

        private float side;

        public Square(float side){
                this.side = side;
        }

        @Override
        public float calculateArea() {
                return (float) Math.pow(side, 2);
        }
}
