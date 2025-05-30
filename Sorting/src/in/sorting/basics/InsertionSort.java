package in.sorting.basics;

import in.sorting.Utility;

public class InsertionSort {
        public static void main(String[] args){
                int[] arr = {2, 5, 1, 5, 34, 19, 10, 1};
                insertionSorting(arr);
                Utility.printArray(arr);
        }

        public static void insertionSorting(int[] arr){
                for (int i = 1; i < arr.length; i++) {
                        int curr = arr[i];
                        int prev = i-1;
                        while(prev >= 0 && arr[prev] > curr){
                                arr[prev+1] = arr[prev];
                                prev--;
                        }
                        arr[prev+1] = curr;
                }
        }

}