import java.util.Scanner;

class ArmInRange {
        public static void main(String[] args) {
                long start = System.currentTimeMillis();
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter range ");
                System.out.print("From ");
                Integer low = sc.nextInt();
                System.out.print(" To ");
                Integer high = sc.nextInt();
                for (int i = low; i < high; i++) {
                        if (isArmstrong(i)){
                                System.out.print(i + " ");
                        }
                }
                long end = System.currentTimeMillis();
                System.out.println(end-start);
        }

        public static boolean isArmstrong(Integer num){
                int numC = num;
                String numStr = num.toString();
                int numSum = 0 ;
                for (int i = 0; i < numStr.length(); i++) {
                        int digit = num%10;
                        numSum += (int)Math.pow(digit, numStr.length());
                        num/=10;
                }

                return numC == numSum;
        }

}
