import java.util.Scanner;

public class AreaAndCircumference {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the radius of the circle : ");
                float rad = sc.nextFloat();

                double area = Math.PI * Math.pow(rad, 2);
                float circumference = (float) (2 * Math.PI * rad);

                System.out.printf("The are of circle is : %f cm2 and circumference is : %f cm", area, circumference);

        }
}
