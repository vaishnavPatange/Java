import java.util.Scanner;

public class ChallengeFucntions {

    public static int getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        return sc.nextInt();
    }

    public static void multiTable(int num){
        System.out.println("Table of " + num + " is ");
        for(int i=1; i<=10; i++){
            System.out.println(num * i);
        }
    }

    public static void oddSum(int num){
        int sum = 0;

        for(int i=1; i<=num; i+=2){
            sum += i;
        }
        System.out.println("The Odd number sum up to " + num + " is : " + sum);
    }

    public static void numFactorial(int  num){
        long factorial = 1;
        for(int i=num; i >= 1; i--){
            factorial *= i;
        }
        System.out.println("The Factorial of  " + num + " is : " + factorial);
    }

    public static void digitSum(int num){
        int givenNum = num;
        if(num < 0){
            num = ~num + 1;
        }
        int sum = 0;
        while( num > 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The digit sum of " + givenNum + " is : " + sum);
    }

    public static  boolean isPrimeNum(int num){
        for(int i=2; i<=(num/2); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static  void reverseNum(int num){
        int givenNum = num;
        int reverseNum = 0;
        while(num > 0){
            int val = num % 10;
            reverseNum = reverseNum * 10 + val;
            num /= 10;
        }
        System.out.println("The reverse of " + givenNum + " is : " + reverseNum);
    }

    public static void lcm(int num1, int num2){
        if( num2 % num1 == 0){
            System.out.println("The LCM of " + num1 + " & " + num2 + " is : " + num2);
        } else{
            for (int i=1; i<=num2; i++){
                int prod = num1 * i;
                if(prod % num2 == 0){
                    System.out.println("The LCM of " + num1 + " & " + num2 + " is : " + prod);
                    break;
                }
            }
        }
    }

    public static void gcd(int num1, int num2){
        int gcd = 1;
        int i=2;
        while(i <= num1){
            if( num1 % i == 0 && num2 % i == 0){
                if( gcd < i){
                    gcd = i;
                }
            }
            i++;
        }
        System.out.println("The GCD is : " + gcd);

    }

    public static void fibonacciSeries(int num){
        if(num < 0) return;
        System.out.print( " 0 ");
        if(num == 0) return;

        System.out.print("1 ");

        int first =0, second=1;
        while(first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }


    }

    public  static void armStrongNum(int num){
        int givenNum = num;
        int compNum = givenNum;
        int firstDigit =0;
        while(num > 0){
            num/=10;
            firstDigit++;
        }
        int sum = 0;

        while(givenNum > 0){
            int digit = givenNum%10;
            int expoNum = 1;
            for(int i=0; i<firstDigit; i++){
                expoNum *= digit;
            }
            givenNum /= 10;
            sum += expoNum;
        }
        if(sum == compNum){
            System.out.println("num is a Armstrong number");
        }else{
            System.out.println("num is not Armstrong number");
        }


    }

    public static boolean isPalindrome(int num){
        int numCopy = num;
        int reverseNum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            reverseNum = reverseNum*10 + lastDigit;
            num/=10;
        }
        if(numCopy == reverseNum){
            return true;
        }
        return false;
    }


    public static void printLeftHalfPyramid(int maxRows) {
        System.out.println("\nHere is Left Half Pyramid");
        int rows = maxRows;
        while (rows > 0) {
            // this loop prints spaces
            int j = 0;
            while (j < rows - 1) {
                System.out.print("  ");
                j++;
            }

            // this loop prints stars
            int i = 0;
            while (i <= (maxRows-rows)) {
                System.out.print("*");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    public static void main(String[] args) {


        //       12. printLeftHalfPyramid(getInput());

        //       11. isPalindrome(getInput()

        //       10. armStrongNum(getInput());

        //        9.fibonacciSeries(getInput());

        //        int num = getInput(); int num1 = getInput();
        //      8.  gcd(num, num1);

        //   7.  lcm(num1, num2);

        //    6. reverseNum(getInput());

        /*5. if(isPrimeNum(getInput())){
            System.out.println("The num is prime number");
        } else {
            System.out.println("The num is not a prime number");
        }*/ // isPrime

        //        4. digitSum(getInput());

        //        3. numFactorial(getInput());

        //        2. oddSum(getInput());

        //       1. multiTable(getInput());
    }
}
