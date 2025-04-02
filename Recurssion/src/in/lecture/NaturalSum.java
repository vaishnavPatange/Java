package in.lecture;

public class NaturalSum {
        public static void main(String[] args) {
                System.out.printf("Sum of first %d natural numbers is %d",51155,printNaturalSum(51155));
        }

        public static long printNaturalSum(int num){
                if(num == 1){
                        return 1;
                }
                return num + printNaturalSum(num - 1);
        }

}
