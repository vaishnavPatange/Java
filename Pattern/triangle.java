import java.util.*;
public class triangle{
    public static void tri(int r){
        //for line
        for(int i=1; i<=r; i++){
            //for spaces
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        tri(5);
    }
}