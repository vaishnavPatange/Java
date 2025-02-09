package EqualsAndHashCode;

public class Test {

        public static void main(String[] args) {
                Person person1 = new Person("Vaishnav", 24, "007");
                Person person2 = new Person("Vaishnav", 24, "007");

                if(person1.equals(person2)){
                        System.out.println("T");
                } else{
                        System.out.println("F");
                }

        }

}
