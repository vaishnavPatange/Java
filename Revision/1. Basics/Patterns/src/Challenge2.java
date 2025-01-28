import java.util.Scanner;

public class Challenge2 {

    public  static  void isLeapYear(int yr){

        boolean isFourDivisor = yr%4 == 0;
        boolean isHundredDivisor = yr%100 == 0;
        boolean isFourHundredDivisor = yr%400 == 0;

        if(isFourHundredDivisor){
            System.out.println(yr + " is a leap year");
        } else if ( isFourDivisor && !isHundredDivisor) {
            System.out.println(yr + " is a leap year");
        } else {
            System.out.println(yr + " is not a leap year");
        }

    }

    public static void grades(int percentage){

        if (percentage > 100){
            System.out.println("Please Enter valid percentage !");
            return;
        }

        if( percentage > 90){
            System.out.println("The grades are : A+" );
        } else if ( percentage > 75 ) {
            System.out.println("The grades are : A" );
        } else if ( percentage > 60 ) {
            System.out.println("The grades are : B" );
        }else if ( percentage > 30 ) {
            System.out.println("The grades are : C" );
        } else {
            System.out.println("Sorry, You have failed in exam! Your grade is D");
        }
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int percentage = sc.nextInt();

        grades(percentage);

        //        isLeapYear(2700);
    }
}
