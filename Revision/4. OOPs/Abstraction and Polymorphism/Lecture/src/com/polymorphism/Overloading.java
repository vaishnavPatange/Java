package com.polymorphism;

public class Overloading {

        Overloading(){
                System.out.println("Default constructor called");
        }

        Overloading(String pop){
                System.out.printf("You called '%s' constructor", pop);
        }

        public int add(int a , int b){
                return a + b;
        }

        public int add(int a, int b, int c, int d){
                return a + b + c + d;
        }

        public String add(String a, String b){
                return a + b;
        }

        public static void main(String[] args) {
                Overloading overloading = new Overloading();
                Overloading overloading1 = new Overloading("second");
                System.out.println( overloading.add(3, 6));
                System.out.println( overloading.add("Samarth", " Patange"));
                System.out.println( overloading.add(4, 60, 2, 6));
        }

}
