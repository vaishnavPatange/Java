class PalindromeArray {
        public static void main(String[] args) {
                int[] arr = ArrayUtility.arrayInput();
                if(isPalindrome(arr)){
                        System.out.println("Given array is Palindrome");
                } else {
                        System.out.println("Given array is not Palindrome");
                }
        }

        public static boolean isPalindrome(int[] arr){
                int i=0, j=arr.length-1;
                while (i <= j){
                        if(arr[i] != arr[j]){
                                return false;
                        }
                        i++; j--;
                }
                return true;
        }

}
