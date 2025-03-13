import java.util.Scanner;

class PrimeInRange {
         public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Enter your range : ");
                 System.out.println("Enter 1st no: ");
                 int num1 = sc.nextInt();
                 System.out.println("Enter 2nd no: ");
                 int num2 = sc.nextInt();

                 for(int i =num1; i<=num2; i++){
                         if(isPrime(i)) System.out.println(i + " ");
                 }

         }

         public static boolean isPrime(int num){
                 if(num <= 1) return false;

                 if(num % 2 == 0) return false;

                 for (int i = 3; i <= Math.sqrt(num); i+=2) {
                         if(num % i == 0) return false;
                 }

                 return true;

         }

}
