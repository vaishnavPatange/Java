import java.util.*;
public class oneZero{
    public static void onezero(int r, int c){
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        onezero(5,5);
    }
}