import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Main newMain = new Main();

                newMain.grades();

//                newMain.absoluteValue();

//                newMain.oddOrEven();

//                newMain.smallestNum();

        }

        public void grades(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Marks : ");
                int num1 = sc.nextInt();
                String Grades = num1 >= 80 && num1 <101 ? "High Score" : ( num1 < 80 && num1 >= 50) ? "Moderate" : num1 < 50 ? "Low" : "Please enter valid marks";
                System.out.println("The Obtained grades are : " + Grades);
        }


        public void absoluteValue(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number : ");
                int num1 = sc.nextInt();
                int value = num1 < 0 ? ~num1+1 : num1;
                System.out.println("The Absolute value of number is : " + value);
        }

        public void oddOrEven(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number : ");
                int num1 = sc.nextInt();
                boolean isEven = num1 % 2 == 0;
                if(isEven){
                        System.out.println("The number is Even number");
                } else{
                        System.out.println("The number is Odd number");
                }
        }

        public void smallestNum(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter two numbers to compare : ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                int smallest = num1<num2 ? num1 : num2;
                System.out.println("The Smallest number is : " + smallest);
        }


}