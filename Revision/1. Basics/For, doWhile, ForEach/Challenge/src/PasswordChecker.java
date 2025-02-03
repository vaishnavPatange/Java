import java.util.Scanner;

public class PasswordChecker {
        public static void main(String[] args) {
                isPasswordCorrect();
        }

        public static void isPasswordCorrect(){
                String password = "Vaishnav@2002";
                Scanner sc = new Scanner(System.in);
                int attempts = 1;
                do{
                        System.out.print("Enter you password : ");
                        String enteredPass = sc.nextLine();
                        if(enteredPass.equals(password)){
                                System.out.println("Entered Password is Correct !");
                                System.out.println("Welcome !!!");
                                break;
                        }
                        System.out.println("Ooops ! You entered wrong password, Plz try again!!");
                        attempts++;
                }while (attempts < 5);

                System.out.println("You reached limit !!! plz try again after sometime");
        }

}