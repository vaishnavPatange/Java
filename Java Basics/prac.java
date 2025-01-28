/* type coversion in java
import java.util.*;
public class prac{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = 45;
        int b =(int) a; // This is type casting
        // and int a = 45;
        // float b = a ; 
        // this will be type conversion
        System.out.println(b);
    }
}*/
/*import java.util.*;
public class prac{
    public static void main(String args[]){
        /*1.
        char a = 'A';
        char b = 'B';
        int c = b-a;
        System.out.println((int) (a));
        System.out.println((int) (b));
        System.out.println(c);*/

       /*2 
        float a = 67.562f;
        int b = (int) a;
        System.out.println(b);*/

       /* char a = 'G';
        char b = 'H';
        System.out.println((int)a);
        System.out.println((int)b);


    }
}*/

import java.util.*;
public class prac{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int alpha = sc.nextInt();

        switch(alpha){
            case 1: System.out.println("YOOO");
            break;

            case 2: System.out.println("LALALAAL");
            break;

            case 3: System.out.println("hiii");
            break;

            default : System.out.println("invalid credentials"); 
        } 
    }
}