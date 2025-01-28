public class MergeSort{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSorting(int arr[], int si, int ei){
        // base case
        if(si >= ei){
            return;
        }
        // first find mid
        int mid = si +(ei - si)/2; // or (si + ei)/2
        // for left part
        mergeSorting(arr, si, mid);
        // for right part
        mergeSorting(arr, mid+1, ei);

        // to merge the left and right 
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid , int ei){
        int temp[] = new int[ei-si+1];
        // iterator for left
        int i = si;
        // iterator for right
        int j = mid+1;
        // iterator for temp
        int k = 0;
        // to merge the left and right
        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
                //i++; //k++;
            } else {
                temp[k++] = arr[j++];
                //j++; //k++;
            }
            //k++;
        }

        // for remaining elements in left
        while(i <= mid){
            temp[k++] = arr[i++]; // i++ and k++ instead of writing seperate down 
        }

        // for remaining elements in right
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // copy elements from temp to original arr
        for(k =0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String args[]){
        int arr[] = {2, 2, 7, 5, 8, 1, -1, 23, 7};
        mergeSorting(arr, 0, arr.length-1);
        printArr(arr);
    }
}