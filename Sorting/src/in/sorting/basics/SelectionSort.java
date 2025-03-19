package in.sorting.basics;

import in.sorting.Utility;

import java.util.Random;

public class SelectionSort {
        public static void main(String[] args) {
                int[] arr = new int[10];
                Random random = new Random();
                for (int i = 0; i < arr.length; i++) {
                        arr[i] = random.nextInt(1000);
                }
                Utility.printArray(arr);
                selectionSort(arr);
                System.out.println();
                Utility.printArray(arr);
        }

        public static void selectionSort(int[] arr){
                int length = arr.length;
                for (int i = 0; i < length - 1 ; i++) {
                        int minPos = i;
                        for (int j = i+1; j < length; j++) {
                                if(arr[j] < arr[minPos]){
                                        minPos = j;
                                }
                        }
                        int temp = arr[i];
                        arr[i] = arr[minPos];
                        arr[minPos] = temp;
                }
        }

}
