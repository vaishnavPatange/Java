package com.polymorphism;

import java.util.Objects;

public class Test {

        public static void main(String[] args) {
                Car c = new Car();
                Plane p = new Plane();

                castTest(c);
                castTest(p);

        }

        public static void castTest(Vehicle veh){
                veh.start();
        }


}
