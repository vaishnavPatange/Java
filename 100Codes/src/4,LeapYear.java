import java.util.Scanner;

class LeapYear {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter year below: ");
                int yr = sc.nextInt();
                if(yr % 100 == 0){
                        if(yr % 400 == 0) System.out.println("Leap Year");
                        else System.out.println("Not Leap Year");
                } else if (yr % 4 == 0) {
                        System.out.println("Leap Year");
                } else System.out.println("Not Leap Year");
        }
}
