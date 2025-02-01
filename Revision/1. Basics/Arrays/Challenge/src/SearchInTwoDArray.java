import java.util.Scanner;

class SearchInTwoDArray {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
               int[][] arr = ArrayUtility.twoDArrayInput();
               System.out.println("Enter number you want to find: ");
               int num = sc.nextInt();
               int[] posArray =    search(num, arr);
               System.out.println("Your element was found at : { " + posArray[0] + ", " + posArray[1] + " }");
        }

        public static int[] search(int num, int[][] arr){
                int[] posArray = new int[2];
                for(int i=0; i<arr.length; i++){
                        for(int j=0; j < arr[0].length; j++){
                                if(arr[i][j] == num){
                                        posArray[0] = i + 1;
                                        posArray[1] = j + 1;
                                }
                        }
                }
                return posArray;
        }
}
