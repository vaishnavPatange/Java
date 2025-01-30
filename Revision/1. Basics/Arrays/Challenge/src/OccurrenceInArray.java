import java.util.Scanner;

class OccurrenceInArray {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int[] arr = ArrayUtility.arrayInput();
                System.out.print("Enter number you want to find occurrence of : ");
                int num = sc.nextInt();
                System.out.println ("The occurrences of given number are : " + noOccurenceInArray(arr, num));
        }

        public static int noOccurenceInArray(int[] arr, int num){
                if(arr.length == 1){
                        return 1;
                }
                int occurence = 0;
                for(int i=0; i<arr.length; i++){
                        if(arr[i] == num){
                                occurence++;
                        }
                }
                return occurence;
        }

}
