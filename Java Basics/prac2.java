import java.util.*;
public class prac2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        /*1. + or -
        int number = sc.nextInt();
        if (number >= 0){
            System.out.println("The number is positive");
        } else {

            System.out.println("The number is negative");*/


        /*2 fever 
        double temp = 103.5;
        if (temp >= 100){
            System.out.println("You hava a fever");
        } else{
            System.out.println("You do not have fever");
        }*/

        /*3 weekdays
        System.out.println("Enter the day number :");
        int number = sc.nextInt();

        switch(number){
            case 1: System.out.println("Sunday");
            break;
            case 2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
            break;
            case 4: System.out.println("Wednesday");
            break;
            case 5: System.out.println("Thursday");
            break;
            case 6: System.out.println("Friday");
            break;
            case 7: System.out.println("Saturday");
            break;
            default: System.out.println("Enter number between 1 to 7 only");
        }*/

        //5 leap year
        long year = sc.nextLong();
        boolean leap;

        if(year%4 == 0){

            if(year%100 == 0){

                if(year%400 == 0){
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else{
            leap = false;
        }

        if(leap){
            System.out.println(year + "Year is leap year");
        } else{
            System.out.println(year + "Year is not leap year");
        }
    }
}