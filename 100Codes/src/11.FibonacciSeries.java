import java.util.Scanner;

class FibonacciSeries {
        public static void main(String[] args) {
                int num = 15;
                for (int i = 1; i <= num; i++) {
                        System.out.print(fibonacciRecurs(i) + " ");
                }
        }

        public static int fibonacciRecurs(int num){
                if(num == 1){
                        return 0;
                }
                if(num == 2){
                        return 1;
                }

                return fibonacciRecurs(num-1) + fibonacciRecurs(num-2);
        }

        public static void fibonacciIter(){
                int num = 15;
                int a = 0; int b = 1;
                System.out.print(a + " " + b + " ");
                int nextNum;
                for (int i = 0; i<num ; i++) {
                        nextNum = a + b;
                        System.out.print(nextNum + " ");
                        a = b;
                        b = nextNum;
                }

        }


}
