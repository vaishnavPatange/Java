import java.util.Scanner;

public class challenge {

    public static void prodFloatingNum(float a, float b) {
        System.out.println( " Product of two floating numbers is : " + ( a * b ));
    }
    
    public  static  void  perimeterRectangle(int a,int b,int c,int d){
        System.out.println(" Perimeter of given Rectangle is : "  +  (a + b+ c + d));
    }
    
    public static void areaTriangle(float b, float h){

        float area = 0.5f * b * h;

        System.out.println("Area of Triangle is : " + area );
    }
    
    public static void simpleInterest(int p, float r, int t){
        float si = (p * r * t) / 100 ;

        System.out.println("Simple Intrest is : " + si);
        
    }

    public  static void compundInterest(int p, float r, int t){
        float ci = p * (1 + (r/100)) * t ;
        System.out.println("Compund Interest is : " + ci);
    }

    public static void fahrenheitToCelcius(float f){
        float num = (float) 5 /9;
        System.out.println(num);
        float c = (f -32) *  num ;
        System.out.println("The C temperature = " + c + "of F temperature = " + f);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Fahrenheit temperature");
        float f = sc.nextFloat();

        fahrenheitToCelcius(f);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        int p = sc.nextInt();
//        int t = sc.nextInt();
//        float r = sc.nextFloat();
//
//        compundInterest(p, r, t);

//        simpleInterest(p, r, t);

//        areaTriangle(b, h);

//        perimeterRectangle(a,b, c, d);

//        prodFloatingNum(a, b);

//        System.out.println(" a + b = "+ (a + b));
//        System.out.println(" a * b = "+ (a * b));
//        System.out.println(" a - b = "+ (a - b));
//        System.out.println(" a / b = "+ (a / b));
//        System.out.println(" a % b = "+ (a % b));

    }
}
