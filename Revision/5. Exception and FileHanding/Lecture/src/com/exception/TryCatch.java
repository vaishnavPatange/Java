package com.exception;

public class TryCatch {

        public static void main(String[] args) {
                try{
                        int num = 5 / 0;
                } catch (ArithmeticException e) {
                        System.out.printf("%s , please check the denominator", e);
                }
        }


}
