package in.sorting.advanced;
import in.sorting.Utility;
import java.util.Random;

public class QuickSort {
        public static void main(String[] args) {
                int[] arr = new int[10];
                Random random = new Random();
                for (int i = 0; i < arr.length; i++) {
                        arr[i] = random.nextInt(100);
                }
                Utility.printArray(arr);
                quickSort(arr, 0, arr.length - 1);
                System.out.println();
                Utility.printArray(arr);
        }

        public static void quickSort(int[] arr, int lowIndex, int highIndex){
                if(lowIndex >= highIndex){
                        return;
                }

                int pivot = arr[highIndex];
                int pivIndex = partition(arr, lowIndex, highIndex,pivot);

                quickSort(arr, lowIndex, pivIndex - 1);
                quickSort(arr, pivIndex + 1, highIndex);

        }

        public static int partition(int[] arr, int lowIndex, int highIndex, int pivot){
                int leftIndex = lowIndex;
                int rightIndex = highIndex - 1;
                while(leftIndex <= rightIndex){
                        while(leftIndex <= rightIndex && arr[leftIndex]  <= pivot){
                                leftIndex++;
                        }
                        while(leftIndex <= rightIndex && arr[rightIndex] >= pivot){
                                rightIndex--;
                        }
                        if(leftIndex <= rightIndex){
                                swap(arr, leftIndex, rightIndex);
                                leftIndex++; rightIndex--;
                        }
                }
                swap(arr, leftIndex, highIndex);
                return leftIndex;
        }

        public static void swap(int[] arr, int a, int b){
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
        }

}
