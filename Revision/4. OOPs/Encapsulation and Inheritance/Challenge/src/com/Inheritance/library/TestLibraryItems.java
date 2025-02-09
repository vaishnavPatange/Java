package com.Inheritance.library;

public class TestLibraryItems {

        public static void main(String[] args) {
                Book bk = new Book("isbm98347");
                DVD dvd = new DVD(34);
                Magazine mg = new Magazine(234);

                System.out.println(bk);
                System.out.println(dvd);
                System.out.println(mg);

        }

}
