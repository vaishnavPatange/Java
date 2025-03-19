package in.sorting.basics;

import in.sorting.Utility;

import java.util.Random;

public class InsertionSort {
        public static void main(String[] args) {
                int[] arr = new int[10];
                Random random = new Random();
                for (int i = 0; i < arr.length; i++) {
                        arr[i] = random.nextInt(10);
                }
                Utility.printArray(arr);
                insertionSort(arr);
                System.out.println();
                Utility.printArray(arr);
        }

        public static void insertionSort(int[] arr){
                for (int i=1; i< arr.length; i++){
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
