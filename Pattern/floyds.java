import java.util.*;
public class floyds{
    public static void floyds_Pyramid(int R){
        int counter = 1;
        int i = 1;
        while(i<=R){
            int j = 1;
            while(j<=i){
                System.out.print(counter+ " ");
                counter++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String args[]){
        floyds_Pyramid(6);
    }
}