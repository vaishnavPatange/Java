import java.util.*;
public class BInDec{
    public static void binToDec(int num){
        int num1 = num;
        int pow = 0;
        int dec = 0;

        while(num > 0){
            int lastdigit = num % 10;
            dec = dec + (lastdigit * (int)Math.pow(2 , pow));
            pow++;
            num /= 10;
        }
        System.out.println("The decimal of " + num1 + " = "+ dec);
    }

    public static void main(String args[]){
        binToDec(10110);
    }
}