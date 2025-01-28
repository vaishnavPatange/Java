import java.util.*;
public class DecBin{
    public static int DecBin(int n){
        int num = n;
        int bin = 0;
        for(int pow = 0; n > 0; pow++){
            int rem = n % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            n = n/2;
        }
        return bin;
    }

    public static void main(String args[]){
        System.out.println(DecBin(5));
    }


}