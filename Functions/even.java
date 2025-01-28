import java.util.*;
public class even{
    public static boolean isEven(int b){
        if(b % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isEven(num));
    }
}