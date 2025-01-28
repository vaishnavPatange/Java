import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int arraySize = sc.nextInt();
        System.out.println("\n Enter the number in serial order : ");
        int[] arr = new int[arraySize];
        for(int i=0; i<arraySize; i++){
            arr[i] = sc.nextInt();
        }
        float arraySum = 0;
        for(int i=0; i<arr.length; i++){
            arraySum += arr[i];
        }
        System.out.println("Sum of array Elements is : " + arraySum);
        System.out.println("Average of array elements is : " + (arraySum/arraySize));










         }
}