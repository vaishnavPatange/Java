public class Inheritance {
    public static void main(String args[]){
        Fish s1 = new Fish();
        s1.eat();
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

    class Fish extends AnimaL{
        int fins;
        void fins(){
            System.out.println("The fins of fish are ......");
        }
    }
