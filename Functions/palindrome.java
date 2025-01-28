import java.util.*;
public class palindrome{
    public static boolean palindrome(int num){
        int num1 = num;
        int palindrome = 0;

        for(int i = 1 ; num > 0; i++){
            int lastdigit = num % 10;
            palindrome = palindrome * 10 + lastdigit;
            num/= 10;
        }

        if(palindrome == num1){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (palindrome(num)){
            System.out.println(num + " Is Palindrome");
        } else{
            System.out.println(num + " Is not Palindrome");
        }
    }
}