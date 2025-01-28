import java.util.*;
public class input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // creating an array
        int marks[] = new int[150];

        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chm
        marks[2] = sc.nextInt(); // math

        System.out.println("phy : " + marks[0] + " |chm : " + marks[1] + " |maths : " + marks[2]);
        System.out.println("length of an array is : " + marks.length);
    }
}