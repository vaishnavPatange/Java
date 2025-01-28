import java.util.*;
public class Binocoeff{

    public static int factorial(int a){
        int f = 1;
        for(int i=1; i<=a; i++){
            f = f*i;
        }
        return f;
    }

    public static int Cf(int n, int r){
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nmr = factorial(n-r);
        int cf = fac_n/(fac_r*fac_nmr);

        return cf;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println("The Binomial Coefficient : " + Cf(n,r));
    }
}