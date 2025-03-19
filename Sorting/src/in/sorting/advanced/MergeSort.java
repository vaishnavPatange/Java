package in.sorting.advanced;

import in.sorting.Utility;

public class MergeSort {
        public static void main(String[] args) {
                int[] arr = {9, 8,1,2,3,4,6,5,7};
                Utility.printArray(arr);
                mergeSort(arr);
                System.out.println();
                Utility.printArray(arr);
        }

        public static void mergeSort(int[] inputArray){
                int inputLength = inputArray.length;
                if(inputLength <= 1){  // base case
                        return;
                }

                int midIndex = inputLength/2;  // getting mid
                int[] leftArray = new int[midIndex];  // creating left Array
                int[] rightArray = new int[inputLength - midIndex];  // creating right Array

                for (int i = 0; i < midIndex; i++) { // adding elements leftArray
                        leftArray[i] = inputArray[i];
                }  for(int i=midIndex; i<inputLength; i++){ // adding elements rightArray
                        rightArray[i - midIndex] = inputArray[i];
                }

                mergeSort(leftArray);  // recursive call on left Array
                mergeSort(rightArray); // recursive call on right Array

                merge(leftArray, rightArray, inputArray);

        }

        public static void merge(int[] leftArray, int[] rightArray, int[] inputArray){
                int leftLength = leftArray.length;
                int rightLength = rightArray.length;

                int i=0, j=0, k=0;
                while( i < leftLength && j < rightLength){
                        if(leftArray[i] <= rightArray[j]){
                                inputArray[k] = leftArray[i];
                                i++;
                        } else {
                                inputArray[k] = rightArray[j];
                                j++;
                        }
                        k++;
                }

                while ( i < leftLength){
                        inputArray[k] = leftArray[i];
                        i++; k++;
                }

                while ( j < rightLength){
                        inputArray[k] = rightArray[j];
                        j++; k++;
                }

        }


}
