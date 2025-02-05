package com.example.utils;

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

                

        }

}
