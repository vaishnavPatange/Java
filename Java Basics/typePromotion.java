import java.util.*;
public class typePromotion{
    public static void main(String args[]){
        /*1
        byte b = 6;
        byte a = (byte)(b*2);
        System.out.println(a);*/

        char a = 'a';
        byte b = 4;
        int c = 56;
        double d = 45.568;
        float e = 54.22f;
        long f = 5976;

        int sum = (int)(a + b + c + d + e + f);
        System.out.println(sum);
    }
}