import java.util.Scanner;
public class largest{
    public static void largestElement(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                largest = Math.max(largest, matrix[i][j]);
            }
        }
        System.out.println(largest);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int [3][3];
        // to take input
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        largestElement(matrix);

        // to print
        /*for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }*/

    }
}