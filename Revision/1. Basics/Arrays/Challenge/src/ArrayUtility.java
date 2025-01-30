import java.util.Scanner;

class ArrayUtility {
      public static int[] arrayInput(){
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter size of array : ");
              int arraySize = sc.nextInt();
              int[] arr = new int[arraySize];
              for(int i=0; i<arraySize; i++){
                      System.out.print("Please enter elements number " +  (i+1) + " : ");
                      arr[i] = sc.nextInt();
              }

              return arr;
      }
}