import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        int[] arr = ArrayUtility.arrayInput();
        float arraySum = 0;
        for(int i=0; i<arr.length; i++){
            arraySum += arr[i];
        }
        System.out.println("Sum of array Elements is : " + (int)arraySum);
        System.out.println("Average of array elements is : " + (arraySum/arr.length));










         }
}