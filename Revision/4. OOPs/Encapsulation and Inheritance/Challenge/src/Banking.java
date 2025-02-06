import java.util.Scanner;

public class Banking {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                BankAccount customer1 = new BankAccount("Sanket Sureshrao Magar",
                        738233454, 1000);

                System.out.println("What Service you want to use\nThe services we currently provide are : ");
                System.out.println("1. deposit money to account\n2. withdraw money from account\n3. fetch account balance");
                System.out.println("Enter the number of service you want to use : ");
                int input = sc.nextInt();
                if(input == 1){
                        System.out.println("Enter the amount you want to deposit : ");
                        long amount = sc.nextLong();
                        customer1.deposit(amount);
                        System.out.println("Do you want to see your current balance");
                        String  action = sc.next();
                        if(action.equals("yes")){
                                System.out.println(customer1.getBalance());
                        } else{
                                System.out.println("Thank you !");
                        }
                } else if (input == 2) {
                        System.out.println("Enter the amount you want to withdraw : ");
                        long amount = sc.nextLong();
                        boolean res = customer1.withdraw(amount);
                        if(!res){
                                System.out.println("Do you want to see your current balance");
                                String action = sc.next();
                                if(action.equals("y")){
                                        customer1.getBalance();
                                } else{
                                        System.out.println("Thank you !");
                                }
                        }

                } else if (input == 3) {
                        System.out.println("Your account balance is : " + customer1.getBalance());
                }
        }
}
