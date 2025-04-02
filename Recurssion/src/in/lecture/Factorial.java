package in.lecture;

public class Factorial {
        public static void main(String[] args) {
                System.out.printf("in.lecture.Factorial of %d is %d", 50,fact(50));
        }

        public static long fact(long num){
                if(num <= 1){
                        return 1;
                }

                return num * fact(num - 1);

        }

}
