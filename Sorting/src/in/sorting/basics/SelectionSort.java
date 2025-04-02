package in.sorting.basics;

import in.sorting.Utility;

public class SelectionSort {
        public static void main(String[] args){
                int[] arr = {2, 1, 5, 2, 5, 1, 8,20};
                selectionSorting(arr);
                Utility.printArray(arr);
        }

        public static void selectionSorting(int[] arr){
                for(int i=0; i< arr.length-1; i++){
                        int minPos = i+1;
                        for (int j=i; j< arr.length; j++){
                                if(arr[minPos] > arr[j]){
                                        minPos = j;
                                }
                        }
                        int temp = arr[i];
                        arr[i] = arr[minPos];
                        arr[minPos] = temp;
                }
        }

}