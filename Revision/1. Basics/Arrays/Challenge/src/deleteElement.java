import java.util.Scanner;

class deleteElement {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int[] arr = ArrayUtility.arrayInput();
                System.out.print("Enter the number you want to delete : ");
                int num = sc.nextInt();

                ArrayUtility.printArray(deleteElement(arr, num));

        }

        public static int[] deleteElement(int[] arr, int num){
                int occ = OccurrenceInArray.noOccurenceInArray(arr, num);
                int[] updatedArray = new int[arr.length - occ];
                int j=0;
                for(int i=0; i<arr.length ; i++){
                        if( arr[i] != num){
                                updatedArray[j] = arr[i];
                                j++;
                        }
                }
                return updatedArray;
        }



}
