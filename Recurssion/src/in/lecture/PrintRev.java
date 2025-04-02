package in.lecture;

public class PrintRev {
        public static void main(String[] args) {
                print(15);
        }

        public static void print(int num){
                if(num == 0){
                        return;
                }
                System.out.print(num + " ");
                print(num - 1);
        }
}