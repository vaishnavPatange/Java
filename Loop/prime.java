import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = sc.nextLong();
        boolean isPrime = true;
        if(n == 2){
            System.out.println("number is prime");
        }
        else{
            for (long i = 2; i <=Math.sqrt(n); i++){
                    if(n%i == 0){
                        isPrime = false;
                    }
            }
            if (isPrime == true){
                System.out.println("number is prime");
            } else {
                System.out.println("number is not prime");
            }
        }

    }
}