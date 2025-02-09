package com.Inheritance.person;

import java.util.Objects;

public class Person {

        private String name;
        private int age;

        public Person(String name, int age) {
                this.name = name;
                this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
                if(this == obj) return true;
                if(obj == null || obj.getClass() != getClass()) return false;

                Person pr = (Person) obj;
                return pr.name.equals(this.name) && pr.age == this.age;
        }

        @Override
        public int hashCode() {
                return Objects.hash(this.name, this.age);
        }
}
