class ReverseNumber {
        public static void main(String[] args) {
                int num = 123739;
                int num2 = -123567;
//                System.out.println( reverseNum(num, 0));
//                reverseNum2(num);
                if(num2 < 0){
                        System.out.print("-");
                        num2 = num2 * -1;
                }
                reverseNum2(num2);

        }

        public static int reverseNum(int num, int reverseNum){
                if(num == 0) return reverseNum;
                reverseNum = reverseNum * 10 + num%10;
                return reverseNum(num/10, reverseNum);
        }

        public static void reverseNum2(int num){
                if(num == 0) return;
                System.out.print(num%10);
                reverseNum2(num/10);
        }


}
