import java.util.Scanner;

public class ChallengeBitWise {

    /**
     * This method is taking num as a parameter and
     * printing if the num is even or odd
     * @param num
     */
    public static void oddEvenBitWise(int num) {
        if ((num & 1) == 1){
            System.out.println(num + " is an Odd number");
        } else{
            System.out.println(num + " is an Even number");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rep = 0;
        while (rep < 5){
            System.out.print("Enter a number : ");
            int num  = sc.nextInt();
            oddEvenBitWise(num);
            rep++;
        }


//        System.out.println("Let's see how BitWise Operators works . Enter two numbers");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number : ");
//        int num1  = sc.nextInt();
//        System.out.println("Enter second number : ");
//        int num2  = sc.nextInt();
//        int ans = num1 << num2;
//
//        System.out.println(num1 + " << " + num2 + " = " + ans );

    }

}
