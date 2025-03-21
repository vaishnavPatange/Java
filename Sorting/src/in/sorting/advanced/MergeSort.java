package in.sorting.advanced;

import in.sorting.Utility;

import java.util.Random;

public class MergeSort {
        public static void main(String[] args) {
                int[] arr = new int[1000000000];
                Random random = new Random();
                for (int i = 0; i < arr.length; i++) {
                        arr[i] = random.nextInt(10000);
                }
//                Utility.printArray(arr);
                System.out.println("before");
                long start = System.currentTimeMillis();
                mergeSort(arr);
                long end = System.currentTimeMillis();
                System.out.println("after");
                System.out.println("Time in millis " + (end - start));
//                Utility.printArray(arr);

        }

        public static void mergeSort(int[] arr){
                int arrLength = arr.length;

                if(arrLength < 2){
                        return;
                }

                int mid = arrLength/2;
                int[] leftArray = new int[mid];
                int[] rightArray = new int[arrLength - mid];

                for (int i = 0; i < mid; i++) {
                        leftArray[i] = arr[i];
                }
                for(int j=mid; j<arrLength; j++){
                        rightArray[j - mid] = arr[j];
                }

                mergeSort(leftArray);
                mergeSort(rightArray);

                merge(arr, leftArray, rightArray);

        }

        public static void merge(int[] arr, int[] leftArray, int[] rightArray){
                int leftLength = leftArray.length;
                int rightLength = rightArray.length;

                int i=0, j=0, k=0;
                while(i < leftLength && j < rightLength){
                        if(leftArray[i] <= rightArray[j]){
                                arr[k] = leftArray[i];
                                i++;
                        } else{
                                arr[k] = rightArray[j];
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
                        k++; j++;
                }

        }

}
