package in.sorting.advanced;

import in.sorting.Utility;

import java.util.Arrays;

public class MergeSort{
        public static void main(String[] args){
                int[] arr = {4, 2,7, 19, 38, 193, 1};
                mergeSorting(arr);
                Utility.printArray(arr);
        }

       public static void mergeSorting(int[] arr){
                int length = arr.length;
                if(length < 2){
                        return;
                }
                int midIndex = length / 2;
                // instead of writing loops to add numbers in two arrays
               int[] leftArray = Arrays.copyOfRange(arr, 0, midIndex);
               int[] rightArray = Arrays.copyOfRange(arr, midIndex, length);

               mergeSorting(leftArray);
               mergeSorting(rightArray);

               merge(arr, leftArray, rightArray);
       }

       public static void merge(int[] arr, int[] leftArray, int[] rightArray){
                int leftLength = leftArray.length, rightLength = rightArray.length;
                int i=0, j=0, k=0;
                while(i < leftLength && j < rightLength){
                        if(leftArray[i] <= rightArray[j]){
                                arr[k] = leftArray[i];
                                i++; k++;
                        } else {
                             arr[k] = rightArray[j];
                             j++; k++;
                        }
                }
                while(i < leftLength){
                        arr[k] = leftArray[i];
                        i++; k++;
                }
                while(j < rightLength){
                        arr[k] = rightArray[j];
                        j++; k++;
                }
       }

}