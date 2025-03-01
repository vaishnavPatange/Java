import java.util.Scanner;

class MaxThreeNum {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter three numbers below : ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int num3 = sc.nextInt();
                int max = Math.max(num1, num2);
                max = Math.max(num3, max);
                System.out.println("Max number is  : " + max);

        }
}
