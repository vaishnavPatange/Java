public class MultipleInheritance {
    public static void main(String args[]){
        Bear b = new Bear();
        b.leaves();
    }

}

interface Harbivore{
    void leaves();
    void noAgression();
}

interface Carnivore{
    
    void pointyTeeth();
    void longNails();
}

class Bear implements Harbivore, Carnivore{
    public void leaves(){
        System.out.println("eats leaves");
    }
    public void noAgression(){
        System.out.println("Has less Aression");
    }
    public void pointyTeeth(){
        System.out.println("Has long and ponty teeth");
    }
    public void longNails(){
        System.out.println("Has sharp and deadly nails");
    }
}
