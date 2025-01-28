import java.util.*;
public class sumDigit{

    public static int sumdigit(int number){
        int SumOfDigit = 0;
        while(number != 0){
            int lastdigit = number % 10;
            SumOfDigit = SumOfDigit + lastdigit;
            number/= 10;
        }
        return SumOfDigit;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The sum of digit of number : " + sumdigit(num));
    }
}