package in.sorting.advanced;

import in.sorting.Utility;

public class MergeSort{
        public static void main(String[] args){
                int[] arr = {4, 2,7, 19, 38, 193, 1};
                mergeSorting(arr);
                Utility.printArray(arr);
        }

        public static void mergeSorting(int[] arr){
                int arrLength = arr.length;
                if(arrLength < 2){
                        return;
                }
                int midIdx = arrLength/2;
                int[] leftArray = new int[midIdx];
                int[] rightArray = new int[arrLength - midIdx];

                for (int i = 0; i < midIdx; i++) {
                        leftArray[i] = arr[i];
                }
                for (int i=midIdx; i<arrLength; i++){
                        rightArray[i-midIdx] = arr[i];
                }
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
                              i++;
                      } else {
                              arr[k]  = rightArray[j];
                              j++;
                      }
                      k++;
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