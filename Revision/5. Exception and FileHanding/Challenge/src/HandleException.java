import java.util.Scanner;

public class HandleException {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter first num: ");
                int num1 = sc.nextInt();
                System.out.print("Enter second num: ");
                int num2 = sc.nextInt();

                try {
                        System.out.println(num1/num2);
                } catch (ArithmeticException e){
                        System.out.println(e.getMessage());
                }

        }
}
