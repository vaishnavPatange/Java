package com.exception;

import java.util.Scanner;

public class FinallyWord {

        public static void main(String[] args) {
                a();
        }

        private static void a(){
                b();
        }
        private static void b(){
                c();
        }
        private static void c(){
                d();
        }
        private static void d(){
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                int div = sc.nextInt();

                try {
                        System.out.println(num/div);
                } catch (ArithmeticException e){
                        throw new ArithmeticException("Dividing num by 0");
                } finally {
                        System.out.println("AAkhir tu aa hi gaya yaha");
                }

        }


}
