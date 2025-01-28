public class Absract {
    public static void main(String args[]){
        BullDog bd = new BullDog();
    }
}

abstract class Animal{ // can not create an object
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
    void eat(){
        System.out.println("Eats everything");
    }

    abstract void legs();
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog constructor is called");
    }
    
    void changeColor(){
        color = "black";
    }
    
    void legs(){
        System.out.println("Has four legs");
    }

}

class BullDog extends Dog{
    BullDog(){
        System.out.println("BullDog constructor is called");
    }
}

class Human extends Animal{
    
    void changeColor(){
        color = "white";
    }

    void legs(){
        System.out.println("Has two legs");
    }
}
