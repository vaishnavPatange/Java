public class MethodOver {
    public static void main(String args[]){
        Deer dr = new Deer();
        dr.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eates Everything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats only Grass");
    }
}
