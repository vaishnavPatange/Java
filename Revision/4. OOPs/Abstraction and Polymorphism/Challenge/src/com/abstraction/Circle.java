package com.abstraction;

public class Circle extends Shape{

        private float radius;

        public Circle(float radius){
                this.radius = radius;
        }

        @Override
        public float calculateArea() {
                return (float) (Math.PI  * Math.pow(radius, 2));
        }
}
