import java.util.Scanner;

class GuessNumber {
        public static void main(String[] args) {
                System.out.println("Welcome to guess the number game!! \nplease enter number between 10 to 60");
                int num = 35;
                guessNum(num);
        }

        public static void guessNum(int num){
                do{
                        Scanner sc = new Scanner(System.in);
                        System.out.print("Enter you number : ");
                        int num2 = sc.nextInt();
                        if(num == num2){
                                break;
                        }
                        System.out.println("Wrong guess, plz try again !!!");
                }while (true);
                System.out.println("You guessed it right the num is : " + num);
        }

}
