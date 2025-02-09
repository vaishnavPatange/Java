package com.Inheritance.person;

public class TestPerson {

        public static void main(String[] args) {
                Person pr1 = new Person("Vaishnav", 22);
                Person pr2 = new Person("Vaishnav", 22);

/*
                System.out.println(pr1.hashCode());
                System.out.println(pr2.hashCode());
*/

                if(pr1.equals(pr2)){
                        System.out.println("Equals");
                } else {
                        System.out.println("Not Equals");
                }


        }

}
