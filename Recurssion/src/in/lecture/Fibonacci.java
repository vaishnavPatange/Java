public class Fibonacci {
        public static void main(String[] args) {
                int num = 15;
                System.out.print(a + " " + b + " ");
                fibonacci(num - 2);
//                System.out.println(nthFibonacci(8));
        }

        static int a = 0;
        static int b = 1;
        static int nextNum;

        public static int nthFibonacci(int num){
                if(num == 1){
                        return 1;
                }
                if(num == 0){
                        return 0;
                }

                return nthFibonacci(num-1) + nthFibonacci(num-2);

        }

        public static void fibonacci(int givenNum){
                if(givenNum > 0){
                        nextNum = a + b;
                        a = b;
                        b = nextNum;
                        System.out.print(nextNum + " ");
                        fibonacci(givenNum - 1);
                }
                return ;
        }

}
