 class ReverseArray {
         public static void main(String[] args) {
                 int[] arr = ArrayUtility.arrayInput();
                ArrayUtility.printArray( reverseArray(arr));
         }

         public static int[] reverseArray(int[] arr){
                 int i =0, j= arr.length-1;
                 while( i <= j){
                         int temp = arr[i];
                         arr[i] = arr[j];
                         arr[j] = temp;
                         i++; j--;
                 }
                 return arr;
         }
}
