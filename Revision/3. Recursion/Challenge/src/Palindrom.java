import java.util.Scanner;

class Palindrom {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter you name: ");
                String name = sc.next();

                System.out.println("Your name is " + (isPalindrome(name) ? "Palindrome" : "Not Palindrome"));

        }

        public static boolean isPalindrome(String str){
                if(str.length() == 1){
                        return true;
                }
                int lastPosition = str.length() -1 ;
                if(str.charAt(0) != str.charAt(lastPosition)){
                        return false;
                }
                String newStr = str.substring(1, lastPosition);
                return isPalindrome(newStr);
        }

}
