class MergeSortedArrays {

        public static void main(String[] args) {
                int[] arr1 = ArrayUtility.arrayInput();
                int[] arr2 = ArrayUtility.arrayInput();
                int[] mergedArray = mergeArrays(arr1, arr2);

                ArrayUtility.printArray(mergedArray);

        }

        public static int[] mergeArrays(int[] arr1, int[] arr2){
                int newSize = arr1.length + arr2.length;
                int[] mergedArray = new int[newSize];
                int i=0, j=0, k=0;
                while ( i < arr1.length || j < arr2.length){
                        if( j == arr2.length || (i < arr1.length && (arr1[i] < arr2[j])) ){
                                mergedArray[k] = arr1[i];
                                i++; k++;
                        } else{
                                mergedArray[k] = arr2[j];
                                j++; k++;
                        }
                }
                return mergedArray;

        }

}
