import java.util.Scanner;

class Factorial {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter num for factorial: ");
                int num = sc.nextInt();
                long fact = 1;
                System.out.println(factRecursive(num, fact, 1));
        }

        static long factRecursive(int num, long fact, int iter){
                if(iter == num){
                        return fact;
                }
                fact*= iter;
                return factRecursive(num, fact, iter++);
        }

        static void factIterative(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter num for factorial: ");
                int num = sc.nextInt();
                long fact = 1;
                for (int i = 1; i <= num; i++) {
                        fact *= i;
                }
                System.out.println(fact);
        }

}
