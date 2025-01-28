import java.util.*;
public class invert{
    public static void inv(int R){
        int r = R;
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        inv(5);
    }
}