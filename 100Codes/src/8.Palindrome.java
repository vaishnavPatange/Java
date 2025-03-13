class Palindrome {
        public static void main(String[] args) {
                Integer num = 12321;
                if(num == revNum(num, 0)){
                        System.out.println("Palindrome");
                } else{
                        System.out.println("Not palindrome");
                }
                if(isPalindrome(num.toString())){
                        System.out.println("Palindrome");
                } else {
                        System.out.println("Not palindrome");
                }
        }

        public static int revNum(int num, int reverseNum){
                if(num == 0) return reverseNum;
                reverseNum = reverseNum * 10 + num%10;
                return revNum(num/10, reverseNum);
        }

        public static boolean isPalindrome(String num){
                StringBuilder str = new StringBuilder(num).reverse();
                if(str.toString().equals(num)){
                        return true;
                } else{
                        return false;
                }

        }

}
