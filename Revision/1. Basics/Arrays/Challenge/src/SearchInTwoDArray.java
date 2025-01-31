import java.util.Scanner;

class SearchInTwoDArray {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
               int[][] arr = ArrayUtility.twoDArrayInput();
                search
        }

        public static int[] search(int num, int[][] arr){
                int[] posArray = new int[2];
                for(int i=0; i<arr.length; i++){
                        for(int j=0; j < arr[0].length; j++){
                                if(arr[i][j] == num){
                                        posArray[0] = i;
                                        posArray[1] = j;
                                }
                        }
                }
                return posArray;
        }
}
