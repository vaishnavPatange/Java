import java.util.Scanner;

class ArmstrongNumber {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Integer num = sc.nextInt();
                int numC = num;
                String numStr = num.toString();
                int numSum = 0 ;
                for (int i = 0; i < numStr.length(); i++) {
                        int digit = num%10;
                        numSum += (int)Math.pow(digit, numStr.length());
                        num/=10;
                }

                if(numC == numSum){
                        System.out.println("Number is Armstrong number");
                } else{
                        System.out.println("Not an Armstrong number");
                }

        }
}
