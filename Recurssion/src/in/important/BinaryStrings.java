package in.important;
// Paytm
public class BinaryStrings {
        public static void main(String[] args) {
                printBinaryString(3, 0, "");
        }

        public static void printBinaryString(int num, int lastPlace, String str){
                if(num == 0){
                        System.out.println(str);
                        return;
                }
                printBinaryString(num - 1, 0, str+"0");
                if(lastPlace == 0){
                        printBinaryString(num-1, 1, str+"1");
                }
        }

}
