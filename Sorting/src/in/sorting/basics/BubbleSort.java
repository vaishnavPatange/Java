package in.sorting.basics;

import in.sorting.Utility;

public class BubbleSort {
        public static void main(String[] args) {
                int[] arr = {9, 8,1,2,3,4,6,5,7};
                bubbleSort(arr);
                Utility.printArray(arr);
        }

        public static void bubbleSort(int[] arr){
                int swap = 0;
                for (int i = 0; i < arr.length; i++) {
                        for(int j=0; j< arr.length-1; j++){
                                if(arr[j] > arr[j+1]){
                                        int temp = arr[j];
                                        arr[j] = arr[j+1];
                                        arr[j+1] = temp;
                                        swap++;
                                }
                        }
                        if(swap == 0){
                                System.out.println("Array already sorted");
                                return;
                        }
                }
        }

}