package in.lecture;

public class PrintIncr {
        public static void main(String[] args) {
                printInIncreasing(15);
        }

        public static void printInIncreasing(int num){
                if(num < 1){
                        return;
                }

                printInIncreasing(num -1 );
                System.out.println(num);
        }

}
