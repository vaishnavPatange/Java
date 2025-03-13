class DigitSum {
        public static void main(String[] args) {
                int num1 = 3892047;

                System.out.println(recurDigitSum(0, num1));
                int sum = 0;
                for(int i =0; i>=0; i++){
                        if(num1 == 0) break;
                        int digit = num1 % 10;
                        sum += digit;
                        num1 /= 10;
                }
                System.out.println(sum);
        }

        public static int recurDigitSum(int sum, int num){
               if(num==0) return sum;

               int digit = num % 10;
                sum += digit;
                return recurDigitSum(sum, num/10);
        }

}
