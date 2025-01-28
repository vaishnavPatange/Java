public class QuickSort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quicksort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        
        int pIndex = partition(arr, si, ei);

        quicksort(arr, si, pIndex-1); // for left

        quicksort(arr, pIndex, ei); // for right
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // to make space for elements smaller than pivot

        for(int j = si; j<ei; j++){
            if(arr[j] < pivot){
                i++; 
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // to shift pivot to its position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String args[]){
        int arr[] = {2, 13, 7, 1, 8, 3, 9, 5};
        quicksort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
