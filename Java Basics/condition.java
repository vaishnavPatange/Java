import java.util.*;
public class condition{
    public static void main(String args[]){
        int A = 0, B = 0, C = 0;
        if((A >= B) && (A >= C)){
            System.out.println("A is largest");
        }
        else if (B >= C){
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is largest");
        }
    }
}