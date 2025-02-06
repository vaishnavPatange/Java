package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;
import com.example.geometry.Square;

import java.util.Scanner;

public class GeometryCalculator {

        public static void getInput(int i){
               switch (i){
                        case 1,2 -> System.out.println("Enter the radius of circle : ");
                        case 3 -> System.out.println("Enter the length and breadth of rectangle : ");
                        case 4 -> System.out.println("Enter the side of square : ");
                        default -> System.out.println("Please enter valid number");
                }
                return;
        }


        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Welcome to geometry calculator!!");
                System.out.println("Please select from given options and enter the number of option");
                System.out.println("1. Calculate area of circle\n2. Calculate circumference of circle\n3. Calculate area of rectangle\n4. Calculate area of square");
                int num = sc.nextInt();
                getInput(num);

                if( num == 3){
                        double length = sc.nextDouble();
                        double breadth = sc.nextDouble();
                        Rectangle rec = new Rectangle(length, breadth);
                        System.out.printf("The area of given rectangle is : %f", rec.area());
                } else if (num == 1 || num == 2) {
                        double rad = sc.nextDouble();
                        Circle circle = new Circle(rad);
                        if(num == 1){
                                System.out.printf("The area of circle is : %f", circle.area());
                        } else{
                                System.out.printf("The circumference of circle is : %f", circle.circumference());
                        }
                } else if (num == 4) {
                        double side = sc.nextDouble();
                        Square sq = new Square(side);
                        System.out.printf("The area of given square is : %f", sq.area());
                }

        }

}
