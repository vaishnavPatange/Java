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

      public static int[][] twoDArrayInput(){
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter the dimensions of 2D array : ");
              int rows = sc.nextInt();
              int columns = sc.nextInt();
              int[][] twoDArray = new int[rows][columns];
              for(int i=0; i<rows ; i++){
                      System.out.println("Enter the " + (i+1) + " set of elements : ");
                      for(int j=0; j<columns; j++){
                              twoDArray[i][j] =  sc.nextInt();
                      }
              }
              return twoDArray;
      }

      public static void print2DArray(int[][] twoDArray){
              for(int i=0; i< twoDArray.length; i++){
                      for(int j=0; j< twoDArray[i].length ; j++){
                              System.out.print(twoDArray[i][j] + " ");
                      }
                      System.out.println();
              }
      }

      public static void printArray(int[] arr){
              System.out.print("[ ");
              for(int i=0; i< arr.length; i++){
                      System.out.print(arr[i] + " ");
              }
              System.out.print(" ]");
      }

}