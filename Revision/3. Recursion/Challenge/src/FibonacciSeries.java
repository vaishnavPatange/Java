import java.util.Scanner;

public class FibonacciSeries {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter you number up to which you want to print Fibonacci series");
                int num = sc.nextInt();
                for(int i=1; i<=num; i++){
                        System.out.print(fibonacci(i) + " ");
                }
        }

        public static int fibonacci(int num){
                if(num == 1){
                        return 0;
                }
                if(num == 2){
                        return 1;
                }
                return fibonacci( num -1) + fibonacci(num -2);

        }

}
