import java.util.*;
public class que{
    public static void main(String args[]){
        /*1
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        int avg = (a + b + v)/3;
        System.out.print("The average of given numbers is: ");
        System.out.println(avg);*/

        /*2
        Scanner vi = new Scanner(System.in);
        int side = vi.nextInt();
        int area = side*side;
        System.out.println(area);*/

        
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();

        float sum = (pen + pencil + eraser);
        float TotalAmount = (sum)+(sum*18)/100;
        System.out.println("pen = " + pen);
        
        System.out.println("pencil = " + pencil);
        
        System.out.println("eraser = " + eraser);
        
        System.out.println("The total amount + 18% GST = " + TotalAmount);
        

        /*4
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f*b)+(i%c)-(d*s);
        System.out.println(result);*/

        //int $ = 24;
        //System.out.print($);
        
    }
}