public class HybridInheritance {
    public static void main(String args[]){
        Sparrow sp = new Sparrow();
        sp.eat();
        Reptiles rp = new Reptiles();
        rp.breath();
        Penguin pg = new Penguin();
        pg.barin();

    }
}

class Animal{ // Parent class
    String name;

    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breathes");
    }
}

class Bird extends Animal{ //Derived class 1
    String wings;
}

class Sparrow extends Bird{// Derived Class of 1
    String smallSize;
}

class Parrot extends Bird{ // Derived class of 1
    String color;
    
}

class Reptiles extends Animal{ // Derived class 2
    String Nolegs;
}

class Snake extends Reptiles{ // Derived class of 2
    int teeth;
}

class Mammal extends Animal{ // Derived class 3
    String brain;

    void barin(){
        System.out.println("Has developed brain");
    }
}

class Lion extends Mammal{ // Derived class of 3
    String tale;
}

class Penguin extends Mammal{ // Derived class of 3
    String swim; 
}
