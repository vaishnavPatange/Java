import java.util.*;
public class prac{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddsum = 0;

        do{
            System.out.println("Enter a number: ");
            number = sc.nextInt();
            if (number%2 == 0){
                evenSum += number;    
            } else {
                oddsum += number;
            }
            System.out.println("Enter 1 to continue and 0 to stop :");
            choice = sc.nextInt();
        } while(choice == 1);
     System.out.println("sum of even numbers is : " + evenSum);
     System.out.println("sum of odd numbers is : " + oddsum);
    }
}