public class MultilevelInheritance {
    public static void main(String args[]){
        Dog Tommy = new Dog();
        Tommy.length();
    }
}

class AnimaL{
        String color;

        void eat(){
            System.out.println("This is animal meal type");
        }

        void length(){
            System.out.println("This is length of an animal");
        }
}

class Mammal extends AnimaL{
        int legs;
        void legs(){
            System.out.println("can walk");
        }
}

class Dog extends Mammal{
    String tongue;

    void Fourlengs(){
        System.out.println("Has four legs");
    }
} 

