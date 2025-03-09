package in.varAgs;

public class VariableArguments {
        public static void main(String[] args) {
                System.out.println(sum(1, 4, 5, 6,7));
                System.out.println(sum(1, 4));
                System.out.println(sum(1, 4, 5));

        }
        // if func must get 2 parameters
//        public static int sum(int a, int b, int... c){
//                int sum = a+b;
//                for (int i : c) {
//                        sum += i;
//                }
//                return sum;
//        }


        public static int sum(int... a){
                int sum = 0;
                for (int i : a) {
                        sum += i;
                }
                return sum;
        }

}